class Solution {
    fun solution(arr: IntArray, divisor: Int): IntArray {
    var answer = intArrayOf()
    var bbc = mutableListOf<Int>()
    
    for(i in 0 ..arr.size-1) {
        if(arr[i] % divisor == 0) {
            bbc.add(arr[i]) // 나누어 떨어지는 값은 List에 저장
        }
        else continue
    }
    
    if(bbc.size == 0 ) {
    bbc.add(-1) // 나누어 떨어지는 값이 없으면 -1로 반환
    }
    bbc.sort() //List내 데이터를 오름차순으로 정렬 
    
    answer = bbc.toIntArray()
    
    return answer
   }
}