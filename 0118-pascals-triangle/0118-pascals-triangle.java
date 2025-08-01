class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> pascal=new ArrayList<>();
        pascal.add(new ArrayList<>());
        pascal.get(0).add(1);
        for(int i=1;i<numRows;i++){
            List<Integer> temp=new ArrayList<>();
            List<Integer> prev=pascal.get(i-1);
            temp.add(1);
            for(int j=1;j<i;j++){
                temp.add(prev.get(j-1)+prev.get(j));
            }
            temp.add(1);
            pascal.add(temp);
        }
        return pascal;
    }
}