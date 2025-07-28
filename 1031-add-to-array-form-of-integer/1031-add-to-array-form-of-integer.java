class Solution {
    public List<Integer> addToArrayForm(int[] num, int k) {
        List<Integer> list=new ArrayList<>();
        int i=num.length-1,carry=0;
        while(i>=0||carry!=0||k!=0){
            int n=(i>=0)?num[i--]:0;
            int ans=n+(k%10)+carry;
            k/=10;
            list.add(ans%10);
            carry=ans/10;
        }
        Collections.reverse(list);
        return list;
    }
}