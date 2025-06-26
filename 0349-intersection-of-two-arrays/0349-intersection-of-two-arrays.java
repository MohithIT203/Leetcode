class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> num1=new HashSet<>();
        Set<Integer> num2=new HashSet<>();
        
        for(int n:nums1){
            num1.add(n);
        }
        for(int n:nums2){
            num2.add(n);
        }
        num1.retainAll(num2);
        int []fin=new int[num1.size()];
        int k=0;
        for(int n:num1){
            fin[k++]=n;
        }
        return fin;
    }
}