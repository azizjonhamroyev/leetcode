package Check_Distances_Between_Same_Letters;

public class Solution {
    public boolean checkDistances(String s, int[] distance) {
        Integer[] alp = new Integer[26];
        for (int i = 0; i < s.length(); i++) {
            int index = s.charAt(i) - 'a';
            if (alp[index] == null) alp[index] = i;
            else alp[index] = i - alp[index] - 1;
        }

        for (int i = 0; i < distance.length; i++)
            if (alp[i] != null && distance[i] != alp[i]) return false;
        return true;
    }
}
