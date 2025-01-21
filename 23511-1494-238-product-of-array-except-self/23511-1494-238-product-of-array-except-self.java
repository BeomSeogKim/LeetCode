class Solution {
    public int[] productExceptSelf(int[] nums) {
        int length = nums.length;
        int[] L = new int[length];
        int[] R = new int[length];

        // left sweeping
        for(int i = 0; i < length; i++) {
            if (i == 0) {
                L[i] = 1;
                continue;
            } 
            L[i] = L[i - 1] * nums[i - 1];
        }

        // right sweeping
        for (int i = length -1; i >= 0; i--) {
            if (i == length - 1) {
                R[i] = 1;
                continue;
            }
            R[i] = R[i + 1] * nums[i + 1];
        }

        int[] answer = new int[length];
        for(int i = 0; i < length; i++) {
            answer[i] = L[i] * R[i];
        }

        return answer;
    }
}