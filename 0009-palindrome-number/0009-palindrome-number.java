class Solution {
    public boolean isPalindrome(int x) {
        if (x<0){
            return  false;

        }
        int n=x;
        int num=0;
        int r;
        while(n>0){
            r=n%10;
            num=num*10+r;
            n=n/10;
        }
        if(num==x){
            return true;
        }
        return false;
    }
}