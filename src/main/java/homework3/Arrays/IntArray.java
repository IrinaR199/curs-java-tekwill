package homework3.Arrays;

public class IntArray {
    public static void main(String[] args) {
        int[] nums = new int[5];
        int sum = 0;
        double avg = 0;
        int cntEven = 0;
        int cntOdd = 0;

        nums[0] = 5;
        nums[1] = 15;
        nums[2] = 6;
        nums[3] = 11;
        nums[4] = 10;

        System.out.println("Элементы массива:");
        for (int i = 0; i < nums.length; i++){
            sum = sum + nums[i];

            //check if value is even or odd
            if (nums[i] % 2 == 0) cntEven++;
            else cntOdd++;

            System.out.println("элемент массива[" + i + "] = " + nums[i]);
        }

        avg = sum/ nums.length;
        System.out.println("\nСумма элементов массива = " + sum);
        System.out.println("Среднее значение элементов массива = " + avg);
        System.out.println("Количество четных элементов массива: " + cntEven);
        System.out.println("Количество нечетных элементов массива: " + cntOdd);
    }

}
