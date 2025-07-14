class Solution {
    public boolean isPalindrome(String s) {
        String cleaned = s.replaceAll("[^a-zA-Z0-9]", "");
        String rev = new StringBuilder(cleaned).reverse().toString();

        if(rev.equalsIgnoreCase(cleaned)) return true;

        return false;
    }
}