class Solution {
    void swap(int [] arr,int ind1,int ind2)
    {
        int temp= arr[ind1];
        arr[ind1]=arr[ind2];
        arr[ind2]=temp;
    }
    void fun_v2(int [] arr, int wind,HashSet<List<Integer>> res)
    {
        int ind;
        if(wind==arr.length-1)
        {
            ArrayList<Integer> lis= new ArrayList<>();
            for(ind=0;ind<arr.length;ind++)
                lis.add(arr[ind]);
            res.add(new ArrayList<Integer>(lis));
            return;
        }
        for(ind=wind;ind<arr.length;ind++)
        {
            swap(arr,wind,ind);//do
            fun_v2(arr,wind+1,res);//
            swap(arr,wind,ind);//undo
        }
    }
    public List<List<Integer>> permuteUnique(int[] nums) {
        HashSet<List<Integer>> res = new HashSet<>();
        fun_v2(nums,0,res);
        return new ArrayList<>(res);
    }
}