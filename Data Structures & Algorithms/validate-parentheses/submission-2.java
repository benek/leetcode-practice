class Solution {
    public boolean isValid(String s) {
        // if first char is a closing char or is empty, return false
        // iterate s char by char
        // if a char is opening, save the char in a stack and continue
        // if a char is closing, check match with the first element of the stack
            // otherwise return false
        // return true/false if the stack is empty

        if (s.length() <= 1) {
            return false;
        }

        Map<Character, Character> openCloseMap = new HashMap<>();
        openCloseMap.put('}', '{');
        openCloseMap.put(']', '[');
        openCloseMap.put(')', '(');

        Stack<Character> stack = new Stack();

        // example false = "[(])"
        for (int i = 0; i < s.toCharArray().length; i++) {
            // i == 0
            // i == 1
            // i == 2
            Character curr = s.charAt(i);
            // [
            // (
            // ]
            if (openCloseMap.containsValue(curr)) {
            // true
            // true
                stack.push(curr);
                // stack == [
                // stack == [(
                continue;
            } else {
                if (stack.isEmpty()) return false;
                if (stack.peek().equals(openCloseMap.get(curr))) {
                    // // // both matches
                    stack.pop();
                    continue;
                } else {
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }
}
