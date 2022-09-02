/**
 * @param {string} moves
 * @return {boolean}
 */
var judgeCircle = function(moves) {
    let updown = 0;
    let leftright = 0;
    for(let move of moves){
        if(move === "U"){
            updown++;
        }else if(move === "D"){
            updown--;
        }else if(move === "L"){
            leftright--;
        }else if(move === "R"){
            leftright++;
        }
    }
    return updown === 0 && leftright === 0;
};