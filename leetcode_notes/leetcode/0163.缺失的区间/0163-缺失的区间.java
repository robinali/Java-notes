class Solution {
    public List<String> findMissingRanges(int[] nums, int lower, int upper) {
        List<String> res = new ArrayList<>();
        long llower = (long)lower, lupper = (long)upper;
        for(int num: nums) {
            if(num == llower) {
                llower++;
            } else if(llower < num) {
                if(llower + 1 == num) {
                    res.add(String.valueOf(llower));
                } else {
                    res.add(llower + "->" + (num - 1));
                }
                llower = (long)num + 1;
            }
        }
        if(llower == lupper) res.add(String.valueOf(llower));
        else if( llower < lupper) res.add( llower + "->" + lupper);
        return res;
    }
}