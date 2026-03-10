class Solution {
    public int[] resultsArray(int[] nums, int k) {

        int n = nums.length;
        int[] fin = new int[n - k + 1];

        int valids = 0;

        // count valid pairs in first window
        for (int i = 1; i < k; i++) {
            if (nums[i] == nums[i - 1] + 1) {
                valids++;
            }
        }

        fin[0] = (valids == k - 1) ? nums[k - 1] : -1;

        for (int j = k; j < n; j++) {

            // remove pair leaving window
            if (nums[j - k + 1] == nums[j - k] + 1) {
                valids--;
            }

            // add new pair
            if (nums[j] == nums[j - 1] + 1) {
                valids++;
            }

            fin[j - k + 1] = (valids == k - 1) ? nums[j] : -1;
        }

        return fin;
    }
}