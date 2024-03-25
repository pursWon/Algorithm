import java.util.Arrays;

class Solution {
    public int solution(int[] arr) {
	// 배열내의 최대값을 1부터 계속 곱해주면서, 나오는 값을 나머지 숫자로 나눌 때,
	// 모두 나누어 떨어지면 그 값이 최소공배수가 된다고 가정하고 접근하였습니다.
	    
        Arrays.sort(arr);
	// 배열내의 최댓값 변수 만들어주기
	int max = arr[arr.length - 1];
	// 최댓값에서 1부터 곱해주기
	int i = 1;
	// 배열에서 몇 개의 숫자가 나누어 떨어졌는지 확인할 수 있는 숫자
	int count = 0;

	// while문을 돌립니다.
        while(true) {
		max = max * i;
		
		for(int num : arr) {
			if(max % num == 0) {
			count += 1;
			} 
		} 
			
		if(count == arr.length) {
		// 배열내의 최댓값을 포함한 모든 숫자가 나누어떨어졌으면 break
		// break 됐을 때의 max가 최소공배수가 됩니다.
		break;
		} else {
		// 모두 숫자가 나누어 떨어지지 않았으면 원래대로 값을 복구해줌
		count = 0;
		i += 1;
		max = arr[arr.length - 1];
		}
	}

	// 최소공배수를 리턴
        return max;
    }
}
