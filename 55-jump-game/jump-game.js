var canJump = (nums) =>{
    if(nums.length<=1){
        return true;
    }
    let max = nums[0];
    for(let i = 0; i<nums.length; i++){
        if((nums[i]==0) && (max<=i)){
            return false;
        }
        if(i + nums[i]>max){
            max = i + nums[i];
        }
        if(max>= nums.length-1){
            return true;
        }
    }
    return false;
    
};
