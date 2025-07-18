import java.util.HashSet;

class Solution {
    public int numberOfSpecialChars(String word) {
        HashSet<Character> lowercaseSeen = new HashSet<>();
        HashSet<Character> uppercaseSeen = new HashSet<>();

        for (char ch : word.toCharArray()) {
            if (Character.isLowerCase(ch)) {
                lowercaseSeen.add(ch);
            } else if (Character.isUpperCase(ch)) {
                uppercaseSeen.add(Character.toLowerCase(ch));
            }
        }

       
        int count = 0;
        for (char ch : lowercaseSeen) {
            if (uppercaseSeen.contains(ch)) {
                count++;
            }
        }

        return count;
    }
}
