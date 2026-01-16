class Solution {
    public int[] recoverOrder(int[] order, int[] friends) {
        int[] finishing_order=new int[friends.length];
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<friends.length;i++){
            map.put(friends[i],-1);
        }
        int ind=0;
        for(int i=0;i<order.length;i++){
            if(map.containsKey(order[i])){
                finishing_order[ind++]=order[i];
            }
        }
        return finishing_order;
    }
}