class Solution {
    public int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> pq=new PriorityQueue<>(Collections.reverseOrder());
        for(int n:stones) pq.add(n);
        while(pq.size()>1){
            int n1=pq.poll();
            int n2=pq.poll();
            if(n1!=n2){
                pq.offer(Math.abs(n2-n1));
            }
        }
        return (pq.size()==0)?0:pq.poll();
    }
}