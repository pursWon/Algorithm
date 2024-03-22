class Solution {
    public int solution(int[] absolutes, boolean[] signs) {
        int length = signs.length;
        int answer = 0;

        // signs[i]가 true면 1을 곱하고 (양)
        // signs[i]가 false면 -1을 곱하고 (음)
        for(int i = 0; i < length; i++) 
        	answer += absolutes[i] * (signs[i] ? 1 : -1);
        
        return answer;
    }
}
