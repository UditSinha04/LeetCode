class Solution {
    public int numberOfSubstrings(String s) {
        int n=s.length();
        int ans=0;
        int arr[]={-1,-1,-1};
        // int min=Integer.MAX_VALUE;
        for(int i=0;i<n;i++)
        {
            
            arr[s.charAt(i)-'a']=i;
            int minIndex=Integer.MAX_VALUE;
            for(int k=0;k<3;k++)
                minIndex=Math.min(minIndex,arr[k]);
                ans+=minIndex+1;
        }
        return ans;
    }
}