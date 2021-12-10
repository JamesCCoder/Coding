var containsDuplicate = (nums) => {
    
    let res = new Map();
    
    for(let i = 0; i<nums.length; i++){
        if(res.has(nums[i])){
           return true;
           }
        res.set(nums[i], true);
    }
    return false;
};
