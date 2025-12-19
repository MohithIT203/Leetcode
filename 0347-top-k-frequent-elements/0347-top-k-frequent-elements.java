class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int[] res=new int[k];
        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        List<Map.Entry<Integer, Integer>> li =
                new ArrayList<>(map.entrySet());

        Collections.sort(li, (a, b) -> b.getValue() - a.getValue());

        for (int i = 0; i < k; i++) {
            res[i]=li.get(i).getKey();
        }
        return res;
    }
}