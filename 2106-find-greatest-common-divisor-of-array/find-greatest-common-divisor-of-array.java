class Solution {
    public int findGCD(int[] nums) {
    int big = nums[0];
    int small = nums[0];
    int result = 0;
    for (int i =0 ; i<nums.length;i++){
        big = Math.max(big, nums[i]);
        small = Math.min(small, nums[i]);
        
    } 
    for(int j = small ; j>=1 ;j--)  {
        if(small % j == 0 && big % j == 0){
            result = j ;
            break;
        }
    }return result;
    }
}