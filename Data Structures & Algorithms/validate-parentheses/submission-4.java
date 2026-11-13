class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();

        if (s.length() < 2)
            return false;

        for (char c : s.toCharArray()) {
            if (c == '(' || c == '[' || c == '{') {
                stack.push(c);
            } else {
                if (stack.isEmpty())
                    return false;

                char tmp = stack.pop();

                if (tmp == '(' && c != ')')
                    return false;
                if (tmp == '[' && c != ']')
                    return false;
                if (tmp == '{' && c != '}')
                    return false;
            }
        }

        if (!stack.isEmpty())
            return false;

        return true;
    }
}
