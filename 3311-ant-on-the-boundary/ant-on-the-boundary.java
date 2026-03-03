class Solution {
    public int returnToBoundaryCount(int[] nums) {
      int output = 0;
      int count = 0;
      for(int i = 0;i<nums.length;i++){
         count=count+nums[i];
          if(count == 0){
            output++;
          }
      } return output; 
    }
}