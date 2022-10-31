class Solution {
    public List<List<String>> mostPopularCreator(String[] creators, String[] ids, int[] views) {
        long max = 0;
        HashMap<String, Long> map = new HashMap<>();
        HashMap<String, Map.Entry<String, Long>> binds = new HashMap<>();
        for (int i = 0; i < views.length; i++) {
            map.put(creators[i], map.getOrDefault(creators[i], 0L) + views[i]);
            max = Math.max(max, map.get(creators[i]));
            Map.Entry<String, Long> entry = binds.get(creators[i]);
            if (entry == null || entry.getValue() < views[i] || entry.getValue() == views[i] && entry.getKey().compareTo(ids[i]) > 0) {
                binds.put(creators[i], Map.entry(ids[i], (long)views[i]));
            }
        }

        ArrayList<List<String>> res = new ArrayList<>();
        for (Map.Entry<String, Long> entry : map.entrySet()) {
            if (entry.getValue() == max) res.add(List.of(entry.getKey(), binds.get(entry.getKey()).getKey()));
        }
        return res;
    }
}