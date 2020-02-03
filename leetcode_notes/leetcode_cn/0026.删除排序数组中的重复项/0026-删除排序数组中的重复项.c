int removeDuplicates(int* nums, int numsSize) {
    if( 2 > numsSize)
        return numsSize;
        
    int idx = 0;
    int i = 0;
    for(i = 1; i < numsSize; i++)
    {
        if(nums[idx] != nums[i])
            nums[++idx] = nums[i];
    }
    return idx + 1;
}