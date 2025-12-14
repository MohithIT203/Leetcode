class Solution {
    void find_even(int[] digits,Set<Integer> even_nums,boolean[] vis,int num,int len){
        if(len==3){
            if(num%2==0)
            even_nums.add(num);
            return;
        }

        for(int i=0;i<digits.length;i++){
            if(vis[i]==false){
                if (len == 0 && digits[i] == 0) continue;
                num=num*10+digits[i];
                vis[i]=true;
                find_even(digits,even_nums,vis,num,len+1);
                num/=10;
                vis[i]=false;
            }
        }
    }
    public int[] findEvenNumbers(int[] digits) {
        Set<Integer> even_nums = new HashSet<>();
        boolean[] vis=new boolean[digits.length];
        find_even(digits,even_nums,vis,0,0);

        int []arr=new int[even_nums.size()];
        int i=0;
        for(int num:even_nums){
            arr[i]=num;
            i++;
        }
        Arrays.sort(arr);
        return arr;
    }
}