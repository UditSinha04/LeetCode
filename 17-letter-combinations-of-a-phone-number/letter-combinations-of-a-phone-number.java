class Solution {
    public List<String> letterCombinations(String digits) {
        List <String> list = new LinkedList<>();

        String arr[] = {"", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};

        if(digits.length()==0){
            return list;
        }

        helper(new StringBuilder(), digits, list, arr, 0);

        return list;
    }

    public static void helper(StringBuilder s, String digits, List<String> list, String arr[], int i){

        if(i == digits.length()){
            list.add(s.toString()); 
            return;
        }

        for(char c : arr[digits.charAt(i) - '0'].toCharArray()){
            s.append(c);
            helper(s,digits,list,arr,i+1);
            s.setLength(s.length()-1);
        }
    }
}