class Solution {
    public int reverse(int num){
        int reversed_num=0;
        while(num!=0){
            int temp=num%10;
            reversed_num=reversed_num*10+temp;
            num/=10;
        }
        return reversed_num;
    }
    public int countDistinctIntegers(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for(int i=0;i<nums.length;i++){
            set.add(nums[i]);
            set.add(reverse(nums[i]));
        }
        return set.size();
    }
}