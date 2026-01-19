class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < asteroids.length; i++) {
            int flag = 0;
            if (asteroids[i] < 0) {
                while (!stack.isEmpty() && stack.peek() > 0 &&
                        Math.abs(stack.peek()) < Math.abs(asteroids[i])) {
                    stack.pop();
                }

                if (!stack.isEmpty() && stack.peek() > 0 &&
                        Math.abs(stack.peek()) == Math.abs(asteroids[i])) {
                    stack.pop();
                    flag = 1;
                }

                if ((stack.isEmpty() || stack.peek() < 0) && flag == 0) {
                    stack.push(asteroids[i]);
                }
            } else {
                stack.push(asteroids[i]);
            }
        }
        int[] arr = new int[stack.size()];
        for (int i = stack.size() - 1; i >= 0; i--) {
            arr[i] = stack.pop();
        }
        return arr;
    }
}