class Solution {
    public String solution(String s) {
        String answer = "";
		String[] arr = s.split("");
		int length = arr.length;

		if(length % 2 == 0) {
			answer = arr[(length / 2) - 1] += arr[(length / 2)];
		} else {
			Double number = Double.valueOf(length / 2);
			answer = arr[(int)Math.floor(number)];
		}
        
        return answer;
    }
}