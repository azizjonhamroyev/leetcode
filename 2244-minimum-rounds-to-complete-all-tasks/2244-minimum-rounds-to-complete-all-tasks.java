class Solution {
    public int minimumRounds(int[] tasks) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int task : tasks)
            map.put(task, map.getOrDefault(task, 0) + 1);


        int res = 0;

        for (int value : map.values()) {
            if (value == 1)
                return -1;

            if (value % 3 == 0)
                res += value / 3;
            else
                res += value / 3 + 1;
        }
        return res;
    }
}