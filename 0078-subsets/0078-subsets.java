class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> set=new ArrayList<>();
        List<Integer> res=new ArrayList<>();
        recursion(0,nums,set,res);
        return set;
    }
    public void recursion(int i,int[] nums,List<List<Integer>> set, List<Integer> res){
        if(i==nums.length){
            set.add(new ArrayList<>(res));
            return;
        }
        res.add(nums[i]);
        recursion(i+1,nums,set,res);
        res.remove(res.size()-1);
        recursion(i+1,nums,set,res);
    }
}