class Solution {
    public boolean isValid(String s) {
        Stack<Character> ans = new Stack<>();
        for (char c : s.toCharArray()) {
            switch (c) {
                case '{':
                case '[':
                case '(':
                    ans.push(c);
                    break;
                case '}':
                    if (ans.isEmpty() || ans.peek() != '{') {
                        return false;
                    }
                    ans.pop();
                    break;
                case ']':
                    if (ans.isEmpty() || ans.peek() != '[') {
                        return false;
                    }
                    ans.pop();
                    break;
                case ')':
                    if (ans.isEmpty() || ans.peek() != '(') {
                        return false;
                    }
                    ans.pop();
                    break;
                default:
                    return false;
            }
        }
        return ans.isEmpty();
    }
}
