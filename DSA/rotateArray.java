//this is leetcode 189 Rotate array question

//so i tried doing this through the following solution which us the expexted soln
// i also tried doing it through the i+k % nums.length method, but for some reason it didnt work


class Solution {
    public void rotateArray (int[] nums, int k) {

        // lets try using the entire reversing code

        k = k % nums.length; //not doing it unecessary amount of times
        int l = 0;
        int r = nums.length-1;

        while(l<r){

            int store = nums[l];
            nums[l] = nums[r];
            nums[r] = store;
            l++;
            r--;
        }

        int l1 = 0;
        int r1 = k-1;

        while(l1<r1){

            int store = nums[l1];
            nums[l1] = nums[r1];
            nums[r1] = store;
            l1++;
            r1--;
        }

        int l2 = k;
        int r2 = nums.length-1;

        while(l2<r2){

            int store = nums[l2];
            nums[l2] = nums[r2];
            nums[r2] = store;
            l2++;
            r2--;
        }


        for(int i =0;i<nums.length;i++){
            System.out.print(nums[i]+" ");
        }

    }
}
