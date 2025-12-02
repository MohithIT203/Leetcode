class Solution {
    public int mostFrequentEven(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int max = 0;
        int freq = Integer.MAX_VALUE;
        boolean hasEven = false;
        for (int num : nums) {
            if (num % 2 == 0) {
                hasEven=true;
                map.put(num, map.getOrDefault(num, 0) + 1);
                int n = map.get(num);
                if (n > max) {
                    max = n;
                    freq = num;
                } else if (n == max) {
                    freq = Math.min(freq, num);
                }
            }

        }
        
        return hasEven?freq:-1;

    }
}