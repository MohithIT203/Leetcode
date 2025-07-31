class Solution {
    public int[] separateDigits(int[] nums) {
        Stack<Integer> list=new Stack<>();
        List<Integer> li=new ArrayList<>();
        int j=0;
        for(int i=0;i<nums.length;i++){
            int num=nums[i];
            while(num!=0){
                list.push(num%10);
                num/=10;
            }
            while(!list.isEmpty()){
                li.add(list.pop());
            }
        }
        int arr[]=new int[li.size()];
        for(int i=0;i<li.size();i++){
            arr[j++]=li.get(i);
        }
        return arr;
    }
}