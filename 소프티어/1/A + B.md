A + B
===========

소프티어 1단계 

```java
import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 스캐너 오픈
        Scanner sc = new Scanner(System.in);
        // 몇 번 덧셈을 할 건지 지정해주는 int 변수 생성
        int caseNumber = sc.nextInt();
        List<Integer> numbers = new ArrayList<>();
    
        for(int i = 1; i <= caseNumber; i++) {
            // 첫번째 숫자 입력
            int one = sc.nextInt();
            // 두번째 숫자 입력
            int two = sc.nextInt();

            // 위에서 만든 list에 더해줌
            numbers.add(one + two);
        }
        // 스캐너를 닫아줍니다.
        sc.close();
        
        for(int j = 0; j < numbers.size(); j++) {
            int order = j + 1;
          // get 함수에서 index로 해당되는 값들을 call 할 수 있음
          System.out.println("Case #"+order+": "+numbers.get(j)+"");
        }
    }
}
```
