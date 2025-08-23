class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int n = nums.length;
        int max = Integer.MIN_VALUE;
        int cnt = 0;

        for(int i=0; i<n; i++){
            if(nums[i]==1){
                cnt++;
                max = Math.max(cnt,max);
            } else{
                cnt = 0;
            }
        }

        return Math.max(cnt, max);
    }
}