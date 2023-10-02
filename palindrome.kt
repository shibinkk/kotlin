fun main() {
    println("enter a string.")
    val str = readLine()!!
    val n = str.length
    var palindrome = true
    for(i in 0 until n/2){
        if(str[i] != str[n-i-1]){
            palindrome = false
        }
    }
    if(palindrome){
        println("palindrome.")
    }
    else{
        println("not palindrome.")
    }
}