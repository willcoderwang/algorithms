class HeapSort {
    public void sort(int[] arr) {
        Heap h = new Heap(arr);

        for(int i=0; i<arr.length; ++i) {
            int min = h.popMin();
            arr[i] = min;
        }
    }

    public void printArray(int[] arr) {
        for (int i: arr) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        HeapSort heapSort = new HeapSort();
        int[] arr = {54, 25, 12, 22, 11};
        heapSort.sort(arr);
        System.out.println("Sorted array:");
        heapSort.printArray(arr);
    }
}