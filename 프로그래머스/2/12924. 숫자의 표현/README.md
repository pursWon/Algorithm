# [level 2] 숫자의 표현 - 12924 

[문제 링크](https://school.programmers.co.kr/learn/courses/30/lessons/12924) 

### 성능 요약

메모리: 52.1 MB, 시간: 1.38 ms

### 구분

코딩테스트 연습 > 연습문제

### 채점결과

정확성: 75.0<br/>효율성: 25.0<br/>합계: 100.0 / 100.0

### 제출 일자

2024년 03월 07일 23:31:28

### 문제 설명

<p>Finn은 요즘 수학공부에 빠져 있습니다. 수학 공부를 하던 Finn은 자연수 n을 연속한 자연수들로 표현 하는 방법이 여러개라는 사실을 알게 되었습니다. 예를들어 15는 다음과 같이 4가지로 표현 할 수 있습니다.</p>

<ul>
<li>1 + 2 + 3 + 4 + 5 = 15</li>
<li>4 + 5 + 6 = 15</li>
<li>7 + 8 = 15</li>
<li>15 = 15</li>
</ul>

<p>자연수 n이 매개변수로 주어질 때, 연속된 자연수들로 n을 표현하는 방법의 수를 return하는 solution를 완성해주세요.</p>

<h5>제한사항</h5>

<ul>
<li>n은 10,000 이하의 자연수 입니다.</li>
</ul>

<hr>

<h5>입출력 예</h5>
<table class="table">
        <thead><tr>
<th>n</th>
<th>result</th>
</tr>
</thead>
        <tbody><tr>
<td>15</td>
<td>4</td>
</tr>
</tbody>
      </table>
<h5>입출력 예 설명</h5>

<p>입출력 예#1<br>
문제의 예시와 같습니다.</p>

<hr>

<p>※ 공지 - 2022년 3월 11일 테스트케이스가 추가되었습니다.</p>

**나의 풀이**

```java

class Solution {
    public int solution(int n) {
        int answer = 0;
        
        for(int i=1; i<=n; i++) {
			int sum = 0;

                        // n이 15라고 가정
			// j가 for 문을 돌면서
                        // 1 + 2 + 3 + 4 + 5 + 6... 식으로 sum에 값을 더하게 되고
                        // sum이 n과 같거나 n보다 커지게 되면
                        // break를 통해 다시 위의 for문에서 i가 1증가하고 j의 값은 2가 됩니다.
                        // 그럼 이제 2 + 3 + 4 + 5 + 6... 식으로 다시 sum에 값을 더하게 되고
                        // 위의 반복식을 통해서 sum이 15가 될 때만 answer에 1씩 더하므로
                        // 처음 시작하는 숫자를 1씩 늘리면서 순차적으로 더한 식이 몇 개가 되는지 확인할 수 있습니다.

			for(int j=i; j<=n; j++) {
				sum += j; 
				if(sum==n) {
					answer++; 
					break;
				} else if(sum>n) {
					break;
				}
			}
		}  
        
        return answer;
    }
}

```


> 출처: 프로그래머스 코딩 테스트 연습, https://school.programmers.co.kr/learn/challenges
