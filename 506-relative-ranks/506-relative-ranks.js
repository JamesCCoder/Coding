/**
 * @param {number[]} score
 * @return {string[]}
 */
var findRelativeRanks = function(score) {
    let rank = score.slice(0).sort((a, b) => b - a);
    return score.map((num) =>{
        if(num === rank[0]){
            return "Gold Medal";
        }else if(num === rank[1]){
            return "Silver Medal";
        }else if(num === rank[2]){
            return "Bronze Medal";
        }else{
            return (rank.indexOf(num)+1).toString();
        }
    }) 
};

//     let ranks = nums.slice(0).sort((a, b) => b - a);
    
//     // map places in ranks if no medal
//     return nums.map((num, i) => {
//        if (num === ranks[0]) return 'Gold Medal';
//        else if (num === ranks[1]) return 'Silver Medal';
//        else if (num === ranks[2]) return 'Bronze Medal';
//        else return (ranks.indexOf(num) + 1).toString();
//     });


