class Solution {
    public boolean validPalindrome(String s) {
        int l=0,r=s.length()-1;
        while(l<=r){
            if(s.charAt(l)!=s.charAt(r)){
                return ispalindrome(s,l+1,r) || ispalindrome(s,l,r-1);
            }
            l++;
            r--;
        }
        return true;
    }
    public static boolean ispalindrome(String str,int l,int r){
        while(l<=r){
            char ch1=str.charAt(l);
            char ch2=str.charAt(r);
            if(ch1!=ch2){
                return false;
            }
            l++;
            r--;
        }
        return true;
    }
}