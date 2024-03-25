class Solution {
    public String solution(String s) {
        String answer = "";
		String[] arr = s.split("");
		int length = arr.length;
        
        // 짝수
		if(length % 2 == 0) {
			answer = arr[(length / 2) - 1] += arr[(length / 2)];
        // 홀수
		} else {
            // 내림을 하기위해 Double로 타입 변경
			Double number = Double.valueOf(length / 2);
            // 다시 값을 int로 변환해줌
			answer = arr[(int)Math.floor(number)];
		}
        
        return answer;
    }
}