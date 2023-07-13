class Solution {
    public void moveZeroes(int[] nums) {
        int len = nums.length;
        int i = 0; // First iterator
        int j = 1; // Second iterator

        //If one or less items in array, we are done
        if (len <= 1) {
            return;
        }

        while (j < len) {
            if(nums[i] == 0 && nums[j] != 0) {
                // Shifting the zero value to the right 
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j]= temp;
                i++;
                j++;
            }
            else if (nums[i] == 0 && nums[j] == 0) {
                j++;
            }
            else {
                i++;
                j++;
            }
        }
    }
}