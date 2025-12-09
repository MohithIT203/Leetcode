class Solution {
    // boolean iscomplete=false;
    boolean fun(char[][] board, String word,int work_row,int work_col,int word_ind,boolean[][] vis){
        if(word_ind==word.length()){
            // iscomplete=true;
            // return;
            return true;
        }
        int[][] dir={{0,1},{1,0},{0,-1},{-1,0}};
        int cal_row,cal_col;
        for(int i=0;i<dir.length;i++){
            cal_row=work_row+dir[i][0];
            cal_col=work_col+dir[i][1];
            if(cal_row>=0 && cal_row<board.length &&
            cal_col>=0 && cal_col<board[0].length && 
            vis[cal_row][cal_col]==false && board[cal_row][cal_col]==word.charAt(word_ind)){
                vis[cal_row][cal_col]=true;
                if(fun(board,word,cal_row,cal_col,word_ind+1,vis)==true){
                    return true;
                }
                vis[cal_row][cal_col]=false;
            }
        }
       return false;
    }
    public boolean exist(char[][] board, String word) {
        char ch=word.charAt(0);
        boolean[][] vis=new boolean[board.length][board[0].length];
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board[0].length;j++){
                if(board[i][j]==ch){
                    vis[i][j]=true;
                    if(fun(board,word,i,j,1,vis)==true) return true;
                    vis[i][j]=false;
                }
            }
        }
        // return iscomplete;
        return false;
    }
}