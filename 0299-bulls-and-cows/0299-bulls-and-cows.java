class Solution {
    public String getHint(String secret, String guess) {
        int bulls = 0, cows = 0;
        Map<Character, Integer> secretMap = new HashMap<>();
        Map<Character, Integer> guessMap = new HashMap<>();

        for (int i = 0; i < secret.length(); i++) {
            char s = secret.charAt(i);
            char g = guess.charAt(i);

            if (s == g) {
                bulls++;
            } else {
                secretMap.put(s, secretMap.getOrDefault(s, 0) + 1);
                guessMap.put(g, guessMap.getOrDefault(g, 0) + 1);
            }
        }

        for (char key : secretMap.keySet()) {
            if (guessMap.containsKey(key)) {
                cows += Math.min(secretMap.get(key), guessMap.get(key));
            }
        }

        return bulls + "A" + cows + "B";
    }
}
