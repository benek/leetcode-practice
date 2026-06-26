class Solution {
    public boolean isValid(String s) {
        Stack stack = new Stack();
        Map<Character, Character> closeOpen = new HashMap<>();
        closeOpen.put('}', '{');
        closeOpen.put(')', '(');
        closeOpen.put(']', '[');

        for (char c : s.toCharArray()) {
            // if stack is not empty && c is closing char
            if (!stack.empty() && closeOpen.containsKey(c)) {
                if (stack.peek() == closeOpen.get(c)) {
                    stack.pop();
                } else {
                    return false;
                }
            } else {
                stack.push(c);
            }
        }
        return stack.empty();
    }
}
