class Solution {
    public int[] twoSum(int[] numbers, int target) {
        // 167
        // Reference: cspiration
        // Time: O(logn) Space: O(1)
        if(numbers == null || numbers.length < 2) {
            return new int[]{-1, -1};
        }
        
        int left = 0;
        int right = numbers.length - 1;
        while(left < right) {
            int sum = numbers[left] + numbers[right];
            if(target == sum) {
                return new int[]{left + 1, right + 1};
            } else if(sum > target) {
                right--;
            } else {
                left++;
            }
        }
        return new int[]{-1, -1};
    }
}