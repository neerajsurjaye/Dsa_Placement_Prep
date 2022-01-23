package Arrays;

public class ReverserArray {

    public static void run() {
        // initializing array

        int[] arr = Array.intArray(20);

        // Two pointer reverse
        int s = 0;
        int t = arr.length - 1;

        while (s <= t) {
            int temp = arr[s];
            arr[s] = arr[t];
            arr[t] = temp;

            s++;
            t--;
        }

        for (int i : arr) {
            System.out.print(i + " ");
        }

    }

}
