package Integer_to_Roman;

import java.util.HashMap;

public class Solution {
    public String intToRoman(int num) {
        HashMap<Integer, Character> map = new HashMap<>();
        map.put(1, 'I');
        map.put(5, 'V');
        map.put(10, 'X');
        map.put(50, 'L');
        map.put(100, 'C');
        map.put(500, 'D');
        map.put(1000, 'M');

        StringBuilder res = new StringBuilder();
        int i = 0;
        while (num > 0) {
            int a = num % 10;
            num /= 10;
            int degree = (int) Math.pow(10, i);
            int b = a * degree;
            if (a == 1) res.append(map.get(b));
            else if (a == 2) res.append(map.get(degree)).append(map.get(degree));
            else if (a == 3) res.append(map.get(degree)).append(map.get(degree)).append(map.get(degree));
            else if (a == 4) res.append(map.get(degree * 5)).append(map.get(degree));
            else if (a == 5) res.append(map.get(b));
            else if (a == 6) res.append(map.get(degree)).append(map.get(5 * degree));
            else if (a == 7) res.append(map.get(degree)).append(map.get(degree)).append(map.get(5 * degree));
            else if (a == 8) res.append(map.get(degree)).append(map.get(degree)).append(map.get(degree)).append(map.get(5 * degree));
            else if (a == 9) res.append(map.get(degree * 10)).append(map.get(degree));
            i++;
        }
        return res.reverse().toString();
    }
}
