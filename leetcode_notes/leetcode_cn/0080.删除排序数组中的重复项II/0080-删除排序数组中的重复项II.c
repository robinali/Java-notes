int removeDuplicates(int* nums, int numsSize) {
int i = 2;
int j = 2;
int a,b;
a = nums[0];
b = nums[1];
if(numsSize < 3) return numsSize;
while(i < numsSize){
    if(nums[i] == a && nums[i] == b){
        i++;
        continue;
    }
    else{
        a = nums[i - 1];
        b = nums[i];
        nums[j] = nums[i];
        j++;
    }
    i++;
}
return j;

}