package Minimum_Time_to_Make_Rope_Colorful;

import java.util.Comparator;
import java.util.PriorityQueue;

public class Solution {
    public int minCost(String colors, int[] neededTime) {
        PriorityQueue<Integer> queue = new PriorityQueue<>(Comparator.comparingInt(a -> a));
        char[] chars = colors.toCharArray();
        int res = 0;
        for (int i = 0; i < chars.length; i++) {
            char c = chars[i];
            queue.add(neededTime[i]);
            while (i + 1 < chars.length && chars[i + 1] == c) queue.add(neededTime[++i]);
            while (queue.size() > 1) res += queue.poll();
            queue.clear();
        }
        return res;
    }
}
