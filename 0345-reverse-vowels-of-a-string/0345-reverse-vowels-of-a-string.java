class Solution {

    public boolean isVowel(char c) {
        c = Character.toLowerCase(c);
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u';
    }

    public String reverseVowels(String s) {
        int start = 0;
        int end = s.length() - 1;
        char[] sChars = s.toCharArray();

        while (start < end) {
            while (start < end && !isVowel(sChars[start])) {
                start++;
            }
            while (end > start && !isVowel(sChars[end])) {
                end--;
            }

            char temp = sChars[start];
            sChars[start] = sChars[end];
            sChars[end] = temp;

            start++;
            end--;

        }

        return new String(sChars);
    }
}
