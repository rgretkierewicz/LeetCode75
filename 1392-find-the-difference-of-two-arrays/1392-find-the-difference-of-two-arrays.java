class Solution {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        HashSet<Integer> numsSet1 = new HashSet<Integer>();
        HashSet<Integer> numsSet2 = new HashSet<Integer>();

        for (int num : nums1) {
            numsSet1.add(num);
        }
        for (int num : nums2) {
            numsSet2.add(num);
        }
        
        List<List<Integer>> uniqueList = new ArrayList<>();
        ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();

        for (int num : numsSet2) {
            if (numsSet1.contains(num) == false) {
                list1.add(num);
            }
        }
        for (int num : numsSet1) {
            if (numsSet2.contains(num) == false) {
                list2.add(num);
            }
        }

        uniqueList.add(list2);
        uniqueList.add(list1);
        return uniqueList;
    }
}