class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<Character>();
        String open = "";
        String close = "";
        for(int i=0; i<s.length(); i++){
            if(s.charAt(i) == '(' || s.charAt(i) == '[' || s.charAt(i) == '{'){
                stack.push(s.charAt(i));
            }
            if(s.charAt(i) == ')' && (stack.size() == 0 || stack.pop() != '(')){return false;}
            if(s.charAt(i) == ']' && (stack.size() == 0 || stack.pop() != '[')){return false;}
            if(s.charAt(i) == '}' && (stack.size() == 0 || stack.pop() != '{')){return false;}
        }
        if(stack.size() != 0){
            return false;
        }
        return true;
    }
}