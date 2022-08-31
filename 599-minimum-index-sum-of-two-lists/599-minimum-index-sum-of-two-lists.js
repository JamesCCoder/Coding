/**
 * @param {string[]} list1
 * @param {string[]} list2
 * @return {string[]}
 */
var findRestaurant = function(list1, list2) {
    let myMap = new Map();
    let mySet = new Set();
    for(let i = 0; i<list1.length; i++){
        myMap.set(list1[i], i);
        mySet.add(list1[i]);
    }
    for(let i = 0; i<list2.length; i++){
        myMap.set(list2[i], i + myMap.get(list2[i]));
        if(mySet.has(list2[i])){
            mySet.delete(list2[i]);
        }
    }
    let num = Infinity;
    let res = [];
    for(let i of list1){
        if(!mySet.has(i) && myMap.has(i) && myMap.get(i) < num){
            num = myMap.get(i);
        }
    }
    for(let i of list1){
        if(!mySet.has(i) && myMap.has(i) && myMap.get(i) === num){
            res.push(i);
        }
    }
    return res;
};
