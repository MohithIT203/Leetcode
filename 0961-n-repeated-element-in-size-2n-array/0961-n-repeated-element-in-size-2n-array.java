class Solution {
    public int repeatedNTimes(int[] nums) {
        Map<Integer,Integer> map=new HashMap<>();
        int target=nums.length/2;
        for(int n:nums){
            map.put(n,map.getOrDefault(n,0)+1);
            if(map.get(n)==target){
                return n;
            }
        }
        return 0;
    }
}