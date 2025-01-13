//Ну тут можно добавить уклонение, крит - всё в рандом
//Потом доделать эту идею

public class Fight {
    public static void main(String[] args) {
        Ork ork = new Ork();
        Elf elf = new Elf();
        fight(ork, elf);
    }

    private static void fight(Ork ork, Elf elf) {
        while (true) {
            if (!ork.isOrkAlive && elf.isElfAlive) {
                System.out.println("Орк умер. Эльф победил!");
                break;
            } else if (ork.isOrkAlive && !elf.isElfAlive) {
                System.out.println("Эльф умер. Орк победил!");
                break;
            } else if (!ork.isOrkAlive && !elf.isElfAlive) {
                System.out.println("Все умерли...");
                break;
            }
            if (elf.health < 0) {
                elf.isElfAlive = false;
            } else {
                elf.health -= ork.kickPower;
            }
            if (ork.health < 0) {
                ork.isOrkAlive = false;
            } else {
                ork.health -= elf.kickPower;
            }
        }
    }
}
