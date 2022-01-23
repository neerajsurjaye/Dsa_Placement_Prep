package Arrays;

public class Sort012 {

    public static void sort012(int a[], int n) {
        // code here
        int[] counts = new int[3];

        for (int x : a) {

            counts[x]++;

        }

        int p = 0;
        for (int i = 0; i < a.length; i++) {

            if (counts[p] == 0) {
                p++;
            }

            a[i] = p;
            counts[p]--;
            System.out.println(p);

        }

        for (int x : a) {
            System.out.print(x + " ");
        }
    }

}
