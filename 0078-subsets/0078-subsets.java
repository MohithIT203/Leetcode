class Solution {
    void fun_v1(int [] arr,int wind,List<Integer> seq,List<List<Integer>> res)
    {
        if(wind==arr.length) 
        {
            res.add(new ArrayList<>(seq));//System.out.println(seq);
         return;
        }
        fun_v1(arr,wind+1,seq,res);//exclude and work for next
        seq.add(arr[wind]);//do
        fun_v1(arr,wind+1,seq,res);//include and work for next
        seq.remove(seq.size()-1);//undo
    }
    void fun_v2(int [] arr,int wind,List<Integer> seq,List<List<Integer>> res)
    {
        res.add(new ArrayList<Integer>(seq));
        if(wind==arr.length) return;
        for(int ind=wind;ind<arr.length;ind++)//list choices
        {
            seq.add(arr[ind]);//do
            fun_v2(arr,ind+1,seq,res);
            seq.remove(seq.size()-1);//undo
        }
     }

    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> res= new ArrayList<List<Integer>>();
        List<Integer> seq=new ArrayList<>();
        //fun_v1(nums,0,seq,res);
        fun_v2(nums,0,seq,res);
        
        return res;

    }
}