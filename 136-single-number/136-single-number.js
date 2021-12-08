/**
 * @param {number[]} nums
 * @return {number}
 */
var singleNumber = (nums) => {
    
    let sortNums = nums.sort();
    let count = 0;
    for(var i=0; i<nums.length-1; i++){
        if(sortNums[i]==sortNums[i+1]){
            count++;
        }else{
            count--;
            if (count < 0){
            return sortNums[i];
            }
        }

         
    }
    return sortNums[i];
};
