var majorityElement = (nums) => {
    
    let res = nums[0];
    let count = 1;
    for(let i = 1; i<nums.length; i++){
        if(nums[i] == res){
            count++;
        }else{
            count--;
        }
        if(count == 0){
            count = 1;
            res = nums[i];
        }
        
    }
    return res;
};
