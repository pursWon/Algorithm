import java.util.Arrays;

class Solution {
    public String solution(String phone_number) {
        char[] arr = phone_number.toCharArray();
		String answer = "";
		String star;
        
			for (int i = 0; i < arr.length; i++) {
				if (i < arr.length - 4) {
					star = Character.toString(arr[i]);
					star = "*";
					answer += star;
				} else {
					star = Character.toString(arr[i]);
					answer += star;
				}
			}
        
        return answer;
    }
}