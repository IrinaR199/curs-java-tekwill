package homework3.SumFractions;

public class SumFractions {
    public static void main(String[] args) {
        printSumFractions();
    }

    public static void printSumFractions() {
        int a = 1;
        double result = 0.0;

        System.out.println(result);

        for (int i = a; i <=97; i = i + 2){
            result = result + (double) i /(i + 2);
            System.out.print(a + "/" + (a + 2));

            if (a < 97) System.out.print(" + ");
            else System.out.println();

            a = a + 2;
        }
        System.out.println("Сумма числового ряда: " + Math.round(result));
    }
}
