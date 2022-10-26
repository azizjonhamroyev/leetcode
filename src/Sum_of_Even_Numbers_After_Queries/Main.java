package Sum_of_Even_Numbers_After_Queries;

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] ints = solution.sumEvenAfterQueries(new int[]{1, 2, 3, 4}, new int[][]{{1, 0}, {-3, 1}, {-4, 0}, {2, 3}});
        for (int anInt : ints) {
            System.out.println(anInt);
        }
    }
}

//(-3):2=-2(-1)
