class Solution:
    def searchInsert(self, nums, target):
        """
        :type nums: List[int]
        :type target: int
        :rtype: int
        """
        
        try:
            nums.index(target)
            return(nums.index(target))
        except:
            if(target >= nums[-1]):
                return (len(nums))
            elif(target <= nums[0]):
                return(0)
            else:
                for i in range(1,len(nums)):
                    if (nums[i-1] <= target and nums[i] > target):
                        return (i)