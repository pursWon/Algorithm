# [level 2] JadenCase 문자열 만들기 - 12951 

[문제 링크](https://school.programmers.co.kr/learn/courses/30/lessons/12951) 

### 성능 요약

메모리: 75.3 MB, 시간: 1.48 ms

### 구분

코딩테스트 연습 > 연습문제

### 채점결과

정확성: 100.0<br/>합계: 100.0 / 100.0

### 제출 일자

2024년 03월 06일 18:16:43

### 문제 설명

<p>JadenCase란 모든 단어의 첫 문자가 대문자이고, 그 외의 알파벳은 소문자인 문자열입니다. 단, 첫 문자가 알파벳이 아닐 때에는 이어지는 알파벳은 소문자로 쓰면 됩니다. (첫 번째 입출력 예 참고)<br>
문자열 s가 주어졌을 때, s를 JadenCase로 바꾼 문자열을 리턴하는 함수, solution을 완성해주세요.</p>

<h5>제한 조건</h5>

<ul>
<li>s는 길이 1 이상 200 이하인 문자열입니다.</li>
<li>s는 알파벳과 숫자, 공백문자(" ")로 이루어져 있습니다.

<ul>
<li>숫자는 단어의 첫 문자로만 나옵니다.</li>
<li>숫자로만 이루어진 단어는 없습니다.</li>
<li>공백문자가 연속해서 나올 수 있습니다.</li>
</ul></li>
</ul>

<h5>입출력 예</h5>
<table class="table">
        <thead><tr>
<th>s</th>
<th style="text-align: center">return</th>
</tr>
</thead>
        <tbody><tr>
<td>"3people unFollowed me"</td>
<td style="text-align: center">"3people Unfollowed Me"</td>
</tr>
<tr>
<td>"for the last week"</td>
<td style="text-align: center">"For The Last Week"</td>
</tr>
</tbody>
      </table>
<hr>

<p>※ 공지 - 2022년 1월 14일 제한 조건과 테스트 케이스가 추가되었습니다.</p>

**나의 풀이**

```java

package com.jPractice;

public class Practice {
	public static void main(String[] args) {
		String s = "3people unFollowed me";
		String answer = "";
		
		// 주어진 String 값을 모두 소문자로 만들고 split 메소드를 사용함
		// 결과는 다음과 같음 -> [3, p, e, o, p, l, e,  , u, n, f, o, l, l, o, w, e, d,  , m, e]
		String[] words = s.toLowerCase().split("");
		
		// boolean 값을 하나 설정
		boolean flag = true;
		
		// for문을 돌면서 flag의 값이 true인지, false인지 체크. true일 경우에는 word를 대문자로 만든 후에 answer에 더하고, 아닐 경우는 그냥 더해주면 됨
		// word가 공백일 경우를 체크, 대문자로 만드는 첫번째 문자 다음에는 무조건 공백이 오지 않으므로 flag는 false값이 됨
		// 그래서 공백이 있는 곳까지 for문이 도달하기 전엔 그냥 answer에 더해주다가, 공백을 만나면, flag는 true가 됨.
		// 그리고 공백 다음의 문자. 단어의 첫글자는 flag가 true이므로 대문자로 변경.
		// 그래서, 공백 다음에 오는 단어들은 무조건 첫 글자는 대문자 나머지는 무조건 소문자로 설정이 됨.
		for (String word : words) {
			answer += flag ? word.toUpperCase() : word;
			flag = word.equals(" ") ? true : false;
			System.out.println(answer);
		}
	}
}

```


> 출처: 프로그래머스 코딩 테스트 연습, https://school.programmers.co.kr/learn/challenges
