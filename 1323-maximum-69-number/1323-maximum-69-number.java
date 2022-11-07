public class Solution {
    public int maximum69Number(int num) {
        int temp = 0, n = 0, degree = 1, temp2 = 1;
        while (num > 0) {
            int mod = num % 10;
            if (mod == 6) {
                temp = 9 * degree + n;
                temp2 = degree * 10;
            }
            n = mod * degree + n;
            degree *= 10;
            num /= 10;
        }
        return (n / temp2) * temp2 + temp;
    }
}