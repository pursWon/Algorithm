class Solution {
    fun solution(arr: IntArray, div: Int): IntArray {
    var answer = intArrayOf()
    var myList = mutableListOf<Int>()
    
    for(i in 0 ..arr.size-1) {
        if(arr[i] % div == 0) {
            myList.add(arr[i]) // 나누어 떨어지는 값은 List에 저장
        }
        
        else continue
    }
    
    if(myList.size == 0 ) { myList.add(-1) }
    // 나누어 떨어지는 값이 없으면 -1로 반환
    
    myList.sort() //List내 데이터를 오름차순으로 정렬 
    answer = myList.toIntArray()
    
    return answer
   }
}