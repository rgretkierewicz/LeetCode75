class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        HashMap<Integer, Integer> numOccurences = new HashMap<>();

        for (int num : arr) {
            numOccurences.put(num, numOccurences.getOrDefault(num, 0) + 1);
        }

        HashSet<Integer> set = new HashSet<>(numOccurences.values());

        return numOccurences.size() == set.size();
    }
}
