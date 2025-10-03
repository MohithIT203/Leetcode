class Solution {
    public String[] uncommonFromSentences(String s1, String s2) {
        HashMap<String, Integer> map = new HashMap<>();
        for (String s : s1.split("\\s+")) {
            map.put(s, map.getOrDefault(s, 0) + 1);
        }
        for (String s : s2.split("\\s+")) {
            map.put(s, map.getOrDefault(s, 0) + 1);

        }
        List<String> result = new ArrayList<>();
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            if (entry.getValue() == 1) {
                result.add(entry.getKey());
            }
        }
        
        return result.toArray(new String[0]);
    }
}