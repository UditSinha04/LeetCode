class Solution {
    public int longestValidParentheses(String s) {
        if(s.length() == 0) return 0;
        int maxLen = 0;
        Stack <Integer> st = new Stack<>();
        st.push(-1); // to handle base condition like string starts with );

        for(int i=0; i<s.length(); i++){

            if(s.charAt(i) == '(') st.push(i);

            else{
                st.pop();
                if(st.isEmpty()) st.push(i);
                maxLen = Math.max(maxLen, i -  st.peek());
            }
        }        

        return maxLen;

        // while(!st.isEmpty()){
        //     System.out.println(st.pop());
        // }
    }
}