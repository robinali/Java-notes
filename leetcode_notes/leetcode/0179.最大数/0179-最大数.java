class Solution {
    // 179
    // Reference: cspiration
    public String largestNumber(int[] nums) {
        // Time: O(nlogn) Space: O(n)
        if(nums == null || nums.length == 0) {
            return "";
        }
        String[] res = new String[nums.length];
        for(int i = 0; i < nums.length; i++) {
            res[i] = String.valueOf(nums[i]);
        }
        Arrays.sort(res, (s1, s2) -> (s2 + s1).compareTo(s1 + s2));
        if(res[0].charAt(0) == '0') {
            return "0";
        }
        StringBuilder sb = new StringBuilder();
        for(String s : res) {
            sb.append(s);
        }
        return sb.toString();
    }
}