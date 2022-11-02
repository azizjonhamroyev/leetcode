class Solution {
    public int minMutation(String start, String end, String[] bank) {
        HashMap<String, List<String>> map = new HashMap<>();
        HashMap<String, Boolean> visited = new HashMap<>();
        Queue<Map.Entry<String, Integer>> queue = new LinkedList<>();
        queue.add(Map.entry(start, 1));
        int res = Integer.MAX_VALUE;
        while (!queue.isEmpty()) {
            Map.Entry<String, Integer> entry = queue.poll();
            if (visited.getOrDefault(entry.getKey(), false)) continue;
            visited.put(entry.getKey(), true);
            for (String str : bank)
                if (isHaveOneDistinction(entry.getKey(), str))
                    if (str.equals(end)) res = Math.min(res, entry.getValue());
                    else queue.offer(Map.entry(str, entry.getValue() + 1));
        }
        return res == Integer.MAX_VALUE ? -1 : res;

    }

    private boolean isHaveOneDistinction(String first, String second) {
        int count = 0;
        for (int i = 0; i < first.length(); i++) {
            if (count > 1) return false;
            if (first.charAt(i) != second.charAt(i)) count++;
        }
        return count == 1;
    }

    private int numberOfDistinctions(String first, String second) {
        int count = 0;
        for (int i = 0; i < first.length(); i++) {
            if (first.charAt(i) != second.charAt(i)) count++;
        }
        return count;
    }
}
