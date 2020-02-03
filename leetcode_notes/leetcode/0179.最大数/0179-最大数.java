class Solution {
    public String largestNumber(int[] nums) {
        if(nums == null || nums.length == 0) return "";
        String[] res = new String[nums.length];
        for(int i = 0; i < nums.length; i++) {
            res[i] = String.valueOf(nums[i]);
        }
        Arrays.sort(res, (String str1, String str2) -> (str2 + str1).compareTo(str1 + str2));
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