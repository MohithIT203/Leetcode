class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int currGas=0,tot=0,startInd=0;
        for(int i=0;i<gas.length;i++){
            int diff=gas[i]-cost[i];
            currGas+=diff;
            tot+=diff;
            if(currGas<0){
                currGas=0;
                startInd=i+1;
            }
        }
        return tot>=0?startInd:-1;
    }
}