class Solution {
    public boolean squareIsWhite(String coordinates) {
        int character = (int)coordinates.charAt(0);
        int num = (int)coordinates.charAt(1);
        if(character%2==0 && num%2==0) return false;
        if(character%2!=0 && num%2!=0) return false;
        return true;
    }
}