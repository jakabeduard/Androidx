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

    daysOfWeek
        .map{it.uppercase()}
        .forEach{t-> println(t) }

    daysOfWeek
        .map{it.uppercase()}
        .forEach{t-> println(t) }
     for((index, value) in daysOfWeek.withIndex()){
         println()
     }


    val result =daysOfWeek.filter { it.uppercase().contains("E") }
    result.forEach{t-> println(t)}

    println(doubleValue(3.9))





    // Try adding program arguments via Run/Debug configuration.
    // Learn more about running applications: https://www.jetbrains.com/help/idea/running-applications.html.
    //println("Program arguments: ${args.joinToString()}")
}


fun doubleValue(number :Double): Double {

    return  number*2
}

//
fun compactDoubleValue(number :Double): Double=number*2
//
fun compactDoubleValue2(number :Double)=number*2
//
fun  pintDounbleValue3(number :Double): Double{}