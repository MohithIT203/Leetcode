class Solution {
    public List<Integer> addToArrayForm(int[] num, int k) {
        List<Integer> list=new ArrayList<>();
        Stack<Integer> stack=new Stack<>();
        int i=num.length-1,carry=0;
        while(i>=0||carry!=0||k!=0){
            int n=(i>=0)?num[i--]:0;
            int ans=n+(k%10)+carry;
            k/=10;
            stack.add(ans%10);
            carry=ans/10;
        }
        while(!stack.isEmpty()){
            list.add(stack.pop());
        }
        return list;
    }
}