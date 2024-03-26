import java.util.*;

class Solution {
    public int solution(int[] scoville, int K) {
        int answer = 0;
        PriorityQueue<Integer> queue = new PriorityQueue<>();
        
        for(int i : scoville) {
			queue.add(i);
		}
        
        // 우선 순위가 낮은 숫자 순
		while(queue.peek() < K) {
			if(queue.size() < 2) {
				return -1;
			} else {
				int one = queue.poll();
				int two = queue.poll();
				
				one += (two * 2);
				queue.offer(one);
				
				answer += 1;
			}
		}
       
        return answer;
    }
}