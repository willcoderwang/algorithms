class BubbleSort {
    public void sort(int[] arr) {
        for (int i=0; i < arr.length-1; ++i) {
            for (int j=arr.length-1; j >= i+1; --j) {
                if (arr[j] < arr[j-1]) {
                    int temp = arr[j-1];
                    arr[j-1] = arr[j];
                    arr[j] = temp;
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
        BubbleSort bubbleSort = new BubbleSort();
        int[] arr = {54, 25, 12, 22, 11};
        bubbleSort.sort(arr);
        System.out.println("Sorted array:");
        bubbleSort.printArray(arr);
    }
}