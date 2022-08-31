/**
 * @param {string} s
 * @return {boolean}
 */
var checkRecord = function(s) {
    let a = 0;
    for(let i of s){
        if(i === "A"){
            a++;
        }
    }
    let m = 0;
    let n = 0;
    let max = 0;
    while(m < s.length){
        if(s[m] === "L"){
            n++;
            max = Math.max(max, n);
        }else{
            n = 0;
        }
        m++;
    }
    return a < 2 && max < 3;
};