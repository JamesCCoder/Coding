/**
 * @param {number[]} nums
 * @return {number[]}
 */
var findErrorNums = function(nums) {
    let myMap = new Map();
    let normal = [];
    let res = [];
    for(let i = 1; i<=nums.length; i++){
        myMap.set(i, 1);
        normal.push(i);
    }
    for(let i = 0; i<nums.length; i++){
        if(myMap.has(nums[i])){
            myMap.set(nums[i], myMap.get(nums[i]) - 1);
        }
    }
    for(let i of normal){
        if(myMap.get(i) === -1){
            res.push(i);
        }

    }
        for(let i of normal){

        if(myMap.get(i) === 1){
            res.push(i);
        }
    }
    return res;
};