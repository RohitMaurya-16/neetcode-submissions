class Solution {
    public boolean isAnagram(String s, String t) {
        // Anagrams must have the same length.
        if (s.length() != t.length()) {
            return false;
        }

        // Array to store the frequency of each character (a-z).
        // 26 is used because the strings contain only lowercase letters.
        int[] charCounts = new int[26];

        for (int i = 0; i < s.length(); i++) {
            // Increment count for characters in string s
            charCounts[s.charAt(i) - 'a']++;
            // Decrement count for characters in string t
            charCounts[t.charAt(i) - 'a']--;
        }

        // If the strings are anagrams, all counts in the array will be zero.
        for (int count : charCounts) {
            if (count != 0) {
                return false;
            }
        }

        return true;
    }
}
