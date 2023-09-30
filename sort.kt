fun main(){
    val list = mutableListOf(6,2,9,5,8,1,3)
    val n =list.size
    for (i in 0 until n-1) {
        for (j in 0 until n-i-1) {
            if(list[j] > list[j+1]){
            val temp = list[j]
            list[j] = list[j+1]
            list[j+1] = temp
            }
        }
    }
     println("${list.joinToString()}")
}