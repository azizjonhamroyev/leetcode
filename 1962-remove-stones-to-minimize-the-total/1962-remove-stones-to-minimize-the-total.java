class Solution {
    public int minStoneSum(int[] piles, int k) {
        PriorityQueue<Integer> queue = new PriorityQueue<>((a, b) -> b - a);

        for (int pile : piles)
            queue.offer(pile);

        while (k-- > 0)
            queue.offer((int) Math.ceil((double)queue.poll() / 2));

        int res = 0;

        while (!queue.isEmpty())
            res += queue.poll();

        return res;
    }

}