package Determine_if_Two_Events_Have_Conflict;

public class Solution {
    public boolean haveConflict(String[] event1, String[] event2) {
        int start1 = parser(event1[0]);
        int end1 = parser(event1[1]);
        int start2 = parser(event2[0]);
        int end2 = parser(event2[1]);
        return Math.min(end1, end2) < Math.max(start1, start2);
    }


    public int parser(String s) {
        return Integer.parseInt(s.substring(0, 2)) * 60 + Integer.parseInt(s.substring(3, 5));
    }
}
