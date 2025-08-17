class Solution {
    public int countHillValley(int[] nums) {
        int hill=0;
        List<Integer> num=new ArrayList<>();
        num.add(nums[0]);
        for(int i=1;i<nums.length;i++){
            if(nums[i]!=nums[i-1]){
                num.add(nums[i]);
            }
        }
        for(int i=1;i<num.size()-1;i++){
            if(num.get(i-1)<num.get(i) && num.get(i+1)<num.get(i)){
                hill++;
            }
            else if(num.get(i-1)>num.get(i) && num.get(i+1)>num.get(i)){
                hill++;
            }
        }
        return hill;
    }
}