class Solution {
    public String smallestPalindrome(String s) {

        int[] freq = new int[26];

        // Count frequency of each character
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            freq[ch - 'a']++;
        }

        StringBuilder left = new StringBuilder();
        StringBuilder middle = new StringBuilder();

        // Build the left half and middle character
        for (int i = 0; i < 26; i++) {

            // Add half of the occurrences to the left half
            for (int j = 0; j < freq[i] / 2; j++) {
                left.append((char)('a' + i));
            }

            // If frequency is odd, store the middle character
            if (freq[i] % 2 == 1) {
                middle.append((char)('a' + i));
            }
        }

        // Right half is the reverse of the left half
        StringBuilder right = new StringBuilder(left);
        right.reverse();

        // Return the complete palindrome
        return left.toString() + middle.toString() + right.toString();
    }
}