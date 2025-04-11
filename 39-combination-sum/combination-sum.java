class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List <List<Integer>> list = new LinkedList<>();
        List <Integer> result = new LinkedList<>();
        int sum = 0;

        helper(candidates, list, result, target, sum, 0);

        return list;
    }

    public static void helper(int candidates[], List <List<Integer>> list, List <Integer> result, int target, int sum, int i){

        if( sum == target ){
            list.add(new ArrayList<>(result));
            return;
        }
        
        if (sum > target || i == candidates.length) return;
        
        // keep
        result.add(candidates[i]);
        helper(candidates, list, result, target, sum + candidates[i], i);
        result.remove(result.size() - 1);

        // dont keep
        helper(candidates, list, result, target, sum, i + 1);
    }
}