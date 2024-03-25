import java.util.Arrays;

class Solution {
    public int solution(int[] arr) {
        Arrays.sort(arr);
		int max = arr[arr.length - 1];
		int i = 1;
		int count = 0;
        
        while(true) {
			max = max * i;
			
			for(int num : arr) {
				if(max % num == 0) {
					count += 1;
				} 
			} 
			
			if(count == arr.length) {
				break;
			} else {
				count = 0;
				i += 1;
				max = arr[arr.length - 1];
			}
		}
        
        return max;
    }
}