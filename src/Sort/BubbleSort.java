package Sort;

public class BubbleSort {
    public static void bubble_sort(int[] data) {
        int n = data.length;

        for (int pass=0; pass<n - 1; pass++) {
            boolean swapped = false;
            for (int current=0; current<n - 1 - pass; current++) {
                if (data[current] > data[current+1]) {
                    int temp = data[current];
                    data[current] = data[current+1];
                    data[current+1] = temp;
                    swapped = true;
                }
            }
            if (!swapped)
                break;
        }
    }
}
