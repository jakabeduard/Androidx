package main

fun main(args: Array<String>) {
    println("Hello World!")

    val number1=3
    val number2=4

    //1 exercise
    println( " $number1+$number2 " )
    println( " $number1+$number2 =${number1+number2}" )
    val daysOfWeek= listOf( "Monday", "Tuesday", "Wednesday", "Thursday")
    daysOfWeek.forEach{println(it)}
    daysOfWeek.forEach {element -> println(element)}

    daysOfWeek
        .filter { it.contains("e") }
        .forEach{println(it)}

    val result =daysOfWeek.filter { it.uppercase().contains("E") }
    result.forEach{t-> println(t)}

    println(doubleValue(3.9))





    // Try adding program arguments via Run/Debug configuration.
    // Learn more about running applications: https://www.jetbrains.com/help/idea/running-applications.html.
    //println("Program arguments: ${args.joinToString()}")
}


fun doubleValue(number :Double): Double {

    return number1
}


fun compactDoubleValue(number :Double): Double=number1*2

fun compactDoubleValue(number :Double)=number1*2

fun  pintDounbleValue(number :Double): Double{}