int myAtoi(char* s) {
    long long num=atoll(s);

   if (num < INT_MIN) {
        return INT_MIN;
    } else if (num > INT_MAX) {
        return INT_MAX;
    } else {
        return (int)num;
    }
   
}