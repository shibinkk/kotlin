fun main(){
    val array = arrayOf(2,7,4,0,6,8)
    var large = array[0]
    for (i in array) {
        if(i > large)
        large = i
    }
    println(large)
}