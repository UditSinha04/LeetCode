class Solution {
    public int maxSubarraySumCircular(int[] nums) {
        int totalSum = 0;
        int currMaxSum = 0, maxSum = Integer.MIN_VALUE;
        int currMinSum = 0, minSum = Integer.MAX_VALUE;

        for (int num : nums) {
            totalSum += num;
            currMaxSum = Math.max(currMaxSum + num, num);
            maxSum = Math.max(maxSum, currMaxSum);
            currMinSum = Math.min(currMinSum + num, num);
            minSum = Math.min(minSum, currMinSum);
        }

        return maxSum < 0 ? maxSum : Math.max(maxSum, totalSum - minSum);
    }
}
