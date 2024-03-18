class Solution {
    public String solution(int n) {
        String answer = "";
        
        for (int i = 0; i < n; i++) {
            // i가 0이거나, 짝수일 때 "수"를 더함
            if (i % 2 == 0) {
                answer += "수";
            // i가 홀수일 때 "박"을 더함
            } else {
                answer += "박";
            }
        }
        
        return answer;
    }
}
