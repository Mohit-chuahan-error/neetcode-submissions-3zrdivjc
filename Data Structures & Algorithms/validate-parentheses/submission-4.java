class Solution {
    public boolean isValid(String s) {
        Stack<Character> hs = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
          Character  current = s.charAt(i);
            if (current == '(' || current == '{' || current == '[') {
                hs.push(current);
            } else {
                if(hs.isEmpty()){
                    return false;
                }
                if (current == ')' && hs.peek() == '(' || current == ']' && hs.peek() == '['
                    || current == '}' && hs.peek() == '{') {
                    hs.pop();
                }else {
                    return false;
                }
                
            }
        }
        return hs.isEmpty();
    }
}
