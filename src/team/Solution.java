package team;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[][] participants = new int[n][3];
        int result = 0;
        for (int i = 0; i < participants.length; i++) {
            participants[i][0] = in.nextInt();
            participants[i][1] = in.nextInt();
            participants[i][2] = in.nextInt();
            if (participants[i][0] + participants[i][1] + participants[i][2] >= 2) result++;
        }
        System.out.println(result);
    }
}
