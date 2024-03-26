import java.util.*;

class Solution {
    public int solution(int[][] sizes) {
        List<Integer> widthList = new ArrayList<>();
        List<Integer> heightList = new ArrayList<>();
        
        for(int[] arr : sizes) {
            if(arr[0] < arr[1]) {
                int num = arr[0];
                arr[0] = arr[1];
                arr[1] = num;
            }
            
            widthList.add(arr[0]);
            heightList.add(arr[1]);
        }
        
        int maxWidth = widthList.stream().mapToInt(v -> v).max().orElse(0);
        int maxHeight = heightList.stream().mapToInt(v -> v).max().orElse(0);
        
        return maxWidth * maxHeight;
    }
}