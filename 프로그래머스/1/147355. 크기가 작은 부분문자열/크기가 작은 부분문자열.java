import java.util.ArrayList;

class Solution {
    public int solution(String t, String p) {
        int count = 0;
        // t의 길이를 변수로 설정
        int tLength = t.length();
         // p의 길이를 변수로 설정
        int pLength = p.length();

        // substring 함수를 쓰기 위해서 범위를 다음과 같이 설정함 
        // for문을 돌면서 substring 함수로 나온 값을 p와 비교하여 
        // 비교하는 첫번째 문자열이 두번째 문자열보다 사전순으로 더 앞에 위치할 때에 음수를 반환하거나
        // 0을 반환한다.
        // 예를 들면, "10"이 "15"보다 사전순으로 더 앞에 위치하므로.
        // 따라서, 이 방법으로 문자열 상태로 숫자 비교가 가능해진다.
        // 음수나 0을 반환할 때마다 (p보다 작을 때마다)
        // count에 1을 더해준다.
        for (int i = 0; i <= tLength - pLength; i++) {
            if (t.substring(i, i + pLength).compareTo(p) <= 0) {
                count++;
            }
        }
        
        return count;
    }
}
