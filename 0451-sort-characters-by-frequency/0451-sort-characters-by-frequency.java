class Solution {
    public String frequencySort(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        for (char c : s.toCharArray())
            map.put(c, map.getOrDefault(c, 0) + 1);
        PriorityQueue<Character> queue = new PriorityQueue<>((a, b) -> map.get(b) - map.get(a));
        for (char c : map.keySet())
            queue.offer(c);
        StringBuilder res = new StringBuilder();
        while (!queue.isEmpty())
            res.append(String.valueOf(queue.peek()).repeat(map.get(queue.poll())));
        return res.toString();
    }
}
