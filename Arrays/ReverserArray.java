package Arrays;

public class ReverserArray {

    public static void ran() {
        // initializing array
        int[] arr = new int[10];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = i * i;
        }

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
