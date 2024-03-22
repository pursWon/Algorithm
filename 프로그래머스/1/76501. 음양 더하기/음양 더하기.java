class Solution {
    public int solution(int[] absolutes, boolean[] signs) {
        int length = signs.length;
        int answer = 0;
        
        for(int i = 0; i < length; i++) 
        	answer += absolutes[i] * (signs[i] ? 1 : -1);
        
        return answer;
    }
}