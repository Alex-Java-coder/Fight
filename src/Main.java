import java.util.Scanner;


public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Кто с кем будет биться? Определяет случай.\nПобедивший получает + к HP и атаке.\n'exit' - для выхода.\n'next' - для следующего раунда.\n'go' - для перезапуска игры.");

        System.out.println(" - - - ");

        while (true) {

            String s = scanner.nextLine();
            if (s.equals("exit")) break;

            else if (s.equals("go")) {

                //генерация случайных чисел
                RandomGenerator rand = new RandomGenerator();
//                Info info = new Info();
//                info.consoleOutput();

                System.out.println(" - - - ");

                Fight fight = new Fight();

                //Human - 1
                System.out.println(fight.human.getName() + ". Жизней " + fight.human.getHealth() + ". Сила атаки " + fight.human.getAttackPower() + ". Уровень " + fight.human.getLevelHuman());

                //Ork - 2
                System.out.println(fight.ork.getName() + ". Жизней " + fight.ork.getHealth() + ". Сила атаки " + fight.ork.getAttackPower() + ". Уровень " + fight.ork.getLevelOrk());

                //Elf - 3
                System.out.println(fight.elf.getName() + ". Жизней " + fight.elf.getHealth() + ". Сила атаки " + fight.elf.getAttackPower() + ". Уровень " + fight.elf.getLevelElf());



                fight.fight();

                //Human - 1
                System.out.println(fight.human.getName() + ". Жизней " + fight.human.getHealth() + ". Сила атаки " + fight.human.getAttackPower() + ". Уровень " + fight.human.getLevelHuman());

                //Ork - 2
                System.out.println(fight.ork.getName() + ". Жизней " + fight.ork.getHealth() + ". Сила атаки " + fight.ork.getAttackPower() + ". Уровень " + fight.ork.getLevelOrk());

                //Elf - 3
                System.out.println(fight.elf.getName() + ". Жизней " + fight.elf.getHealth() + ". Сила атаки " + fight.elf.getAttackPower() + ". Уровень " + fight.elf.getLevelElf());


            } else if (s.equals("next")) {
                // доделать с уровнями
                System.out.println("Продолжаем");
            }
        }
    }
}
