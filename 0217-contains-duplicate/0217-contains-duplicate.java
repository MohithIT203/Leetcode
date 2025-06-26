class Solution {
    public boolean containsDuplicate(int[] nums) {
        int count=0;
        Set<Integer> n=new HashSet<>();
        for(int num:nums){
            if(n.contains(num)){
                return true;
            }
            n.add(num);
        }
        return false;
    }
}