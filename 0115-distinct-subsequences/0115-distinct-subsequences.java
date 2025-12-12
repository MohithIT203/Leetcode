class Solution {
    int rec(String str,int str_ind, String seq,int seq_ind)
    {
        if(seq_ind==seq.length()) return 1;
        if(str_ind==str.length()) return 0;
        int tot_paths=0;
        if(str.charAt(str_ind)==seq.charAt(seq_ind))//equal
        {
            int ch1_paths=rec(str,str_ind+1,seq,seq_ind+1);//s+1,t+1
            int ch2_paths=rec(str,str_ind+1,seq,seq_ind);//s+1
            tot_paths=ch1_paths+ch2_paths;
        }
        else//not equal
            tot_paths=rec(str,str_ind+1,seq,seq_ind);//s+1
        return tot_paths;
    }
    int rec_mem(String str,int str_ind, String seq,int seq_ind,int [][] memo)
    {
        if(seq_ind==seq.length()) return 1;
        if(str_ind==str.length()) return 0;
        if(memo[str_ind][seq_ind]!=-1) return  memo[str_ind][seq_ind];
        int tot_paths=0;
        if(str.charAt(str_ind)==seq.charAt(seq_ind))//equal
        {
            int ch1_paths=rec_mem(str,str_ind+1,seq,seq_ind+1,memo);
            int ch2_paths=rec_mem(str,str_ind+1,seq,seq_ind,memo);
            tot_paths=ch1_paths+ch2_paths;
        }
        else//not equal
            tot_paths=rec_mem(str,str_ind+1,seq,seq_ind,memo);
        return memo[str_ind][seq_ind]=tot_paths;
    }
    int find_dist(String str, String seq)
    {
        //return rec(str,0,seq,0);
        // int [][] memo = new int[str.length()][seq.length()];
        // int row;
        // for(row=0;row<str.length();row++)
        //     Arrays.fill(memo[row],-1);
        // return rec_mem(str,0,seq,0,memo);

        //tabulation
        int [][] tab = new int[str.length()+1][seq.length()+1];
        int row,col;
        //if(str_ind==str.length()) return 0;
        for(row=str.length(),col=0;col<=seq.length();col++)
            tab[row][col]=0;
        //if(seq_ind==seq.length()) return 1;
        for(col=seq.length(),row=0;row<=str.length();row++)
            tab[row][col]=1;
        int str_ind, seq_ind;
        for(str_ind=str.length()-1;str_ind>=0;str_ind--)
        {
            for(seq_ind=seq.length()-1;seq_ind>=0;seq_ind--)
            {     
                int tot_paths=0;
                if(str.charAt(str_ind)==seq.charAt(seq_ind))//equal
                {
                    int ch1_paths=tab[str_ind+1][seq_ind+1];
                    int ch2_paths=tab[str_ind+1][seq_ind];
                    tot_paths=ch1_paths+ch2_paths;
                }
                else//not equal
                    tot_paths=tab[str_ind+1][seq_ind];
                tab[str_ind][seq_ind]=tot_paths;
            }
        }        
        return tab[0][0];
    }
    public int numDistinct(String s, String t) {
        return find_dist(s,t);
    }
}