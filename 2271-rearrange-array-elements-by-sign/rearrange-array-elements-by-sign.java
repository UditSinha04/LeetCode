class Solution {
    public int[] rearrangeArray(int[] nums) {
        List<Integer> pos = new ArrayList<>();
        List<Integer> neg = new ArrayList<>();

        for(int num : nums){
            if(num>0){
                pos.add(num);
            } else{
                neg.add(num);
            }
        }

        int res[] = new int[nums.length];
        int i=0, p=0, n=0;

        while(p < pos.size() && n < neg.size()){
            res[i++] = pos.get(p++);
            res[i++] = neg.get(n++);
        }

        return res;
    }
}