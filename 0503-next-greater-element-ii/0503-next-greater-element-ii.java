class Solution {
    public int[] nextGreaterElements(int[] nums) {
        int n=nums.length;
        int fin[] = new int[n];
        Arrays.fill(fin,-1);
        Stack<Integer> stack = new Stack<>(); //index
        //duplicate exists --> no value based mapping
        for(int i=0;i<2*n;i++){
            int index=i%n;
            while(!stack.isEmpty() && nums[stack.peek()]<nums[index]){
                fin[stack.pop()]=nums[index];
            }
            if(i<n){
                stack.push(index);
            }
        }
        return fin;
    }
}