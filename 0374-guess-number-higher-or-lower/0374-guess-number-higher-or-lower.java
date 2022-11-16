public class Solution extends GuessGame {
    public int guessNumber(int n) {
        int begin = 1;

        while (begin < n) {
            int mid = begin + (n - begin) / 2;
            int guess = guess(mid);
            if (guess == 0) return mid;
            if (guess == -1) n = mid - 1;
            else begin = mid + 1;
        }
        return begin;
    }
}