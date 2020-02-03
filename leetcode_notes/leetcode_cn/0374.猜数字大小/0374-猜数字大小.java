/* The guess API is defined in the parent class GuessGame.
   @param num, your guess
   @return -1 if my number is lower, 1 if my number is higher, otherwise return 0
      int guess(int num); */

public class Solution extends GuessGame {
    public int guessNumber(int n) {
        if(guess(n) == 1) return n;
        if(guess(1) == -1) return 1;
        
        int left = 0, right = n;
        while(left <= right) {
            int mid = (left + right) >>> 1;
            int state = guess(mid);
            if(state == 0) return mid;
            else if(state == 1) left = mid + 1;
            else right = mid - 1;
        }
        return -1;
    }
}