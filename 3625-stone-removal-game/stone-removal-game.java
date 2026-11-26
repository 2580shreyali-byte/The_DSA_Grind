class Solution {
    public boolean canAliceWin(int n) {
        int i=10,flag=0;
        while(n>=0){
            n=n-i;
            if(n<0){
                flag=i;
            }
            i--;
        }
        if(flag%2==0){
            return false;
        }
        else{
            return true;
        }
    }
}