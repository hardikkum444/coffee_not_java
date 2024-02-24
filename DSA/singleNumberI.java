//leetcode easy 136 single number 
//this question was easy to solve by just using the XOR method


class Solution {
    public int singleNumber(int[] nums) {

        int ans = 0;
        
        for(int i =0;i<nums.length;i++){
            ans = ans^nums[i];
        }

        return ans;
        
    }
}

//but i also tried using the storing frequency method
//apparently it doesnt work for negative numbers
//problem for another day?

User
class Solution {
    public int singleNumber(int[] nums) {

        int n = nums.length;

        int max = 0;
        for(int i=0;i<n;i++){
            if(Math.abs(nums[i])>max){
                max = Math.abs(nums[i]);
            }
        }
        
        int[] hash = new int[max+1];

        for(int i=0;i<n;i++){

            hash[Math.abs(nums[i])]+=1;
        }

        int ans = 0;

        for(int i=0;i<=max;i++){
            if(hash[i] == 1){
                ans = i;
                break;
            }
        }

        return ans;
        
    }
}
