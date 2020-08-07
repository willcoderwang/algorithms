class CountingSort {
    public void sort(int[] arr) {
        // counting sort assumes elements is a int range (0, k), we assume k=5 here
        int[] counting = new int[6];

        for (int i: arr) {
            ++counting[i];
        }

        int sum = 0;
        for (int i=0; i < counting.length; ++i) {
            counting[i] += sum;
            sum = counting[i];
        }

        int[] result = new int[arr.length];
        // doing this reversely to ensure it's stable
        for (int i=arr.length-1; i >=0; --i) {
            result[counting[arr[i]]-1] = arr[i];
            --counting[arr[i]];
        }

        java.util.Arrays.setAll(arr, i -> result[i]);
    }

    public void printArray(int[] arr) {
        for (int i: arr) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        CountingSort countingSort = new CountingSort();
        int[] arr = {2, 5, 3, 0, 2, 3, 0, 3};
        countingSort.sort(arr);
        System.out.println("Sorted array:");
        countingSort.printArray(arr);
    }
}