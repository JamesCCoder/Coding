/**
 * @param {string} s
 * @return {boolean}
 */
var isValid = function(s) {
    const res = [];
    for(let i of s){
        if(i === "("){
            res.push(")");
        }else if(i === "["){
            res.push("]");
        }else if(i === "{"){
            res.push("}");
        }else if(res.pop() !== i){
            return false;
        }
    }
    return res.length === 0;
};