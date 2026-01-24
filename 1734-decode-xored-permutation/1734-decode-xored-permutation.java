class Solution {
    public int[] decode(int[] encoded) {
        int temp1 = 0;
        int temp2 = 0;
        int n = encoded.length;

        int perm[] = new int[n + 1];

        for (int i = 1; i <= n + 1; i++) {
            temp1 ^= i;
        }

        for (int i = 0; i < n; i = i + 2) {
            temp2 = encoded[i] ^ temp2;
        }

        perm[n] = temp2 ^ temp1;

        for (int i = n - 1; i >= 0; i--) {
            perm[i] = encoded[i] ^ perm[i + 1];
        }
        return perm;
    }
}