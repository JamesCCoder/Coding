class Solution {
    public int findComplement(int num) {
        int todo = num;
        int bit = 1;
        while(todo != 0){
            num = num ^ bit;
            todo = todo >>1;
            bit = bit << 1;
        }
        return num;
    }
}