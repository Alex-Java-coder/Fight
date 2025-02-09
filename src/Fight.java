public class Fight {

    RandomGenerator rand = new RandomGenerator();

    Human human = new Human();
    Ork ork = new Ork();
    Elf elf = new Elf();

    public void fight() {

        while (true) {
            // Генерация случайного числа для выбора персонажей
            int currentNumber = rand.nextIntVibor();

            switch (currentNumber) {
                case 1: // про человека

                    // выставляем для персонажей true или false
                    human.setIntoBattle(true);

                    currentNumber = rand.nextIntDva();

                    if (currentNumber == 0) {
                        ork.setIntoBattle(true);
                    } else {
                        elf.setIntoBattle(true);
                    }

                    //бой
                    if (ork.isIntoBattle() == true) { //если выбор на орка, то эта часть
                        while (human.getHealth() > 0 && ork.getHealth() > 0 || human.getHealth() == 0 && ork.getHealth() == 0) {
                            int hpHuman = human.getHealth();
                            int hpOrk = ork.getHealth();

                            hpOrk = ork.getHealth() - (human.getAttackPower() + rand.nextIntCrit());
                            ork.setHealth(hpOrk);
                            System.out.println(human.getName() + " атакует - " + ork.getName() + ". НР осталось - " + ork.getHealth());
                            hpHuman = human.getHealth() - (ork.getAttackPower() + rand.nextIntCrit());
                            human.setHealth(hpHuman);
                            System.out.println(ork.getName() + " атакует - " + human.getName() + ". НР осталось - " + human.getHealth());
                        }
                    } else { //а иначе бой с эльфом
                        while (human.getHealth() > 0 && elf.getHealth() > 0 || human.getHealth() == 0 && elf.getHealth() == 0) {
                            int hpHuman = human.getHealth();
                            int hpElf = elf.getHealth();

                            hpElf = elf.getHealth() - (human.getAttackPower() + rand.nextIntCrit());
                            elf.setHealth(hpElf);
                            System.out.println(human.getName() + " атакует - " + elf.getName() + ". НР осталось - " + elf.getHealth());
                            hpHuman = human.getHealth() - (elf.getAttackPower() + rand.nextIntCrit());
                            human.setHealth(hpHuman);
                            System.out.println(elf.getName() + " атакует - " + human.getName() + ". НР осталось - " + human.getHealth());
                        }
                    }

                    //у кого нр = 0, тот проиграл
                    if (human.getHealth() < 0 || human.getHealth() == 0) {
                        human.setIntoBattle(false);
                    } else {
                        human.setIntoBattle(true);
                    }

                    if (ork.getHealth() < 0 || ork.getHealth() == 0) {
                        ork.setIntoBattle(false);
                    } else {
                        ork.setIntoBattle(true);
                    }

                    if (elf.getHealth() < 0 || elf.getHealth() == 0) {
                        elf.setIntoBattle(false);
                    } else {
                        elf.setIntoBattle(true);
                    }

                    break;

                case 2: // про орка

                    // выставляем для персонажей true или false
                    ork.setIntoBattle(true);

                    currentNumber = rand.nextIntDva();

                    if (currentNumber == 0) {
                        human.setIntoBattle(true);
                    } else {
                        elf.setIntoBattle(true);
                    }

                    //бой
                    if (human.isIntoBattle() == true) { //если выбор на человека, то эта часть
                        while (ork.getHealth() > 0 && human.getHealth() > 0 || ork.getHealth() == 0 && human.getHealth() == 0) {
                            int hpHuman = human.getHealth();
                            int hpOrk = ork.getHealth();

                            hpHuman = human.getHealth() - (ork.getAttackPower() + rand.nextIntCrit());
                            human.setHealth(hpHuman);
                            System.out.println(ork.getName() + " атакует - " + human.getName() + ". НР осталось - " + human.getHealth());
                            hpOrk = ork.getHealth() - (human.getAttackPower() + rand.nextIntCrit());
                            ork.setHealth(hpOrk);
                            System.out.println(human.getName() + " атакует - " + ork.getName() + ". НР осталось - " + ork.getHealth());
                        }
                    } else { //а иначе бой с эльфом
                        while (ork.getHealth() > 0 && elf.getHealth() > 0 || ork.getHealth() == 0 && elf.getHealth() == 0) {
                            int hpOrk = ork.getHealth();
                            int hpElf = elf.getHealth();

                            hpElf = elf.getHealth() - (ork.getAttackPower() + rand.nextIntCrit());
                            elf.setHealth(hpElf);
                            System.out.println(ork.getName() + " атакует - " + elf.getName() + ". НР осталось - " + elf.getHealth());
                            hpOrk = ork.getHealth() - (elf.getAttackPower() + rand.nextIntCrit());
                            ork.setHealth(hpOrk);
                            System.out.println(elf.getName() + " атакует - " + ork.getName() + ". НР осталось - " + ork.getHealth());
                        }
                    }

                    //у кого нр = 0, тот проиграл
                    if (human.getHealth() < 0 || human.getHealth() == 0) {
                        human.setIntoBattle(false);
                    } else {
                        human.setIntoBattle(true);
                    }

                    if (ork.getHealth() < 0 || ork.getHealth() == 0) {
                        ork.setIntoBattle(false);
                    } else {
                        ork.setIntoBattle(true);
                    }

                    if (elf.getHealth() < 0 || elf.getHealth() == 0) {
                        elf.setIntoBattle(false);
                    } else {
                        elf.setIntoBattle(true);
                    }

                    break;
                case 3: // про эльфа

                    // выставляем для персонажей true или false
                    elf.setIntoBattle(true);

                    currentNumber = rand.nextIntDva();

                    if (currentNumber == 0) {
                        human.setIntoBattle(true);
                    } else {
                        ork.setIntoBattle(true);
                    }

                    //бой
                    if (human.isIntoBattle() == true) { //если выбор на человека, то эта часть
                        while (elf.getHealth() > 0 && human.getHealth() > 0 || elf.getHealth() == 0 && human.getHealth() == 0) {
                            int hpHuman = human.getHealth();
                            int hpElf = elf.getHealth();

                            hpHuman = human.getHealth() - (elf.getAttackPower() + rand.nextIntCrit());
                            human.setHealth(hpHuman);
                            System.out.println(elf.getName() + " атакует - " + human.getName() + ". НР осталось - " + human.getHealth());
                            hpElf = elf.getHealth() - (human.getAttackPower() + rand.nextIntCrit());
                            elf.setHealth(hpElf);
                            System.out.println(human.getName() + " атакует - " + elf.getName() + ". НР осталось - " + elf.getHealth());
                        }
                    } else { //а иначе бой с эльфом
                        while (ork.getHealth() > 0 && elf.getHealth() > 0 || ork.getHealth() == 0 && elf.getHealth() == 0) {
                            int hpOrk = ork.getHealth();
                            int hpElf = elf.getHealth();

                            hpOrk = ork.getHealth() - (elf.getAttackPower() + rand.nextIntCrit());
                            ork.setHealth(hpOrk);
                            System.out.println(elf.getName() + " атакует - " + ork.getName() + ". НР осталось - " + ork.getHealth());
                            hpElf = elf.getHealth() - (ork.getAttackPower() + rand.nextIntCrit());
                            elf.setHealth(hpElf);
                            System.out.println(ork.getName() + " атакует - " + elf.getName() + ". НР осталось - " + elf.getHealth());
                        }
                    }

                    //у кого нр = 0, тот проиграл
                    if (human.getHealth() < 0 || human.getHealth() == 0) {
                        human.setIntoBattle(false);
                    } else {
                        human.setIntoBattle(true);
                    }

                    if (ork.getHealth() < 0 || ork.getHealth() == 0) {
                        ork.setIntoBattle(false);
                    } else {
                        ork.setIntoBattle(true);
                    }

                    if (elf.getHealth() < 0 || elf.getHealth() == 0) {
                        elf.setIntoBattle(false);
                    } else {
                        elf.setIntoBattle(true);
                    }

                    break;
                default:
                    break;
            }

            if (elf.getHealth() == 100) {
                //не бился
            } else {
                if (human.isIntoBattle() && !elf.isIntoBattle()) {
                    System.out.println(human.getName() + " - победил. " + elf.getName() + " - умер!");

                    break;
                } else if (!human.isIntoBattle() && elf.isIntoBattle()) {
                    System.out.println(human.getName() + " - умер. " + elf.getName() + " - победил!");

                    break;
                } else if (human.isIntoBattle() && elf.isIntoBattle()) {
                    System.out.println(human.getName() + " и " + elf.getName() + ". Бились в ничью1");

                    break;
                } else if (!human.isIntoBattle() && !elf.isIntoBattle()) {
                    System.out.println(human.getName() + " и " + elf.getName() + " - оба умерли...");

                    break;
                }
            }

            if (ork.getHealth() == 100) {
                //не бился
            } else {
                if (human.isIntoBattle() && !ork.isIntoBattle()) {
                    System.out.println(human.getName() + " - победил. " + ork.getName() + " - умер!");

                    break;
                } else if (!human.isIntoBattle() && ork.isIntoBattle()) {
                    System.out.println(human.getName() + " - умер. " + ork.getName() + " - победил!");

                    break;
                } else if (human.isIntoBattle() && ork.isIntoBattle()) {
                    System.out.println(human.getName() + " и " + ork.getName() + ". Бились в ничью2");

                    break;
                } else if (!human.isIntoBattle() && !ork.isIntoBattle()) {
                    System.out.println(human.getName() + " и " + ork.getName() + " - оба умерли...");

                    break;
                }
            }

            if (human.getHealth() == 100) {
                //не бился
            } else {
                if (ork.isIntoBattle() && !elf.isIntoBattle()) {
                    System.out.println(ork.getName() + " - победил. " + elf.getName() + " - умер!");

                    break;
                } else if (!ork.isIntoBattle() && elf.isIntoBattle()) {
                    System.out.println(ork.getName() + " - умер. " + elf.getName() + " - победил!");

                    break;
                } else if (ork.isIntoBattle() && elf.isIntoBattle()) {
                    System.out.println(ork.getName() + " и " + elf.getName() + ". Бились в ничью2");

                    break;
                } else if (!ork.isIntoBattle() && !elf.isIntoBattle()) {
                    System.out.println(ork.getName() + " и " + elf.getName() + " - оба умерли...");

                    break;
                }
            }
        }
    }
}
