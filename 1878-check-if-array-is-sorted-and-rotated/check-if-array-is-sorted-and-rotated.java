class Solution {
    public boolean check(int[] nums) {
        int n = nums.length;
        //int smallest = Integer.MAX_VALUE;
        boolean ans = true;

        // for(int i=0; i<n; i++){
        //     smallest = Math.min(smallest, nums[i]);
        // }

        int idx = 0;
        for(int i=0; i<n-1; i++){
            if(nums[i]>nums[i+1]){
                idx = i+1;
                break;
            }
        }

        for(int i=0; i<n-1; i++){
            if((nums[(idx+i)%n])>(nums[(idx+i+1)%n])){
                ans = false;
            }
        }

        return ans;

    }
}