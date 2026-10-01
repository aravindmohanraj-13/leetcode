class Solution {
    public boolean isValid(String s) {
        Stack<Character> a = new Stack<>();
        for (char c : s.toCharArray()) {
            if(c == '(' || c == '[' || c =='{'){
                a.push(c);
            } else {
                if(a.empty()) {
                    return false;
                }
                char top = a.pop();
                if(c == ')' && top != '(') 
                return false;
                if(c == ']' && top != '[') 
                return false;
                if(c == '}' &&top != '{') 
                return false;
            }
        }
        return a.empty();
    }
}