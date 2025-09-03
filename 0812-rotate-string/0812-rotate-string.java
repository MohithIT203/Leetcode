class Solution {
    public boolean rotateString(String s, String goal) {
        if(goal.equals(s))return true;
        for (int i = 0; i < s.length() - 1; i++) {
            String temp = s.substring(i + 1, s.length()) + s.substring(0, i + 1);
            if (temp.equals(goal))
                return true;
        }
        return false;
    }
}