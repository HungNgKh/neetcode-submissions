class Solution {
    public boolean isPalindrome(String s) {
        int length = s.length();
    
        if(length == 0) {
            return true;
        }

        int start_pt = 0;
        int end_pt = s.length() - 1;

        while (start_pt < end_pt) {
            if (!(Character.isLetter(s.charAt(start_pt)) || Character.isDigit(s.charAt(start_pt)))) {
                start_pt++;
                continue;
            }

            if (!(Character.isLetter(s.charAt(end_pt)) || Character.isDigit(s.charAt(end_pt)))) {
                end_pt--;
                continue;
            }

            if(Character.toUpperCase(s.charAt(start_pt)) != Character.toUpperCase(s.charAt(end_pt))) {
                return false;
            } 

            start_pt++;
            end_pt--;
        }

        return true;
    }
}
