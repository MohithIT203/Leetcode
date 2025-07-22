class Solution {
    public int lengthOfLongestSubstring(String s) {
        Set<Character> set=new HashSet<>();
        int sum=0,left=0,right=0,max=0;
        char[] nums=s.toCharArray();
        while(left<nums.length){
            if(!set.contains(nums[left])){
                sum++;
                set.add(nums[left]);
                max=Math.max(max,sum);
                left++;
            }
            else{
                sum--;
                set.remove(nums[right]);
                right++;
            }
        }
        return max;
    }
}