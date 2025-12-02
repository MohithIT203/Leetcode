class Solution {
    public char kthCharacter(int k) {
        int nearSquare=1,count=0;
        while(nearSquare<k){
            nearSquare*=2;
        }
        nearSquare/=2;
        while(k!=1){
            if(k-nearSquare>0){
                k=k-nearSquare;
                count++;
            }
            nearSquare/=2;
        }
        return (char)('a'+count);
    }
}