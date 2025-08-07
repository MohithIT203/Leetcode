class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
        }
        HashSet<Integer> seen = new HashSet<>();
        for (int freq : map.values()) {
            if (seen.contains(freq)) {
                return false;
            }
            seen.add(freq);
        }

        return true;
    }
}