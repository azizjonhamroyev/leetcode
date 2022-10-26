package Sort_the_People;

public class Solution {
    public String[] sortPeople(String[] names, int[] heights) {

        for (int i = 0; i < names.length - 1; i++) {
            for (int j = 0; j < names.length - i - 1; j++) {
                if (heights[j] < heights[j + 1]) {
                    int temp = heights[j];
                    heights[j] = heights[j + 1];
                    heights[j + 1] = temp;
                    String temp2 = names[j];
                    names[j] = names[j + 1];
                    names[j + 1] = temp2;
                }
            }
        }
        return names;
    }
}
