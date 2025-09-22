class Solution {
    public int maxFrequencyElements(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<>();
        int max=0,tot=0;
        for(int num:nums){
            map.put(num,map.getOrDefault(num,0)+1);
            max=Math.max(max,map.get(num));
        }
        for(int num:nums){
            if(map.get(num)==max){
                tot++;
            }
        }
        return tot;
    }
}