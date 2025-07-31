class Solution {
    public List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> list=new ArrayList<>();
        for(int i=left;i<=right;i++){
            if(helper(i)){
                list.add(i);
            }
        }
        return list;
    }
    public boolean helper(int num){
        int temp=num;
        while(temp>0){
            int divisor=temp%10;
            if(divisor==0)return false;
            if(num%divisor!=0) return false;
            temp/=10;
        }
        return true;
    }
}