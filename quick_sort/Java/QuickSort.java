class QuickSort {
    public void sort(int[] arr, int start, int stop) {
        if (stop <= start)
            return;

        int front = start;
        int end = stop;
        while (front < end) {
            while (front < end) {
                if (arr[end] < arr[front]) {
                    int temp = arr[end];
                    arr[end] = arr[front];
                    arr[front] = temp;
                    break;
                }
                --end;
            }
            while (front < end) {
                if (arr[end] < arr[front]) {
                    int temp = arr[end];
                    arr[end] = arr[front];
                    arr[front] = temp;
                    break;
                }
                ++front;
            }
        }
        sort(arr, start, front-1);
        sort(arr, front+1, stop);
    }

    public void printArray(int[] arr) {
        for (int i: arr) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        QuickSort quickSort = new QuickSort();
        int[] arr = {54, 25, 12, 22, 11};
        quickSort.sort(arr, 0, arr.length-1);
        System.out.println("Sorted array:");
        quickSort.printArray(arr);
    }
}