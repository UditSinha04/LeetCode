class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> st = new ArrayList<>();
        helper(n, st, new StringBuilder(), 0, 0);
        return st;
    }

    public void helper(int n, List<String> st, StringBuilder output, int OB, int CB){
        if (OB == CB && OB == n) {
            st.add(output.toString());
            return;
        } 
        
        if (OB < n) {
            helper(n, st, new StringBuilder(output).append('('), OB + 1, CB);
        }

        if (CB < OB) {
            helper(n, st, new StringBuilder(output).append(')'), OB, CB + 1);
        }
    }
}
