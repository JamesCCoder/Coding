var numJewelsInStones = (jewels, stones) => {
    
    let res = 0;
    for(let i = 0; i< stones.length; i++){
        if(jewels.includes(stones[i])){
            res++;
        }
    }
    return res;
};
