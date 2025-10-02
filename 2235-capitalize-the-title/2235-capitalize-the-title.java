class Solution {
    public String capitalizeTitle(String title) {
        String[] words = title.split("\\s+");
        StringBuilder fin = new StringBuilder();

        for (String word : words) {
            if (word.length() <= 2) {
                fin.append(word.toLowerCase());
            } else {
                fin.append(Character.toUpperCase(word.charAt(0)));
                fin.append(word.substring(1).toLowerCase());
            }
            fin.append(" ");
        }

        return fin.toString().trim();
    }
}