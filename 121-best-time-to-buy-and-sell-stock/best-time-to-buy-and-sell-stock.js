var maxProfit = (prices) => {
    let minprofit = 999999;
    let maxprofit = 0;
    for(let i = 0; i< prices.length; i++){
        if(minprofit > prices[i]){
            minprofit = prices[i];
        }else if(prices[i] - minprofit >maxprofit){
            maxprofit = prices[i] - minprofit;
        }
    }
    return maxprofit;
};
