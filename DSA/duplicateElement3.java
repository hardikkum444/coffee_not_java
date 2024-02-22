//duplicate element question
//done using hashing the frequency of the elements
//good method for solving, accepted on leetcode

class Solution {
    public int findDuplicate(int[] nums) {

        int n = nums.length;
        int temp = 0;

        int[] arr = new int[n+1];

        for(int i =0;i<n;i++){

            arr[nums[i]]+=1;
            if(arr[nums[i]]>1){

                temp = nums[i];
                // break;
            }
        }

        return temp;
    }

}
