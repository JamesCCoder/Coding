/**
 * @param {string} word
 * @return {boolean}
 */
var detectCapitalUse = function(word) {
    let pattern = /[A-Z]/;
    let sum = 0; 
    let index = 0;
    for(let i = 0; i<word.length; i++){
        if(pattern.test(word[i])){
            sum++;
            index = i;
        }
    }
    return sum === word.length || (sum === 1 && index === 0) || sum === 0;
};