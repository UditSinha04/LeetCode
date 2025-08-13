class Solution {
    public boolean isPalindrome(String s) {
        String cleaned = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        int n = cleaned.length();
        return helper(cleaned, n, 0, n-1);
    }

    public boolean helper(String cleaned, int n, int i, int j){
        if(i>=j) return true;

        if(cleaned.charAt(i)==cleaned.charAt(j)){
            return helper(cleaned, n, i+1, j-1);
        }
        
        return false;
    }
}