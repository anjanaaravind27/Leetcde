/**
 * @param {number[]} nums
 * @return {number}
 */
var repeatedNTimes = function(nums) {
  let count=0;
let store=0;
let output=0;
for(let i=0;i<nums.length;i++){
    count=1
    for(let j=1;j<nums.length;j++){
        if(nums[i]===nums[j]){
            count++
        }
    }
        if(store<count){
            store=count 
            output=nums[i]
        }
    
}return output 
    };
