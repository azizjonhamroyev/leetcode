package Sum_of_Number_and_Its_Reverse;

import java.util.HashSet;

public class Solution {
    public boolean sumOfNumberAndReverse(int num) {
        if (num == 0) return true;
        HashSet<Integer> set = new HashSet<>();
        for (int i = 1; i < num; i++) {
            if (set.contains(i)) continue;
            int res = 0;
            int a = i;
            while (a > 0) {
                res = res * 10 + a % 10;
                a /= 10;
            }
            if (i + res == num) return true;
            set.add(res);
        }
        return false;
    }
}
