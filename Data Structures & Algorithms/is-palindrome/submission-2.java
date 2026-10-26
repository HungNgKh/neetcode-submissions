class Solution {
    public boolean isPalindrome(String s) {    
        String trimed_s = s.replaceAll("[^a-zA-Z0-9]", "").toUpperCase();

        int length = trimed_s.length();

        if(length == 0) {
            return true;
        }

        for(int i = 0; i < length / 2; i++) {
            if(trimed_s.charAt(i) != trimed_s.charAt(length - i - 1)) {
                return false;
            }
        }
        return true;
    }
}
