class Solution {
    public int singleNumber(int[] nums) {
        if(nums.length == 1) return nums[0];

        int num = Integer.MIN_VALUE;
        Arrays.sort(nums);

        for(int i=0; i<nums.length-2; i+=2){
            if(nums[i]!= nums[i+1]){
                num = nums[i];
                break;
            }
        }
        if(num == Integer.MIN_VALUE){
            num = nums[nums.length-1];
        }
        return num;
    }
}