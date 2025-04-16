class Solution {
    public int evalRPN(String[] tokens) {
        if(tokens.length == 0) return 0;

        Stack <Integer> st = new Stack<>();
        int c = 0;
        for(String token : tokens){
            if(isNumber(token)){
                st.push(Integer.parseInt(token));
            }

            else{
                int a = st.pop();
                int b = st.pop();
                if(token.equals("+")){
                    c = b+a;
                }
                if(token.equals("-")){
                    c = b-a;
                }
                if(token.equals("*")){
                    c = b*a;
                }
                if(token.equals("/")){
                    c = b/a;
                } 
                st.push(c);
            }
        }

        return st.peek();
    }

    private boolean isNumber(String s) {
        return s.matches("-?\\d+"); 
    }

}