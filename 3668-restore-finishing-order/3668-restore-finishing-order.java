class Solution {
    public int[] recoverOrder(int[] order, int[] friends) {
        int[] finishing_order=new int[friends.length];
        HashSet<Integer> set = new HashSet<>();
        for(int i=0;i<friends.length;i++){
            set.add(friends[i]);
        }
        int ind=0;
        for(int i=0;i<order.length;i++){
            if(set.contains(order[i])){
                finishing_order[ind++]=order[i];
            }
        }
        return finishing_order;
    }
}