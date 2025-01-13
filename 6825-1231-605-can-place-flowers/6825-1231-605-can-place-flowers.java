class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        int flowerbedLength = flowerbed.length;
        int count = 0;
        for (int i = 0; i < flowerbedLength; i++) {
            if (flowerbed[i] != 0) {
                continue;
            } else if (isValidLeft(flowerbed, i) && isValidRight(flowerbed, i)) {
                flowerbed[i] = 1;
                count++;
            }
        };
        return count >= n;
    }

    private boolean isValidLeft(int[] flowerbed, int index) {
        return index == 0 || flowerbed[index -1] == 0;
    }

    private boolean isValidRight(int[] flowerbed, int index) {
        return index == flowerbed.length - 1 || flowerbed[index + 1] == 0;
    }
}