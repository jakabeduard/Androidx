


package main

import kotlin.random.Random

fun main(args: Array<String>) {
    // println("Hello World!")

    val number1 = 3
    val number2 = 4

    //1 exercise
    println("Exercise 1\n")
    println(" $number1+$number2 ")
    println(" $number1+$number2 =${number1 + number2}\n")

    //2 exercise
    println("\nExercise 2\n")
    val daysOfWeek = listOf("Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday",)
    daysOfWeek.forEach { println(it) }
    println("\n")

    //  daysOfWeek.forEach {element -> println(element)}

    daysOfWeek
        .filter { it.contains("e") }
        .forEach { println(it) }

    println("\n")

//    daysOfWeek
//        .filter { 'e' in it }
//        .forEach { println(it) }
//    println("\n")


    daysOfWeek
        .filter { it.startsWith('T') }
        .forEach { println(it) }
    println("\n")

    daysOfWeek
        .filter { it.length == 6 }
        .forEach { println(it) }
    println("\n")
    // println("Days with length 6: ${daysOfWeek.filter { it.length == 6 }}")

//    daysOfWeek
//        .map{it.uppercase()}
//        .filter{it.startsWith('T')}
//        .forEach{t-> println(t) }
//    println("\n")

//    daysOfWeek
//        .map{it.uppercase()}
//        .forEach{t-> println(t) }
//     for((index, value) in daysOfWeek.withIndex()){
//         println()
//     }
//    val result =daysOfWeek.filter { it.uppercase().contains("E") }
//    result.forEach{t-> println(t)}

    //3 exercise
    println("\nExercise 3\n")

    val range = 1..50
    range.filter { isPrime(it) }.forEach { println(it) }


    //4 exercise
    println("\nExercise 4\n")

    val message = "Hello"

    val encodedMessage = messageCoding(message, ::encode)
    println("Encoded: $encodedMessage")

    val decodedMessage = messageCoding(encodedMessage, ::decode)
    println("Decoded: $decodedMessage")

    //5 exercise
    println("\nExercise 5\n")

    val numbers = listOf(1, 2, 3, 4, 5, 6, 7, 8, 9)
    printEvenNumbers(numbers)

    //6 exercise
    println("\nExercise 6\n")

    val numbers2 = listOf(1, 2, 3, 4, 5)

    println("Doubled: ${numbers2.map { it * 2 }}")

    println("Uppercase: ${daysOfWeek.map { it.uppercase() }}")

    println("First character: ${daysOfWeek.map { it.first().lowercaseChar() }}")

    println("Length of days: ${daysOfWeek.map { it.length }}")

    val avgLength = daysOfWeek.map { it.length }.average()
    println("Average length: $avgLength")

    //7 exercise
    println("\nExercise 7\n")


    val mutableDaysOfWeek = daysOfWeek.toMutableList()


    mutableDaysOfWeek.removeIf { 'n' in it }
    println(mutableDaysOfWeek)


    mutableDaysOfWeek.withIndex().forEach { (index, day) ->
        println("Item at $index is $day")
    }


    val sortedList = mutableDaysOfWeek.sorted()
    println(sortedList)

    //8 exercise
    println("\nExercise 8\n")

    val randomArray = IntArray(10) { Random.nextInt(0, 101) }


    randomArray.forEach { println(it) }


    println("Sorted array: ${randomArray.sorted()}")


    println("Any even numbers? ${randomArray.any { it % 2 == 0 }}")


    println("All even numbers? ${randomArray.all { it % 2 == 0 }}")


    val avg = randomArray.average()
    println("Average: $avg")

}


//
//

//
////
//fun compactDoubleValue(number :Double): Double=number*2
////
//fun compactDoubleValue2(number :Double)=number*2
////
////fun  pintDounbleValue3(number :Double): Double{}

//3 exercise

fun isPrime(num: Int): Boolean {
    if (num <= 1) return false
    for (i in 2 until num) {
        if (num % i == 0) return false
    }
    return true
}

//4 exercise

fun encode(msg: String): String {
    return msg.map { it + 1 }.joinToString("")
}

fun decode(msg: String): String {
    return msg.map { it - 1 }.joinToString("")
}

fun messageCoding(msg: String, func: (String) -> String): String {
    return func(msg)
}


//5 exercise
fun printEvenNumbers(numbers: List<Int>) = numbers.filter { it % 2 == 0 }.forEach { println(it) }

//6 exercise

fun doubleValue(number :Double): Double {

    return  number*2
}