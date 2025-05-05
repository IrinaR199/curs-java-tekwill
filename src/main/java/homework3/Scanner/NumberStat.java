package homework3.Scanner;

import java.util.Scanner;

public class NumberStat {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int cntPos = 0;
        int cntNeg = 0;
        int total = 0;

        System.out.println("Введите целые числа (для завершения 0):");

        while (true) {
            int num = scan.nextInt();

            if (num == 0) break;
            else {
                if (num > 0) cntPos++;
                else cntNeg++;
            }

            total += num;
        }

        System.out.println("Положительных чисел: " + cntPos);
        System.out.println("Отрицательных чисел: " + cntNeg);
        System.out.println("Сумма всех чисел: " + total);

    }
}
