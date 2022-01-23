package Arrays;

import java.util.Arrays;

public class MoveNegativeElementsToOneSizeOfArray {

    // update approach
    public static void runTwoPointer() {

        int[] arr = Array.negPosArray;

        int s = 0;
        int e = arr.length - 1;

        System.out.println(Arrays.toString(arr));

        while (s <= e) {

            if (arr[s] > 0 && arr[e] < 0) {

                System.out.println("Switching : " + arr[s] + " " + arr[e]);
                int temp = arr[s];
                arr[s] = arr[e];
                arr[e] = temp;
                System.out.println("Switching : " + arr[s] + " " + arr[e]);
                s++;
                e--;
            }
            System.out.println("!!!!!!!!!!: " + arr[s] + " " + arr[e]);

            if (arr[s] < 0) {
                s++;
            }

            if (arr[e] > 0) {
                e--;
            }

        }

        System.out.println(Arrays.toString(arr));

    }

    public static void secApporach() {

        int[] arr = Array.negPosArray;

        int s = 0;
        int e = 0;

        for (int i = 0; i < arr.length; i++) {

            if (arr[e] < 0) {
                int temp = arr[e];
                arr[e] = arr[s];
                arr[s] = arr[e];
                s++;
            }

            e++;

        }

        System.out.println(Arrays.toString(arr));

    }

}
