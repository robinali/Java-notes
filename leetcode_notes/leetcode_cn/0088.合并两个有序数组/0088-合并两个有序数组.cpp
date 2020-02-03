class Solution {
public:
    void merge(vector<int>& nums1, int m, vector<int>& nums2, int n) {
        int p1 = m - 1, p2 = n - 1;
        for (int i = m + n - 1; i >= 0; i --) {
            if (p2 == -1)
                return;
            if (p1 == -1) {
                for (int j = 0; j <= p2; j++) {
                    nums1[j] = nums2[j];
                }
                return;
            }
            if (nums1[p1] > nums2[p2]) {
                nums1[i] = nums1[p1--];
            } else {
                nums1[i] = nums2[p2--];
            }
        }
    }
};