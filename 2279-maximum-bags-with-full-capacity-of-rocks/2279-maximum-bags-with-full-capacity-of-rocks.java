class Solution {
    public int maximumBags(int[] capacity, int[] rocks, int additionalRocks) {
        for (int i = 0; i < capacity.length; i++)
            capacity[i] -= rocks[i];

        Arrays.sort(capacity);

        int res = 0;

        while (additionalRocks > 0 && res < capacity.length)
            if (additionalRocks - capacity[res] >= 0)
                additionalRocks -= capacity[res++];
            else
                break;

        return res;
    }
}