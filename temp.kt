fun main() {
    println("Enter temperature: ")
    val temperature = readLine()?.toFloat()
    println("Enter unit:")
    val unit = readLine()?.toUpperCase()
    if(temperature != null){
    if (unit == "C") {
        val contemp = temperature * 9 / 5 + 32
        println("Temperature in Fahrenheit: %.2f".format(contemp))
    } 
    else if (unit == "F") {
        val contemp = (temperature - 32) * 5 / 9
        println("Temperature in Celsius: %.2f".format(contemp))
    }   
    else {
        println("Invalid unit entered.")
    }
    }
}
