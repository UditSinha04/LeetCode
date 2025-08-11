class Solution {
    public int reverse(int x) {
        int y = 0;
        int sign = x < 0 ? -1 : 1;
        x = x*sign; 


        while(x>0){
            if(y>Integer.MAX_VALUE/10 || y<Integer.MIN_VALUE/10) return 0;
            y *= 10;
            y += x%10;
            x /=10;
        }

        if(y>Math.pow(2,31)-1) return 0;

        return sign*y;
    }
}