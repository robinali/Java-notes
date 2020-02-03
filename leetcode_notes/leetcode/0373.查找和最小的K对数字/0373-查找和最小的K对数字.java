class Solution {
    public List<List<Integer>> kSmallestPairs(int[] nums1, int[] nums2, int k) {
        if(k > nums1.length * nums2.length) k = nums1.length * nums2.length;
        List<List<Integer>> rtn = new ArrayList<>();
        if(nums1.length == 0 || nums2.length == 0) return rtn;

        //用一个数组来记录num1中每个元素在nums2中走了多远就可以，每次循环都是nums1和nums2加起来最小的nums1往前走一步
        int[] steps = new int[nums1.length];
        int startIdx = 0;
        while(rtn.size() < k) {
                int min = Integer.MAX_VALUE;
                int minStepIndex = -1;
                for(int i = startIdx; i < nums1.length; i++) {
                    if(steps[i] == nums2.length) {
                        startIdx = i + 1;
                        continue;
                    }
                    if(steps[i]< nums2.length && nums2[steps[i]] + nums1[i] < min) {
                        min = nums2[steps[i]] + nums1[i];
                        minStepIndex = i;
                    }
                }
                if(minStepIndex == -1) break;

                List<Integer> list = new ArrayList<Integer>();
                list.add(nums1[minStepIndex]);
                list.add(nums2[steps[minStepIndex]]);
                rtn.add(list);
                steps[minStepIndex]++;
        }
        return rtn;
    }
}