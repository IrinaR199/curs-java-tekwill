package homework3.PrintDiv5and6;

public class DivisibleBy5and6 {

    public static void main(String[] args) {
        printDivisibleBy5And6(100, 1000);
    }


    public static void printDivisibleBy5And6(int start, int end) {
        int count = 0;

        for (int num = start; num <= end; num++) {
            if (num % 5 == 0 && num % 6 == 0) {
                System.out.print(num + " ");
                count++;

                if (count % 10 == 0) {
                    System.out.println(); // новая строка после каждых 10 чисел
                }
            }
        }
    }
}
