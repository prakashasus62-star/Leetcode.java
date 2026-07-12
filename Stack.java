import java.util.Stack;

class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int[] res = new int[temperatures.length];
        Stack<Integer> pos = new Stack<>();

        for (int index = 0; index < temperatures.length; index++) {
            while (!pos.isEmpty() && temperatures[pos.peek()] < temperatures[index]) {
                int popped = pos.pop();
                res[popped] = index - popped;
            }
            pos.push(index);
        }

        return res;
    }
}