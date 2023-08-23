class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int total = m + n; 
        int[] temp = new int[total];
        int pointer = 0;
        for(int i = 0; i < m; i++){
            temp[pointer++] = nums1[i];
        }
        for(int i = 0; i < n; i++){
            temp[pointer++] = nums2[i];
        }
        Arrays.sort(temp);
        pointer = 0;
        for(int i = 0; i < total; i++){
            nums1[i] = temp[i];
        }
    
    }
}