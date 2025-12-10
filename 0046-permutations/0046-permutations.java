class Solution {
    void fun_v1(int [] arr, List<Integer> perm,boolean [] vis,List<List<Integer>> res)
    {
          if(perm.size()==arr.length)
          {
            res.add(new ArrayList<>(perm));
            return;
          }
          int ind;
          for(ind=0;ind<arr.length;ind++)  //choices
          {
                if(vis[ind]==false)//validate choice
                {
                    vis[ind]=true;
                    perm.add(arr[ind]);//do
                    fun_v1(arr,perm,vis,res);
                    perm.remove(perm.size()-1);//undo
                    vis[ind]=false;
                }
          }
    }
    void swap(int [] arr,int ind1,int ind2)
    {
        int temp= arr[ind1];
        arr[ind1]=arr[ind2];
        arr[ind2]=temp;
    }
    void fun_v2(int [] arr, int wind,List<List<Integer>> res)
    {
        int ind;
        if(wind==arr.length-1)
        {
            ArrayList<Integer> lis= new ArrayList<>();
            for(ind=0;ind<arr.length;ind++)
                lis.add(arr[ind]);
            res.add(new ArrayList<>(lis));
            return;
        }
        for(ind=wind;ind<arr.length;ind++)
        {
            swap(arr,wind,ind);//do
            fun_v2(arr,wind+1,res);//
            swap(arr,wind,ind);//undo
        }
    }
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> res = new ArrayList<List<Integer>>();
        // ArrayList<Integer> perm = new ArrayList<>();
        // boolean [] vis= new boolean[nums.length];
        // fun_v1(nums,perm,vis,res);
        fun_v2(nums,0,res);
        return res;
    }
}