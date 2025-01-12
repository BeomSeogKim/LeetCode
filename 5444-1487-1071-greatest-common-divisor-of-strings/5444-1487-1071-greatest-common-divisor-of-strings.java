class Solution {
    
    public String gcdOfStrings(String str1, String str2) {
        for (int i = Math.min(str1.length(), str2.length()); i >= 1; i--) {
            if (isGCD(str1, str2, i)) {
                return str1.substring(0, i);
            }
        }
        return "";
    }

    public boolean isGCD(String str1, String str2, int k) {
        int len1 = str1.length(); 
        int len2 = str2.length();
        if (len1 % k > 0 || len2 % k > 0) {
            return false;
        }
        String base = str1.substring(0, k);
        return str1.replace(base, "").isEmpty() && str2.replace(base, "").isEmpty();
    }
}