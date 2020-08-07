class BinarySearch {
    public int search(int[] nums, int target) {
        int front = 0, end = nums.length-1;
        while (front <= end) {
            int mid = (front + end) / 2;
            if (nums[mid] == target)
                return mid;
            else if (nums[mid] < target)
                front = mid + 1;
            else if (nums[mid] > target)
                end = mid - 1;
        }

        return -1;
    }

    public static void main(String[] args) {
        int[] nums = {-1,0,3,5,9,12};
        int target = 9;

        BinarySearch bs = new BinarySearch();
        System.out.println(bs.search(nums, target));
    }
}