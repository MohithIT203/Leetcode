class Solution {
    public int[] numberOfPairs(int[] nums) {
        HashMap<Integer, List<Integer>> map = new HashMap<>();
        int fin[] = new int[2];
        int pairs=0,leftOvers=0;
        for (int i = 0; i < nums.length; i++) {
            if (!map.containsKey(nums[i])) {
                List<Integer> list = new ArrayList<>();
                list.add(i);
                map.put(nums[i], list);
            } else {
                map.get(nums[i]).add(i);
            }
        }
        for (Map.Entry<Integer, List<Integer>> entry : map.entrySet()) {
            int temp = entry.getValue().size();
            if(temp%2!=0){
                leftOvers+=temp%2;
            }
                pairs+=temp/2;
            
        }
        fin[0]=pairs;
        fin[1]=leftOvers;
        return fin;
    }
}