package find_duplicate_file_in_system;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Solution {
    public List<List<String>> findDuplicate(String[] paths) {
        HashMap<String, List<String>> map = new HashMap<>();

        for (String path : paths) {
            String[] a = path.split(" ");
            String d = a[0];
            for (int i = 1; i < a.length; ++i) {
                String f = a[i].substring(0, a[i].indexOf("("));
                String c = a[i].substring(a[i].indexOf("(") + 1, a[i].length() - 1);
                List<String> ways = map.getOrDefault(c, new ArrayList<>());
                ways.add(d + "/" + f);
                map.put(c, ways);
            }
        }
        map.entrySet().removeIf(e -> e.getValue().size() < 2);
        return new ArrayList<>(map.values());
    }
}
