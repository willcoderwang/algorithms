import java.util.Arrays;

class MergeSort {
    public void sort(int[] arr, int start, int stop) {
        if (start >= stop)
            return;
        int mid = (start + stop) / 2;

        int[] arr_1 = Arrays.copyOfRange(arr, start, mid+1);
        int[] arr_2 = Arrays.copyOfRange(arr, mid+1, stop+1);

        sort(arr_1, 0, arr_1.length-1);
        sort(arr_2, 0, arr_2.length-1);

        int p1=0, p2=0;
        for (int i=start; i <= stop; ++i) {
            if (p1 >= arr_1.length) {
                arr[i] = arr_2[p2];
                ++p2;
            }
            else if (p2 >= arr_2.length) {
                arr[i] = arr_1[p1];
                ++p1;
            }
            else {
                if(arr_1[p1] <= arr_2[p2]) {
                    arr[i] = arr_1[p1];
                    ++p1;
                }
                else {
                    arr[i] = arr_2[p2];
                    ++p2;
                }
            }
        }
    }

    public void printArray(int[] arr) {
        for (int i: arr) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        MergeSort mergeSort = new MergeSort();
        int[] arr = {54, 25, 12, 22, 11};
        mergeSort.sort(arr, 0, arr.length-1);
        System.out.println("Sorted array:");
        mergeSort.printArray(arr);
    }
}