/**
 * @param {number[]} nums
 * @return {number}
 */
var findMaxConsecutiveOnes = function(nums) {
    let res = 0;
    let num = 0;
    for(let i of nums){
        if(i === 1){
            num++;
            if(num > res){
                res = num;
            }
        }else{
            num = 0;
        }
    }
    return res;
};