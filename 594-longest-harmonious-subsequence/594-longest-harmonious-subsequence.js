/**
 * @param {number[]} nums
 * @return {number}
 */
var findLHS = function(nums) {
     let map = new Map()
    
    for(let num of nums){
        if(map.has(num)){
            map.set(num, map.get(num)+1)
        }else{
            map.set(num, 1)
        }
    }
    
    let max = 0
    
    for(let num of nums){
        let val1 = map.get(num)
        let val2 = map.get(num-1) || 0
        let val3 = map.get(num+1) || 0
        
        let greater = 0
        
        if(val2 > 0 || val3 > 0){
          greater = Math.max(val1 +val2, val1 + val3)  
        } 
        
        max = Math.max(greater, max)
    }
    
    
    return max
};