import java.util.Arrays;

class Solution {
    public String solution(String s) {
        String[] arr = s.split(" ");
        int[] numbers = new int[arr.length];
        
        for (int i = 0; i < arr.length; i++) {
            numbers[i] = Integer.parseInt(arr[i]);
        }

        Arrays.sort(numbers);
        
        int min = numbers[0];
        int max = numbers[numbers.length - 1];
        
        return min + " " + max;
    }
}