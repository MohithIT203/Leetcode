class Solution {
    boolean complete_flag=false;
    boolean isSafe(char[][] board,int grow,int gcol,char check_digit){
        int row,col;
        row=grow;
        for(col=0;col<9;col++){ //bottom-up check
            if(board[row][col]==check_digit) return false;
        }
        col=gcol;
        for(row=0;row<9;row++){ //right-left
            if(board[row][col]==check_digit) return false;
        }
         //sub mat check
        int sub_mat_row_st=(grow/3)*3;
        int sub_mat_col_st=(gcol/3)*3;
        for(row=sub_mat_row_st ; row<sub_mat_row_st+3;row++)
            for(col=sub_mat_col_st ; col<sub_mat_col_st+3;col++)
            if(board[row][col]==check_digit) return false;
        return true;

    }
    void fun(char[][] board,int row,int col,boolean[][] pre_fill)
    {
       if(col==9)
        {
	        row++;
	        col=0;
	    if(row==9)//completed
        {
            complete_flag=true;
  		    return;
        }
        }
        if(pre_fill[row][col]==true)
        {
            //work for next
            fun(board,row,col+1,pre_fill);//work for next
            return;
        }
            char digit;
            for(digit='1';digit<='9';digit++)//list the  choices
            {
            if(isSafe(board,row,col,digit) == true)//validate the choice
            {
                board[row][col]=digit;//do
                fun(board,row,col+1,pre_fill);//work for next
                if(complete_flag) return; //prevents further backtracking
                board[row][col]='.';//undo
            }
        }

    }

    public void solveSudoku(char[][] board) {
        boolean[][] pre_fill =new boolean[9][9];
        for(int i=0;i<9;i++){
            for(int j=0;j<9;j++){
                if(board[i][j]!='.'){
                    pre_fill[i][j]=true;
                }
                else{
                    pre_fill[i][j]=false; //optional
                }
            }
        }
        fun(board,0,0,pre_fill);
    }
}