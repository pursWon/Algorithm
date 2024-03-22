import java.util.*;

class Solution {
    public int solution(int k, int m, int[] score) {
        // score가 [1, 2, 3, 1, 2, 3, 1]
        // k = 3
        // m = 4
        int answer = 0;

        Arrays.sort(score); // [1, 1, 1, 2, 2, 3, 3]

        // 한 상자에 들어가는 사과의 개수 x 상자의 사과 중 가장 낮은 점수
        // 4 x 2 = 8
        for(int i = score.length; i >= m; i -= m){
            answer += score[i - m] * m;
        }

        return answer;
    }
}
