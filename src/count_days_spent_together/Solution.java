package count_days_spent_together;

import java.util.HashMap;
import java.util.Map;

public class Solution {
    public int countDaysTogether(String arriveAlice, String leaveAlice, String arriveBob, String leaveBob) {
        HashMap<String, Integer> months = new HashMap<>(Map.of("01", 0, "02", 31, "03", 59, "04", 90, "05", 120, "06", 151, "07", 181, "08", 212, "09", 243, "10", 273));
        months.put("11", 304);
        months.put("12", 334);

        int aliceArriveMonth = months.get(arriveAlice.substring(0, 2)), aliceLeaveMonth = months.get(leaveAlice.substring(0, 2));
        int bobArriveMonth = months.get(arriveBob.substring(0, 2)), bobLeaveMonth = months.get(leaveBob.substring(0, 2));
        int aliceArriveDay = aliceArriveMonth + 10 * (arriveAlice.charAt(3) - '0') + arriveAlice.charAt(4) - '0', aliceLeaveDay = aliceLeaveMonth + 10 * (leaveAlice.charAt(3) - '0') + leaveAlice.charAt(4) - '0';
        int bobArriveDay = bobArriveMonth + 10 * (arriveBob.charAt(3) - '0') + arriveBob.charAt(4) - '0', bobLeaveDay = bobLeaveMonth + 10 * (leaveBob.charAt(3) - '0') + leaveBob.charAt(4) - '0';

        if (aliceArriveDay > bobLeaveDay || bobArriveDay > aliceLeaveDay) return 0;
        return Math.min(aliceLeaveDay, bobLeaveDay) - Math.max(aliceArriveDay, bobArriveDay) + 1;
    }
}