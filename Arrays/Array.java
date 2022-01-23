package Arrays;

public class Array {

    public static int[] sort012 = { 0, 2, 1, 2, 0 };
    public static int[] negPosArray = { -12, 11, -13, -5, 6, -7, 5, -3, -6 };

    public static int[] intArray(int n) {

        int[] arr = new int[n];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = i * i;
        }

        return arr;

    }

}
