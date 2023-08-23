class Solution {
    public int removeElement(int[] nums, int val) {
        int answer = 0;
        int[] temp = new int[nums.length];
        int pointer = 0;
        for(int num : nums){
            if(num != val){
                answer++;
                temp[pointer++] = num;
            }
        }

        for(int i = 0; i < nums.length; i++){
            if (i < temp.length){
                nums[i] = temp[i];
            }
        }

        return answer;
    }
}