class Solution {
    public List<String> buildArray(int[] target, int n) {
        List<String> arr=new ArrayList<>();
        int ind=0;
        for(int i=0;i<n;i++){
            if(i==target[target.length-1]){
                break;
            }
            if(target[ind]==i+1){
                arr.add("Push");
                ind++;
            }
            else{
                arr.add("Push");
                arr.add("Pop");
            }

        }
        return arr;
    }
}