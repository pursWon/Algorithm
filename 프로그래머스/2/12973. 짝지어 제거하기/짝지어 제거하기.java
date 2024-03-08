import java.util.Stack;

class Solution {
    public int solution(String s) {
        // String s를 char 타입의 배열로 변형
        char[] array = s.toCharArray();
        // Stack 배열을 형성
		Stack<Character>stack = new Stack <>();
        
        for (char c : array) {
            // Stack이 비어있으면 값을 push
			if (stack.isEmpty()) {
				stack.push(c);
			} else {
                // 아닐 경우, 넣은 값이 최상단 값과 
                // 같을 경우, 최상단 값을 제거(pop)
				if (stack.peek() == c) {
					stack.pop();
				} else {
                // 같지 않을 경우, 값을 집어넣는다.
					stack.push(c);
				}
			}
		}
        
        // stack이 모두 비어있을 경우에 모두 제거된 것이므로 삼항연산자로 배열이 비어있는지 체크, 비어있을 경우 1을 리턴, 아닐 경우 0을 리턴.
        return stack.isEmpty() ? 1 : 0; 
    }
}