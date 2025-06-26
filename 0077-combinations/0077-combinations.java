class Solution {
    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> arr=new ArrayList<>();
        List<Integer> temp=new ArrayList<>();
        combination(n,k,1,temp,arr);
        return arr;
    }
    public static void combination(int n,int r,int indx,List<Integer> temp,List<List<Integer>> arr) {
		if(temp.size()==r) {
			arr.add(new ArrayList<>(temp));
			return;
		}
		for(int i=indx; i<=n; i++) {
			temp.add(i);
			combination(n,r,i+1,temp,arr);
			temp.remove(temp.size()-1);
		}
	}
}