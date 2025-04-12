bool isPalindrome(int x) {
    int rem=0,num=x;
    double sum=0;
    while(x>0)
    {
        rem=x%10;
        sum=sum*10+rem;
        x/=10;
    }
    if(num==sum)
    {
        return true;
    }
    
        return false;
    
    
}