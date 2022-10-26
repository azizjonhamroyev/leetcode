package Check_Distances_Between_Same_Letters;

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] ints = new int[26];
        ints[0] = 1;
        ints[1] = 3;
        ints[3] = 5;
        System.out.println(solution.checkDistances("abaccb", ints));
    }
}
