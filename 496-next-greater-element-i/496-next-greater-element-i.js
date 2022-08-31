/**
 * @param {number[]} nums1
 * @param {number[]} nums2
 * @return {number[]}
 */
var nextGreaterElement = function(nums1, nums2) {
    let myMap = new Map();
    for(let i = 0; i<nums2.length; i++){
        for(let j = i+1; j<nums2.length; j++){
            if(nums2[j] > nums2[i]){
                myMap.set(nums2[i], nums2[j])
                break;
            }else{
                myMap.set(nums2[i], -1);
            }
        }
    }
    myMap.set(nums2[nums2.length - 1], -1);
    let res = [];
    for(let i of nums1){
        if(myMap.has(i)){
            res.push(myMap.get(i));
        }
    }
    return res;
};