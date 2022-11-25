class Solution {
  public int sumSubarrayMins(int[] A) {
    Deque<Integer> stack = new ArrayDeque<>(); // Monotonically non-decreasing
    int[] dp = new int[A.length]; // Min subarray values ending at idx
    int res = 0;
    for (int i = 0; i < A.length; i++) {
      while (!stack.isEmpty() && A[stack.getLast()] > A[i]) stack.removeLast();
      int j = stack.isEmpty() ? -1 : stack.getLast();
      int lastElementSum = j < 0 ? 0 : dp[j];
      dp[i] = lastElementSum + (i - j) * A[i];
      res = (res + dp[i]) % 1_000_000_007;
      stack.addLast(i);
    }
    return res;
  }
}