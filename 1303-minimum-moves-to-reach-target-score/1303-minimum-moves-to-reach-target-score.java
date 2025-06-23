class Solution {
    public int minMoves(int target, int maxDoubles) {
        int count=0;
        if(maxDoubles==0){
            return target-1;
        }
        while(target!=1){
            if(target%2==0 && maxDoubles>0){
                target/=2;
                maxDoubles--;
            }
            else if(target%2==1){
                target--;
            }
            else {
                return count + target - 1;
            }
            count++;
        }
        return count;
    }

}