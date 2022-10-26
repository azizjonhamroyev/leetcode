package satisfiability_of_Equality_Equations;

public class Solution {
    int[] characters = new int[26];

    public boolean equationsPossible(String[] equations) {
        for (int i = 0; i < 26; i++) characters[i] = i;
        for (String equation : equations) {
            if (equation.charAt(1) == '=') {
                characters[find(equation.charAt(0) - 'a')] = find(equation.charAt(3) - 'a');
            }
        }
        for (String equation : equations) {
            if (equation.charAt(1) == '!' && find(equation.charAt(0) - 'a') == find(equation.charAt(3) - 'a'))
                return false;
        }
        return true;
    }

    public int find(int x) {
        return characters[x] == x ? x : (characters[x] = find(characters[x]));
    }
}
