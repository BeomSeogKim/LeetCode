class Solution {
    public int removeDuplicates(int[] nums) {
        int numOfDuplicates = 1;
        int arrayLength = nums.length;
        for(int i = 1; i < arrayLength; i++){
            if(nums[i-1] != nums[i]){
                nums[numOfDuplicates] = nums[i];
                numOfDuplicates += 1; 
            }
        }
        return numOfDuplicates;
    }
}