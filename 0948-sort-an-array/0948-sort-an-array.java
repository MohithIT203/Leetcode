class Solution {
    public int[] sortArray(int[] nums) {
      PriorityQueue<Integer> pq=new PriorityQueue<>();
      for(int n:nums) pq.add(n);
      int i=0;
      while(!pq.isEmpty()){
        nums[i++]=pq.poll(); 
      }
      return nums;
    }
}