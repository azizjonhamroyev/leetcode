public class Solution {
    public long totalCost(int[] costs, int k, int candidates) {
        PriorityQueue<Integer> left = new PriorityQueue<>(Comparator.comparingInt(a -> a));
        PriorityQueue<Integer> right = new PriorityQueue<>(Comparator.comparingInt(a -> a));
        for (int i = 0; i < candidates && i <= costs.length - i - 1; i++) {
            if (i == costs.length - i - 1) {
                left.offer(costs[i]);
            } else {
                left.offer(costs[i]);
                right.offer(costs[costs.length - i - 1]);
            }
        }
        int i = candidates - 1, j = costs.length - candidates;
        long res = 0;
        while (k-- > 0) {
            if (left.isEmpty()) {
                res += right.poll();
            } else if (right.isEmpty()) {
                res += left.poll();
            } else if (i >= j) {
                if (left.peek() < right.peek()) {
                    res += left.poll();
                } else {
                    res += right.poll();
                }
            } else if (left.peek() <= right.peek()) {
                res += left.poll();
                if (++i != j)
                    left.add(costs[i]);
            } else {
                res += right.poll();
                if (--j != i)
                    right.add(costs[j]);
            }
        }
        return res;
    }
}