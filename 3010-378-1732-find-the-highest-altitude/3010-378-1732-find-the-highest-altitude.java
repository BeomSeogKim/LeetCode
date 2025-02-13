class Solution {
    public int largestAltitude(int[] gain) {
        int max = 0;
        int current = 0;
        for (int altitude : gain) {
            current += altitude;
            max = Math.max(max, current);
        }
        return max;
    }
}