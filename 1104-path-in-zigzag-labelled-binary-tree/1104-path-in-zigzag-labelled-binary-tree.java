class Solution {
    public List<Integer> pathInZigZagTree(int label) {
        
        List<Integer> res=new ArrayList<>();
        int st;
        int end;
        st=1;
        end=1;
        while(true)
        {
            if(label>=st&&label<=end)
                break;
            st=st*2;
            end=end*2+1;
        }
        while(true)
        {
            res.add(label);//System.out.println(label);
            if(label==1)    break;
            st=st/2;
            end=end/2;
            label=label/2;
            int opp_val=end-(label-st);
            res.add(opp_val);//System.out.println(opp_val);
            if(label==1)    break;
            st=st/2;
            end=end/2;
            label=label/2;
        }        
        List<Integer> ans= new ArrayList<>();
        int ind;
        for(ind=res.size()-1;ind>=0;ind--)
            ans.add(res.get(ind));
        return ans;
    }
}