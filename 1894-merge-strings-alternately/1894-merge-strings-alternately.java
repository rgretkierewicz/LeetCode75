class Solution {
    public String mergeAlternately(String word1, String word2) {
        int i = 0;
        String mergedStr = "";

        if (word1.length() == 0) {
            return word2;
        }
        if (word2.length() == 0) {
            return word1;
        }

        while (i <= word1.length() || i <= word2.length()) {
            if (i >= word1.length()) {
                mergedStr += word2.substring(i, word2.length());
                return mergedStr;

            }
            else if (i >= word2.length()) {
                mergedStr += word1.substring(i, word1.length());
                return mergedStr;
            }

            else {
                mergedStr += String.valueOf(word1.charAt(i)) + String.valueOf(word2.charAt(i));
                i++;
            } 
        }

        return mergedStr;
   
    }
}