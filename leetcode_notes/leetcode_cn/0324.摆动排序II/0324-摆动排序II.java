class Solution {
    public void wiggleSort(int[] nums) {
        if(nums == null || nums.length == 0) return;
        int n = nums.length;
        int median = findKthLargest(nums, (n + 1) / 2);
        int left = 0, right = n - 1;
        int index = 0;
        while(index <= right) {
            if(nums[newIndex(index , n)] > median) {
                swap(nums, newIndex(left++, n), newIndex(index++, n));
            } else if( nums[newIndex(index, n)] < median) {
                swap(nums, newIndex(right--, n), newIndex(index, n));
            } else {
                index++;
            }
        }
    }
    
    private int newIndex(int index, int n) {
        return (1 + 2 * index) % (n | 1);
    }
    
    private int findKthLargest(int[] nums, int k) {
        if(nums == null || nums.length == 0) return 0;
        int left = 0;
        int right = nums.length - 1;
        while(true) {
            int pos = partition(nums, left, right);
            if(pos + 1 == k) {
                return nums[pos];
            } else if(pos + 1 > k) {
                right = pos - 1;
            } else {
                left = pos + 1;
            }
        }
    }
    private int partition(int[] nums, int left, int right) {
        int pivot = nums[left];
        int l = left + 1;
        int r = right;
        while(l <= r) {
            if(nums[l] < pivot && nums[r] > pivot) {
                swap(nums, l++, r--);
            }
            if(nums[l] >= pivot) l++;
            if(nums[r] <= pivot) r--;
        }
        swap(nums, left, r);
        return r;
    }
    
    private void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}