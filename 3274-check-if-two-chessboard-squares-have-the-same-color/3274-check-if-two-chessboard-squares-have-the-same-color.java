class Solution {
    public boolean checkTwoChessboards(String coordinate1, String coordinate2) {
        int x1 = coordinate1.charAt(0) - 'a';
        int y1 = coordinate1.charAt(1) - '1';

        int x2 = coordinate2.charAt(0) - 'a';
        int y2 = coordinate2.charAt(1) - '1';

        return (x1 + y1) % 2 == (x2 + y2) % 2;
    }
}