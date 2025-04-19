class Solution {
    public int maxSubarraySumCircular(int[] nums) {
        int nonCircularSum = kadaneMaxSum(nums);
        int totalSum = 0;
        for(int i=0;i<nums.length;i++){
            totalSum += nums[i];
            nums[i] = -nums[i];
        }

        int circularSum = totalSum + kadaneMaxSum(nums);
        if(circularSum == 0){
            return nonCircularSum;
        }
        return Math.max(circularSum, nonCircularSum);
    }

    int kadaneMaxSum(int[] nums){
        int currSum = nums[0];
        int maxSum = nums[0];

        for(int i=1;i<nums.length;i++){
            if(currSum < 0){
                currSum = 0;
            }
            currSum = nums[i] + currSum;
            maxSum = Math.max(maxSum, currSum);
        }
        return maxSum;
    }
}