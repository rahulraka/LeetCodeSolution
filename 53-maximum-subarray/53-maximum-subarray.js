/**
 * @param {number[]} nums
 * @return {number}
 */
var maxSubArray = function(nums) {
    let curr=nums[0]
    let max=nums[0]
    for(let  i=1;i<nums.length;i++){
        if(curr>=0) curr+=nums[i]
        else curr=nums[i]
        if(curr>max) max=curr
    }
    return max
    
};