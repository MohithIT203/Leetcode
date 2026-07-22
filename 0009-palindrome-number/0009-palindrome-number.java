class Solution {
    public boolean isPalindrome(int x) {
        int reversedNum=0,sum=x;
        if(x<0) sum=x*-1;
        while(x!=0){
            int temp = x%10;
            reversedNum = reversedNum*10+temp;
            x/=10;
        }
        return sum==reversedNum;
    }
}