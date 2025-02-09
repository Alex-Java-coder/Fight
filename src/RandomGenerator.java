import java.util.Random;


public class RandomGenerator {
    private final Random rand = new Random();

    //для крита
    public int nextIntCrit() {
        int result = rand.nextInt(2); // Генерация случайного числа от 0 до 1
        if (result == 0) { // Если результат равен 0, то возвращаем 10
            return 10;
        } else { // Иначе возвращаем 1
            return 0;
        }
    }

    public int nextIntDva() {
        int result = rand.nextInt(2); // Генерация случайного числа от 0 до 1
        if (result == 0) { // Если результат равен 0, то возвращаем 10
            return 1;
        } else { // Иначе возвращаем 1
            return 0;
        }
    }


    //для выбора персонажа из трех
    public int nextIntVibor() {

        int result = rand.nextInt(3); // Генерация случайного числа от 0 до 2

        while (true) {
            if (result == 0) { // Если результат равен 0, то возвращаем 1
                return 1;
            } else if (result == 1) { // Если результат равен 1, то возвращаем случайное число между 2 и 3
                int randomNumber = rand.nextInt(2) + 2;
                return randomNumber;
            } else if (result == 2) { // Иначе возвращаем случайное число между 1 и 2
                int randomNumber = rand.nextInt(2) + 1;
                return randomNumber;
            }
        }
    }

    //Выбор из 5 героев
    public int nextIntPytb() {
        int result = rand.nextInt(5); // Генерация случайного числа от 0 до 4

        if (result == 1) { // Если результат равен 1, то возвращаем случайное число между 2, 3, 4 и 5
            return rand.nextInt(4) + 2;
        } else if (result == 2) { // Если результат равен 2, то возвращаем случайное число между 3, 4 и 5 (исключая 2)
            int randomNumber = rand.nextInt(3) + 3;
            return randomNumber;
        }else if (result == 3) { // Если результат равен 3, то возвращаем случайное число между 4 и 5 (исключая 3)
            int randomNumber1 = rand.nextInt(2) + 4;
            int randomNumber2 = rand.nextInt(2) + 5;

            if (randomNumber1 > 4) {
                return randomNumber2;
            } else {
                return randomNumber1;
            }
        }else { // Иначе возвращаем случайное число между 1, 2, 3 и 4 (исключая 4)
            int randomNumber1 = rand.nextInt(3) + 1;
            int randomNumber2 = rand.nextInt(3) + 2;

            if (randomNumber1 > 3) {
                return randomNumber2;
            } else {
                return randomNumber1;
            }
        }
    }
}



