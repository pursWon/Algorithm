import java.util.ArrayList;

class Solution {
    public int solution(String t, String p) {
        int count = 0;
        int tLength = t.length();
        int pLength = p.length();
        
        for (int i = 0; i <= tLength - pLength; i++) {
            if (t.substring(i, i + pLength).compareTo(p) <= 0) {
                count++;
            }
        }
        
        return count;
    }
}