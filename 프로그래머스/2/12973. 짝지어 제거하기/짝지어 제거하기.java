import java.util.Stack;

class Solution {
    public int solution(String s) {
        char[] array = s.toCharArray();
		Stack<Character>stack = new Stack <>();
        
        for (char c : array) {
			if (stack.isEmpty()) {
				stack.push(c);
			} else {
				if (stack.peek() == c) {
					stack.pop();
				} else {
					stack.push(c);
				}
			}
		}
        
        return stack.isEmpty() ? 1 : 0; 
    }
}