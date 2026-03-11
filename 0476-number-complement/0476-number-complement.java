class Solution {
    public int findComplement(int n) {
        if (n == 0)
            return 1;

        int mask = 0;
        int temp = n;

        //create mask according to "n"
        //egs:mask=1111 if n=1001
        while (temp != 0) {
            mask = (mask << 1) | 1;
            temp >>= 1;
        }
        return n ^ mask;
    }
}