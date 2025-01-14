class Solution {
    public String reverseVowels(String s) {
        int start = 0;
        int end = s.length() - 1;
        char[] charArray = s.toCharArray();

        while(start < end) {
            // left search
            while(start < s.length() - 1 && !isVowel(charArray[start])) {
                start++;
            }

            // right search
            while (end >= 0 && !isVowel(charArray[end])) {
                end--;
            }

            if (start < end) {
                swap(charArray, start, end);
                start++;
                end--;
            }
        }
        return String.valueOf(charArray);
    }

    private boolean isVowel(char c) {
        return Character.toLowerCase(c) == 'a' ||
        Character.toLowerCase(c) == 'e' ||
        Character.toLowerCase(c) == 'i' ||
        Character.toLowerCase(c) == 'o' ||
        Character.toLowerCase(c) == 'u';
    }

    private void swap(char[] charArray, int start, int end) {
        char temp = charArray[start];
        charArray[start] = charArray[end];
        charArray[end] = temp;
    }
}