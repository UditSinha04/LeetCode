class Solution {
    public String removeDuplicateLetters(String s) {
        StringBuilder str = new StringBuilder("");
        boolean visited[] = new boolean[26];
        Stack <Character> st = new Stack<>();
        int freq[] = new int[26];

        for(char c :s.toCharArray()){
            freq[c - 'a']++;
        }

        for (char c : s.toCharArray()) {
            freq[c - 'a']--; 

            if (visited[c - 'a']) continue;

            
            while (!st.isEmpty() && st.peek() > c && freq[st.peek() - 'a'] > 0) {
                visited[st.pop() - 'a'] = false;
            }

            st.push(c);
            visited[c - 'a'] = true;
        }

        for (char c : st) {
            str.append(c);
        }
        
        return str.toString();
    }
}
