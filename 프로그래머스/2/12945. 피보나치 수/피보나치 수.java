import java.util.ArrayList;

class Solution {
    public int solution(int n) {
        int[] numbers = new int[n + 1];
		numbers[0] = 0;
		numbers[1] = 1;
		
		for (int num = 2; num <= n; num++) {
			int result = (numbers[num - 2] + numbers[num - 1]) % 1234567;
			numbers[num] = result;
		}
		
		int answer = numbers[n] % 1234567;
        return answer;
    }
}