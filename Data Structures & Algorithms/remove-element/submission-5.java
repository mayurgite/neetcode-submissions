class Solution {
    public int removeElement(int[] nums, int val) {
        int k = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == val) {
                k++;
                shiftArrayToLeft(nums, i, k);

                if (i >= 0)
                    i--;
            }
        }
         for(int num: nums)
             System.out.print(num+", ");
        return nums.length - k;
    }

    private static void shiftArrayToLeft(int[] nums, int pos, int k) {
        for (int i = pos; i < nums.length - 1; i++) {
            nums[i] = nums[i + 1];
        }
        nums[nums.length - k] = Integer.MAX_VALUE;
    }
}