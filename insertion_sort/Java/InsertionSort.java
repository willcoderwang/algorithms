class InsertionSort {
    public void sort(int[] arr) {
        for (int i=1; i < arr.length; ++i) {
            int key = arr[i];
            int j=i-1;
            for (; j >= 0; --j) {
                if (arr[j] > key) {
                    arr[j+1] = arr[j];
                }
                else
                    break;
            }
            arr[j+1] = key;
        }
    }

    public void printArray(int[] arr) {
        for (int i: arr) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        InsertionSort insertionSort = new InsertionSort();
        int[] arr = {54, 25, 12, 22, 11};
        insertionSort.sort(arr);
        System.out.println("Sorted array:");
        insertionSort.printArray(arr);
    }
}