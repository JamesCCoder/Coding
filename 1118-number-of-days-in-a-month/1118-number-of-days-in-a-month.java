class Solution {
    public int numberOfDays(int year, int month) {
        int res = 0;
        if((month == 1)||(month == 3)||(month == 5)||(month == 7)||(month == 8)||(month == 10)||(month == 12)){
            res = 31;
        }else if((month == 4)||(month == 6)||(month == 9)||(month == 11)){
            res = 30;
        }else if(((month == 2) && (year % 4 == 0) && (year % 400 == 0)&& (year % 100 == 0))||((year % 4 == 0)&&(year % 100 != 0))){
            res = 29;
        }else{
            res = 28;
        }
        return res;
    }
}


