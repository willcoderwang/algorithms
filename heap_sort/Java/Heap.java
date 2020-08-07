class Heap {
    int[] arr;
    int heap_size;

    private void buildMinHeap() {
        for (int i=parent(heap_size-1); i >= 0; --i) {
            minHeapify(i);
        }
    }

    private void minHeapify(int i) {
        int l = left(i);
        int r = right(i);

        int least = i;
        if (l < heap_size && arr[l] < arr[least]) {
            least = l;
        }

        if (r < heap_size && arr[r] < arr[least]) {
            least = r;
        }

        if (least != i) {
            int temp = arr[least];
            arr[least] = arr[i];
            arr[i] = temp;

            minHeapify(least);
        }
    }

    public static int parent(int i) {
        return (i+1)/2 - 1;
    }

    public static int left(int i) {
        return 2 * i + 1;
    }

    public static int right(int i) {
        return 2 * i + 2;
    }

    public Heap(int[] arr) {
        this.arr = arr.clone();
        heap_size = this.arr.length;
        buildMinHeap();
    }

    public int popMin() {
        if (heap_size < 0) {
            return 0;   // should raise error here, but to simplify, we just return 0
        }

        if (heap_size == 1) {
            --heap_size;
            return arr[0];
        }

        int min = arr[0];
        arr[0] = arr[heap_size-1];
        --heap_size;
        minHeapify(0);
        return min;
    }

    @java.lang.Override
    public java.lang.String toString() {
        return "Heap{" +
                "arr=" + java.util.Arrays.toString(arr) +
                '}' + " heap_size: " + heap_size;
    }

    public static void main(String[] args) {
        int[] arr = {54, 25, 12, 22, 11};
        Heap h = new Heap(arr);

        for(int i=0; i<arr.length; ++i) {
            System.out.println(h.popMin());
        }
    }
}