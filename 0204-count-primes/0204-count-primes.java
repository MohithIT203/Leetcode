class Solution {
    public int countPrimes(int n) {
        if(n<=1){
            return 0;
        }
        int count=0;
		boolean[] arr=new boolean[n+1];
	    Arrays.fill(arr,true);
	    arr[0]=false;
	    arr[1]=false;
	    for(int i=2;i*i<=n;i++){
	        if(arr[i]){
	            for(int j=i*i;j<=n;j+=i){
	                arr[j]=false;
	            }
	        }
	        
	    }
	    for(int i=0;i<n;i++){
	        if(arr[i]){
	        count++;
	        }
	    }
        return count;
    }
   
}