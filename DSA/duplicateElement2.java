//duplicate element question
//done using XOR operation
//not great of a time complexity, not accepted on leetcode

class Solution {
    public int findDuplicate(int[] nums) {
        int ans = 0;
        int n = nums.length;

        for (int i = 0; i < n; i++) {
            ans = ans ^ nums[i];
        }
        for (int i = 1; i <= n-1; i++) {
            ans = ans ^ i;
        }

        return ans;
    }
}
