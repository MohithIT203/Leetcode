class Solution {
    public int[] shortestToChar(String s, char c) {
        List<Integer> list = new ArrayList<>();
        int arr[] = new int[s.length()];
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == c) {
                list.add(i);
            }
        }
        int ind = 0;
        for (int i = 0; i < s.length(); i++) {
            if(ind==0){
                arr[i] = Math.abs(i - list.get(ind));
            }
            else{
                arr[i] = Math.min(Math.abs(i - list.get(ind)),Math.abs(i - list.get(ind-1)));
            }
            if (s.charAt(i) == c && ind != list.size() - 1) {
                ind++;
            }
        }
        return arr;
    }
}