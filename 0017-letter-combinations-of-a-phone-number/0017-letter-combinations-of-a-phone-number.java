class Solution {
    List<String> res = new ArrayList<>();
    //backtracking
    public void helper(String[] map, String digits, int index, StringBuilder sb) {
        if (index == digits.length()) {
            res.add(sb.toString());
            return;
        }
        if (index < 0)
            return;
        int indx = (digits.charAt(index) - '0') - 2;
        String letters = map[indx];
        for (int j = 0; j < letters.length(); j++) {
            sb.append(letters.charAt(j));//include
            helper(map, digits, index + 1, sb);
            sb.deleteCharAt(sb.length() - 1);//exclude
        }
    }
    public List<String> letterCombinations(String digits) {
        if (digits.length() == 0)
            return res;
        String[] map = { "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz" };
        StringBuilder sb = new StringBuilder();
        helper(map, digits, 0, sb);
        return res;
    }
}