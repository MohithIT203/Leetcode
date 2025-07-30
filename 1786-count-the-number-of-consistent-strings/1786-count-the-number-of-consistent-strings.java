class Solution {
    public int countConsistentStrings(String allowed, String[] words) {
        int count=0;
        for(String str:words){
            int flag=0;
            for(char ch:str.toCharArray()){
                if(!allowed.contains(Character.toString(ch))){
                    flag=1;
                    break;
                }
            }
            if(flag==0)count++;
        }
        return count;
    }
}