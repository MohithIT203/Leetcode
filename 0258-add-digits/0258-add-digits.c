int addDigits(int num) {
    int temp=0,sum=0;
    while(num/10!=0){
        sum=0;
        while(num>0){
            temp=num%10;
            sum+=temp;
            num/=10;
        }
        num=sum;
        
    }
    return num;
}