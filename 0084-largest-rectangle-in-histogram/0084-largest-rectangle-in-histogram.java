class Solution {
    public int largestRectangleArea(int[] heights) {
        int n = heights.length;
        Stack<Integer> st = new Stack<>();
        int nse[] = new int[n]; //next smaller element - index
        for (int i = n - 1; i >= 0; i--) {
            int curr = heights[i];
            while (!st.isEmpty() && heights[st.peek()] >= curr) {
                st.pop();
            }
            nse[i] = st.isEmpty() ? n : st.peek();
            st.push(i);
        }

        st.clear();
        int pse[] = new int[n]; //previous smaller element - index
        for (int i = 0; i<n; i++) {
            int curr = heights[i];
            while (!st.isEmpty() && heights[st.peek()] >= curr) {
                st.pop();
            }
            pse[i] = st.isEmpty() ? 0 : st.peek()+1;
            st.push(i);
        }
        int maxi=0;
        for(int i=0;i<n;i++){
            maxi = Math.max(maxi,(nse[i]-pse[i])*heights[i]);
        }
        return maxi;
    }
}