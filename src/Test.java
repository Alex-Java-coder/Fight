//public class Test {
//    public static void main(String[] args) {
//
//        Human human = new Human();
//        Ork ork = new Ork();
//        Elf elf = new Elf();
//
//        if (human.isIntoBattle() == true) {
//            System.out.println("1");
//        } else {
//            System.out.println("2");
//        }
//    }
//}
//
//
//
//
//
//
//
//
//
//
////        RandomGenerator rand = new RandomGenerator();
////
//////        while (true) {
//////            // Генерация случайного числа для выбора персонажей
////        int currentNumber = rand.nextIntVibor();
////        System.out.println(currentNumber + "начало");
////
////
//////            switch (currentNumber) {
//////                case 1: // про человека
//////                    System.out.println("Human1");
//////                    // выставляем для персонажей true или false
//////                    human.setIntoBattle(true);
//////                    System.out.println(human.isIntoBattle());
//////                    currentNumber = rand.nextIntVibor();
//////                    if (currentNumber == 2) {
//////                        System.out.println("Ork2");
//////                        ork.setIntoBattle(true);
//////                        System.out.println(ork.isIntoBattle());
//////                    } else {
//////                        System.out.println("Elf3");
//////                        elf.setIntoBattle(true);
//////                        System.out.println(elf.isIntoBattle());
//////                    }
////
////
////        //атака
////        while (human.getHealth() > 0 && ork.getHealth() > 0) {
////            int hpHuman = human.getHealth();
////            int hpOrk = ork.getHealth();
////
////            System.out.println("НРОркдо " + ork.getHealth());
////            hpOrk = ork.getHealth() - (human.getAttackPower() + rand.nextInt());
////            ork.setHealth(hpOrk);
////            System.out.println("НРОркпосле " + ork.getHealth());
////            System.out.println("НРЧелдо " + human.getHealth());
////            hpHuman = human.getHealth() - (ork.getAttackPower() + rand.nextInt());
////            human.setHealth(hpHuman);
////            System.out.println("НРЧелпосле " + human.getHealth());
////        }
////
////
////        if (human.getHealth() <= 0) {
////            human.setIntoBattle(false);
////        } else {
////            human.setIntoBattle(true);
////        }
////
////        if (ork.getHealth() <= 0) {
////            ork.setIntoBattle(false);
////        } else {
////            ork.setIntoBattle(true);
////        }
////
////
////        //инфо
////        if (!human.isIntoBattle() && ork.isIntoBattle()) {
////            System.out.println(human.getName() + " - умер. " + ork.getName() + " - победил!");
//////            break;
////        } else if (human.isIntoBattle() && !ork.isIntoBattle()) {
////            System.out.println(human.getName() + " - умер. " + ork.getName() + " - победил!");
//////            break;
////        } else if (!human.isIntoBattle() && !ork.isIntoBattle()) {
////            System.out.println("Все умерли...");
//////            break;
////        } else if (!human.isIntoBattle() && elf.isIntoBattle()) {
////            System.out.println(human.getName() + " - умер. " + elf.getName() + " - победил!");
//////            break;
////        } else if (human.isIntoBattle() && !elf.isIntoBattle()) {
////            System.out.println(human.getName() + " - умер. " + elf.getName() + " - победил!");
//////            break;
////        } else if (human.isIntoBattle() && elf.isIntoBattle()) {
////            System.out.println("Ничья");
//////            break;
////        } else if (!human.isIntoBattle() && !elf.isIntoBattle()) {
////            System.out.println("Все умерли");
//////            break;
////        }
////
////
//////                    if (!human.isIntoBattle() && ork.isIntoBattle()) {
//////                        System.out.println(human.getName() + " - умер. " + ork.getName() + " - победил!");
//////                        break;
//////                    } else if (human.isIntoBattle() && !ork.isIntoBattle()) {
//////                        System.out.println(human.getName() + " - умер. " + ork.getName() + " - победил!");
//////                        break;
//////                    } else if (!human.isIntoBattle() && !ork.isIntoBattle()) {
//////                        System.out.println("Все умерли...");
//////                        break;
//////                    } else if (!human.isIntoBattle() && elf.isIntoBattle()) {
//////                        System.out.println(human.getName() + " - умер. " + elf.getName() + " - победил!");
//////                        break;
//////                    } else if (human.isIntoBattle() && !elf.isIntoBattle()) {
//////                        System.out.println(human.getName() + " - умер. " + elf.getName() + " - победил!");
//////                        break;
//////                    } else if (human.isIntoBattle() && elf.isIntoBattle()) {
//////                        System.out.println("Ничья");
//////                        break;
//////                    } else if (!human.isIntoBattle() && !elf.isIntoBattle()) {
//////                        System.out.println("Все умерли");
//////                        break;
//////                    }
//////                case 2: // про орка
////        System.out.println("Ork21");
//////                    ork.setIntoBattle(true);
//////                    currentNumber = rand.nextIntVibor();
//////                    if (currentNumber == 1) {
//////                        System.out.println("Human22");
//////                        human.setIntoBattle(true);
//////                    } else {
//////                        System.out.println("Elf23");
//////                        elf.setIntoBattle(true);
//////                    }
////
////
//////                    break;
//////                case 3: // про эльфа
////        System.out.println("Elf31");
//////                    elf.setIntoBattle(true);
//////                    currentNumber = rand.nextIntVibor();
//////                    if (currentNumber == 1) {
//////                        System.out.println("Human32");
//////                        human.setIntoBattle(true);
//////                    } else {
//////                        System.out.println("Ork33");
//////                        ork.setIntoBattle(true);
//////                    }
//////                    break;
//////                default:
//////                    break;
////    }
////}
//////    }
//////}
////
////
//////        //для выбора персонажа
//////        public int nextIntVibor() {
//////            int result = random.nextInt(3); // Генерация случайного числа от 0 до 2
//////            System.out.println("0");
//////            if (result == 0) { // Если результат равен 0, то возвращаем 1
//////                System.out.println("1");
//////                return 1;
//////            } else if (result == 1) { // Если результат равен 1, то возвращаем случайное число между 2 и 3
//////                System.out.println("2");
//////                int randomNumber = random.nextInt(2) + 2;
//////                System.out.println("3");
//////                return randomNumber;
//////            } else { // Иначе возвращаем случайное число между 1 и 2
//////                System.out.println("4");
//////                int randomNumber = random.nextInt(2) + 1;
//////                System.out.println("5");
//////                return randomNumber;
//////            }
//////        }
//////    }
////////
////////        int currentNumber = rand.nextIntVibor();
////////
////////        if (currentNumber == 1) {
////////            System.out.println("1");
////////            currentNumber = rand.nextIntVibor();
////////            // Если выпало число 1, генерируем новое число, пока не выпадет 2 или 3
////////            if (currentNumber == 2) {
////////                System.out.println("2");
////////            } else {
////////                System.out.println("3");
////////            }
////////        } else if (currentNumber == 2) {
////////            currentNumber = rand.nextIntVibor();
////////            System.out.println("22");
////////            if (currentNumber == 1) {
////////                System.out.println("11");
////////            } else {
////////                System.out.println("33");
////////            }
////////        } else if (currentNumber == 3) {
////////            currentNumber = rand.nextIntVibor();
////////            System.out.println("333");
////////            if (currentNumber == 1) {
////////                System.out.println("111");
////////            } else {
////////                System.out.println("222");
////////            }
////////        }
////////    }
////////}
//////
////////
////////
////////        // Проверяем, выпало ли число 1, 2 или 3
////////        if (currentNumber == 1) {
////////            // Если выпало число 1, генерируем новое число, пока не выпадет 2 или 3
////////            while (true) {
////////                currentNumber = rand.nextIntVibor();
////////                if (currentNumber != 1 && currentNumber != currentNumber) {
////////                    break; // Выходим из цикла, если выпало 2 или 3
////////                }
////////            }
////////        } else if (currentNumber == 2) {
////////            // Аналогично для числа 2
////////            while (true) {
////////                currentNumber = rand.nextIntVibor();
////////                if (currentNumber != 2 && currentNumber != currentNumber) {
////////                    break;
////////                }
////////            }
////////        } else {
////////            // Для числа 3 аналогично
////////            while (true) {
////////                currentNumber = rand.nextIntVibor();
////////                if (currentNumber != 3 && currentNumber != currentNumber) {
////////                    break;
////////                }
////////            }
////////        }
////////
////////        System.out.println("Следующее выпавшее число: " + currentNumber);
////////    }
////////}
