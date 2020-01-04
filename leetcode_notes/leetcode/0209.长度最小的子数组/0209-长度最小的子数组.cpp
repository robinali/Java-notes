class Solution {
public:
    int min(int a, int b) {
        return a > b ? b : a;
    }

    int minSubArrayLen(int s, vector<int>& nums) {
        if(nums.size() == 0) return 0;
        int cur = nums[0];
        int sum = cur;
        int res;
        if(sum >= s) res = 1;
        else res = 0xffffff;
        int ori = 0;
        int idx = 1;
        int len = nums.size();

        while(idx < len) {
            sum += nums[idx];
            if(sum >= s) res = min(res, idx - ori + 1);
            while(ori < idx && sum - nums[ori] >= s) {
                res = min(res, idx - ori);
                sum -= nums[ori];
                ori += 1;
            }
            idx ++;
        }
        if(res == 0xffffff) return 0;
        else return res;
    }
};