package Find_original_array_from_doubled_array;

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        for (int i : solution.findOriginalArray(new int[]{1, 3, 4, 2, 6, 8})) {
            System.out.println(i);
        }
    }
}
