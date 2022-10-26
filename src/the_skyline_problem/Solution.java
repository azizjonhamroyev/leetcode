package the_skyline_problem;

import java.util.*;

public class Solution {
    public List<List<Integer>> getSkyline(int[][] buildings) {
        List<List<Integer>> res = new ArrayList<>();
        List<List<Integer>> heights = new ArrayList<>();

        for (int[] building : buildings) {
            heights.add(List.of(building[0], -building[2]));
            heights.add(List.of(building[1], building[2]));
        }

        heights.sort((a, b) -> !a.get(0).equals(b.get(0)) ? a.get(0) - b.get(0) : a.get(1) - b.get(1));
        PriorityQueue<Integer> queue = new PriorityQueue<>(Comparator.comparingInt(a -> -a));
        queue.offer(0);
        int max = 0;
        for (List<Integer> height : heights) {
            if (height.get(1) < 0) {
                queue.offer(-height.get(1));
            } else {
                queue.remove(height.get(1));
            }
            int a = queue.peek();
            if (max != a) {
                res.add(List.of(height.get(0), a));
                max = a;
            }
        }
        return res;
    }
}
