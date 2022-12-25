class Solution {
    public int[] answerQueries(int[] nums, int[] queries) {

        Arrays.sort(nums);

        for (int i = 0; i < queries.length; i++) {
            int count = 0;
            int sum = 0;

            for (int num : nums) {
                if (sum + num <= queries[i]) {
                    sum += num;
                    count++;
                } else break;
            }
            queries[i] = count;
        }
        return queries;
    }
}