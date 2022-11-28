class Solution {
    public List<List<Integer>> findWinners(int[][] matches) {
        HashSet<Integer> winners = new HashSet<>();
        HashMap<Integer, Integer> losers = new HashMap<>();

        for (int[] match : matches) {
            winners.add(match[0]);
            losers.put(match[1], losers.getOrDefault(match[1], 0) + 1);
        }

        ArrayList<Integer> undefeated = new ArrayList<>();
        ArrayList<Integer> havaADefeat = new ArrayList<>();

        for (int key : winners)
            if (!losers.containsKey(key))
                undefeated.add(key);

        for (Map.Entry<Integer, Integer> entry : losers.entrySet())
            if (entry.getValue() == 1)
                havaADefeat.add(entry.getKey());

        Collections.sort(undefeated);
        Collections.sort(havaADefeat);
        
        return List.of(undefeated, havaADefeat);
    }
}