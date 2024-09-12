//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println("Задание 1");
        int[] zplata = new int[]{5000, 10000, 15000, 20000, 25000};
        int summ = 0;
        for (int element : zplata) {
            summ = summ + element;
        }
        System.out.println("Сумма трат за месяц составила " + summ + " рублей.");
        System.out.println("Задание 2");
        // Задание 2
        int z[] = new int[]{10, 20, 25, 40, 45};
        int max = 10;
        int min = 10;
        for (int e : z) {
            if (e > max) {
                max = e;
            }
        }
        for (int e : z) {
            if (e < min) {
                min = e;
            }
        }
        System.out.println("Минимальная сумма трат за неделю составила " + min +
                " рублей. Максимальная сумма трат за неделю составила " + max + " рублей.");
        // Задание 3
        System.out.println("Задание 3");
        int zarPlata[] = new int[]{100, 200, 220, 300, 400};
        int sum = 0;
        int sred = 0;
        for (int el : zarPlata) {
            sum = sum + el;
        }
        sred = sum / zarPlata.length;
        System.out.println("Средняя сумма трат за месяц составила " + sred + " рублей");
        //  Задание 4
        System.out.println("Задание 4");
        char[] reverseFullName = {'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i = reverseFullName.length - 1; i >= 0; i--) {
            System.out.print(reverseFullName[i]);
        }
    }
}