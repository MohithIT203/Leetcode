class Solution {
    //To find prime
    boolean isPrime(int num){
        if(num%2==0) return false;
        for(int i=3;i<=num/2;i++){
            if(num%i==0){
                return false;
            }
        }
        return true;
    }
    //To compute number
    void helper_fun(int[][] mat ,int row,int col,HashMap<Integer,Integer> map){
        int[][] directions = {{-1,0},{-1,1},{0,1},{1,1},{1,0},{1,-1},{0,-1},{-1,-1}};
        int num,cal_row,cal_col;
       for(int i=0;i<8;i++){
            int row_operation=directions[i][0];
            int col_operation=directions[i][1];
            cal_row=row;
            cal_col=col;
            num=0;
            while(cal_row>=0 && cal_row<mat.length && cal_col>=0 && cal_col<mat[0].length){
                num=num*10+mat[cal_row][cal_col];
                if(num>10 && isPrime(num)){
                    map.put(num,map.getOrDefault(num,0)+1);
                }
                cal_row+=row_operation;
                cal_col+=col_operation;
            }              
       }

    }
    public int mostFrequentPrime(int[][] mat) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<mat.length;i++){
            for(int j=0;j<mat[i].length;j++){
                helper_fun(mat,i,j,map);
            }
        }
        //frequent prime
            int max_prime=-1;
            int max_occur=0;
            for(int key:map.keySet()){
                if(map.get(key)>max_occur){
                    max_occur=map.get(key);
                    max_prime=key;
                }
                else if(map.get(key)==max_occur && key > max_prime){ //tie break for equal occurance
                    max_prime=key;
                }
            }
        return max_prime;
    }
}