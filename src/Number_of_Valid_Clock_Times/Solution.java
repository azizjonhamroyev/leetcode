package Number_of_Valid_Clock_Times;

public class Solution {
    public int countTime(String time) {
        int h = 1, m = 1;
        if (time.charAt(0) == '?' && time.charAt(1) == '?') {
            h = 24;
        } else if (time.charAt(0) == '?') {
            h = time.charAt(1) - '0' < 4 ? 3 : 2;
        } else if (time.charAt(1) == '?') {
            h = time.charAt(0) - '0' < 2 ? 10 : 4;
        }

        if (time.charAt(3) == '?' && time.charAt(4) == '?') {
            m = 60;
        } else if (time.charAt(3) == '?') {
            m = 6;
        } else if (time.charAt(4) == '?') {
            m = 10;
        }
        return h * m;
    }
}
