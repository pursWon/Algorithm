class Solution {
    public int solution(int[] number) {
        // 단순하게 접근하였습니다.
		// 배열이 { -2, 3, 0, 2, -5 }라면
		// -2, 3, 0 더하고, -2, 3, 2 더하고,-2, 3, 5 더하고...
        int answer = 0;
        
        for(int i = 0; i < number.length; i ++) {
			for(int j = i + 1; j < number.length; j ++) {
				for(int a = j + 1; a < number.length; a ++) {
					if (number[i] + number[j] + number[a] == 0) {
						answer += 1;
					}
				}
			}
		}
        
        return answer;
    }
}