/*
在一个数组里面移除指定value，并且返回新的数组长度。这题唯一需要注意的地方在于in place，不能新建另一个数组。

方法很简单，使用两个游标i，j，遍历数组，如果碰到了value，使用j记录位置，同时递增i，直到下一个非value出现，将此时i对应的值复制到j的位置上，增加j，重复上述过程直到遍历结束。这时候j就是新的数组长度。
*/

class Solution {
public:
    int removeElement(vector<int>& nums, int val) {
        if (nums.begin() == nums.end()) return 0;
        vector<int>::iterator itor;
        for (itor = nums.begin(); itor + 1 != nums.end(); )
        {
            if (*(itor + 1) == val) {
                nums.erase(itor + 1);
            }
            else {
                itor++;
            }
        }
        itor = nums.begin();
        if (*itor == val) {
            nums.erase(itor);
            return nums.size();
        }
        return nums.size();
    }
};