class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> arr = new ArrayList<>();
        List<Integer> temp = new ArrayList<>();
        combination(candidates, target, 0, temp, arr);
        return arr;
    }

    public static void combination(int[] n,int target,int ind,List<Integer> temp,List<List<Integer>> arr) {
		if(target==0) {
			arr.add(new ArrayList<>(temp));
			return;
		}
        if(target<0) return;
		for(int i=ind; i<n.length; i++) {
                temp.add(n[i]);
                combination(n,target-n[i],i,temp,arr);
			    temp.remove(temp.size()-1);
        	
		}
	}
}