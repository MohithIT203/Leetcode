class Solution {
    public int maxSubarrayLength(int[] nums, int k) {
        int l=0,r=0,maxl=0;
        HashMap<Integer,Integer> map=new HashMap<>();
        while(l<nums.length && r<nums.length){
            map.put(nums[r],map.getOrDefault(nums[r],0)+1);
            if(map.get(nums[r])>k){
                while(map.get(nums[r])>k){
                    map.put(nums[l],map.get(nums[l])-1);
                    l++;
                }
            }
            maxl=Math.max(maxl,(r-l+1));
            r++;
        }
        return maxl;
    }
}