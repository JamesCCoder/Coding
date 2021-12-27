/** 
 * Forward declaration of guess API.
 * @param  num   your guess
 * @return 	     -1 if num is lower than the guess number
 *			      1 if num is higher than the guess number
 *               otherwise return 0
 * int guess(int num);
 */

public class Solution extends GuessGame {
    public int guessNumber(int n) {
        int s = 1;
        int l = n;
        while (s<= l){
            int m = (l - s)/2 + s;
            int res = guess(m);
            if(res == 0){
                return m;
            }else if(res < 0){
                l= m-1;
            }else{
                s=m+1;
            }
        }
        return -1;
    }
}