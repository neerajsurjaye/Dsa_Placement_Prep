package Arrays;

public class MaxAndMinInArray {

    public static void run() {
        int[] arr = Array.intArray(10);

        int min = arr[0];
        int max = arr[0];

        for (int x : arr) {

            if (x < min) {
                min = x;
            }

            if (x > max) {
                max = x;
            }

        }

        System.out.printf("Min : %d : Max : %d \n", min, max);

    }

}
