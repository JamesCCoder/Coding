/**
 * @param {number[]} nums
 * @return {number}
 */
var findLengthOfLCIS = function(nums) {
    let sum = 1;
    let res = 1;
    for(let i = 1;i<nums.length; i++){
        if(nums[i] - nums[i-1] > 0){
            sum++;
            res = Math.max(sum, res);
        }else{
            sum = 1;
        }
    }
    return res;
};