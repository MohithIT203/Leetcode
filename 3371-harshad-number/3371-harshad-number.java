class Solution {
    public int sumOfTheDigitsOfHarshadNumber(int x) {
        int n=digitsum(x);
        if(x%n==0){
            return n;
        }
        return -1;
    }
    public int digitsum(int n){
        int sum=0;
        while(n!=0){
            sum+=n%10;
            n/=10;
        }
        return sum;
    }
}