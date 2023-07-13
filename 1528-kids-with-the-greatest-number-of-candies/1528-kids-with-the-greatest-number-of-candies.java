class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int currentMax = 0;
        List<Boolean> newMaxCandy = new ArrayList<Boolean>();

        for (int i = 0; i < candies.length; i++) {
            currentMax = Math.max(currentMax, candies[i]);
        }

        for (int j = 0; j < candies.length; j++) {
            if (currentMax <= candies[j] + extraCandies) {
                newMaxCandy.add(true);
            }
            else {
                newMaxCandy.add(false);
            }
        }
        
        return newMaxCandy;
    }
}