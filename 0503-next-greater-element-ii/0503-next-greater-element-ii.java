class Solution {
    public int[] nextGreaterElements(int[] nums) {
        int n=nums.length;
        int fin[] = new int[n];
        Stack<Integer> stack = new Stack<>(); //index
        //duplicate exists --> no value based mapping
        for(int i=2*n-1;i>=0;i--){
            int curr=nums[i%n];
            while(!stack.isEmpty() && stack.peek()<=curr){
                stack.pop();
            }
            if(i<n){
                if(stack.isEmpty()){
                    fin[i]=-1;
                }
                else{
                    fin[i]=stack.peek();
                }   
            }
            stack.push(curr);
        }
        return fin;
    }
}