class Solution {

    public boolean isVowel(char c) {
        c = Character.toLowerCase(c);
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u';
    }

    public int maxVowels(String s, int k) {
        int len = s.length();
        int currVowels = 0;
        int maxVowels = 0;


        for (int i = 0; i < len; i++) {
            if (isVowel(s.charAt(i))) {
                currVowels++;
            }

            if (i >= k - 1) {
                maxVowels = Math.max(maxVowels, currVowels);

                if(isVowel(s.charAt(i-(k-1)))) {
                    currVowels--;
                }
            }

        }
        
        return maxVowels;
    }


}
