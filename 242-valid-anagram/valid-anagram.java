class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) return false;
        int arr[] = new int[26];

        for(int i=0; i<s.length(); i++){
            int idx = s.charAt(i)-'a';
            arr[idx]++;
        }

        for(int i=0; i<t.length(); i++){
            int idx = t.charAt(i)-'a';
            arr[idx]--;
        }

        for(int i : arr){
            if(i>0) return false;
        }

        return true;
    }
}