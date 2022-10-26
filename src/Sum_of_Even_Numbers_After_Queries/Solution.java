package Sum_of_Even_Numbers_After_Queries;

public class Solution {
    public int[] sumEvenAfterQueries(int[] nums, int[][] queries) {
        int sumOfEvens = 0, count = 0;
        int[] res = new int[queries.length];
        for (int num : nums) sumOfEvens += num % 2 == 0 ? num : 0;
        for (int[] query : queries) {
            if (nums[query[1]] % 2 == 0 && query[0] % 2 == 0) {
                sumOfEvens += query[0];
            } else if (nums[query[1]] % 2 == 0 && query[0] % 2 != 0) {
                sumOfEvens -= nums[query[1]];
            } else if (nums[query[1]] % 2 != 0 && query[0] % 2 != 0) {
                sumOfEvens += nums[query[1]] + query[0];
            }
            nums[query[1]] += query[0];
            res[count++] = sumOfEvens;
        }
        return res;
    }
}
