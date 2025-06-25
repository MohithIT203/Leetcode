class Solution {
    public int[] distributeCandies(int candies, int num_people) {
        int []fin=new int[num_people];
        int temp=1;
        int i=0;
        while(candies>0){
            int ind=i%num_people;
            int sub=Math.min(candies,temp);
            fin[ind]+=sub;
            candies-=sub;
            temp++;
            i++;
        }
        return fin;
    }
}