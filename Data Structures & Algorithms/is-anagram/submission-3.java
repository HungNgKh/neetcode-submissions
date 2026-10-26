class Solution {
    public boolean isAnagram(String s, String t) {

        if (s.length() != t.length()) {
            return false;
        }

        HashMap<Character, Integer> char_counts = new HashMap();
        for(int i = 0; i < s.length(); i++) {
            int count_val = char_counts.getOrDefault(s.charAt(i), 0);
            char_counts.put(s.charAt(i), count_val + 1);
        }

        for(int i = 0; i < t.length(); i++) {
            int count_val = char_counts.getOrDefault(t.charAt(i), 0);

            if (count_val == 1) {
                char_counts.remove(t.charAt(i));
            } else {
                char_counts.put(t.charAt(i), count_val - 1);
            }
        }

        return char_counts.isEmpty();
    }
}
