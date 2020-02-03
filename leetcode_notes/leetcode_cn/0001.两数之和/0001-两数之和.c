/**
 * Note: The returned array must be malloced, assume caller calls free().
 */
int* twoSum(int* nums, int numsSize, int target) {
    int* rtn = NULL;
    if(numsSize < 2)
        return rtn;
    int i = 0, j = 0;
    for(i = 1; i < numsSize; i++) {
        for(j = 0; j < i; j++) {
            if((nums[i] + nums[j]) == target) {
                rtn = malloc(sizeof(int) * 2);
                memset(rtn, 0 , 2);
                rtn[0] = i;
                rtn[1] = j;
                return rtn;
            }
        }
    }
    return rtn;
}