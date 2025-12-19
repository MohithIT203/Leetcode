class Solution {
    public List<String> topKFrequent(String[] words, int k) {
        HashMap<String, Integer> map = new HashMap<>();
        List<String> list = new ArrayList<>();
        for (String word : words) {
            map.put(word, map.getOrDefault(word, 0) + 1);
            
        }

        List<Map.Entry<String, Integer>> li =
                new ArrayList<>(map.entrySet());

        Collections.sort(li, (a, b) -> {
            if (!a.getValue().equals(b.getValue())) {
                return b.getValue() - a.getValue(); // frequency desc
            }
            return a.getKey().compareTo(b.getKey()); // lex asc
        });

        for (int i = 0; i < k; i++) {
            list.add(li.get(i).getKey());
        }
        return list;
    }
}