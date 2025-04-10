class Solution {
    public List<String> letterCombinations(String digits) {
        List <String> list = new LinkedList<>();
        String arr[] = {"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};

        if(digits.length()==0){
            return list;
        }

        helper(digits, list, arr, 0, new StringBuilder());
        
        return list;
    }

    public static void helper(String digits, List <String> list, String arr[], int i, StringBuilder s ){

        if(i == digits.length()){
           list.add(s.toString());
           return;
        }

        // i = 0, 2
        // all possible options
        
        for (char c: arr[digits.charAt(i) - '0'].toCharArray()) {
            s.append(c);
            helper(digits,list,arr,i+1,s);
            s.setLength(s.length()-1);
        }
    }
}   