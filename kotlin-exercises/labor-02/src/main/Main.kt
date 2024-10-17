package main

import main.date.Date
import main.dictionary.IDictionary
import main.dictionary.ListDictionary
import java.time.LocalDate
import java.util.*

fun main(args: Array<String>) {
//1 exercise
//    val dict: IDictionary = ListDictionary
//    //val dict2: IDictionary = ListDictionary
//
//
//    println("Number of words: ${dict.size()}")
//    var word: String?
//    while(true){
//        print("What to find? ")
//        word = readLine()
//        if( word.equals("quit")){
//            break
//        }
//        println("Result: ${word?.let { dict.find(it) }}")
//    }
//2 exercise
    println("2.exercise:")
    val name ="Jakab Eduard"
    println(name.monogram())

    val fruits = listOf("apple", "pear", "melon")
    println(fruits.joinWithSeparator("&"))

    println(fruits.longestString()) // Output: "strawberry"

//3 exercise
//val firstDate = Date(2024,10,3)
//val secondDate = Date()
//val thirsDate = Date(2024)
//val fouthDate = Date(2)
    println("3.exercise:")
    val dates = mutableListOf<Date>()
    val random = Random(System.currentTimeMillis())
    while (dates.size < 10) {
        // Generate random year, month, and day
        val randomYear = random.nextInt(1900, 2025)
        val randomMonth = random.nextInt(1, 13)
        val randomDay = random.nextInt(1, 32)

        val randomDate = Date(randomYear, randomMonth, randomDay)



        ///ellelnorzes  megirt fuggvenyel
        if (randomDate.isValid()) {
            dates.add(randomDate)
            println(" Random valid datum: $randomDate")
        } else {
            println("Invalid datum: $randomDate")
        }
        if(randomDate.isLeapYear()){
            println("Szoko ev: $dates")
        }

    }

   // dates.forEach { println() }


}

//2 exercise
//igy lenne
//fun monogram(name:String) :String {}
//fun List<String>.joinItemsBySeparator(separator:String):String{}
fun String.monogram() :String {
    return this.split( " ").map { it.first() }.joinToString ( " ")
}
fun List<String>.longestString(): String {
    return this.maxByOrNull { it.length } ?: ""
}
fun List<String>.joinWithSeparator(separator: String): String {
    return this.joinToString(separator)

}
//3 exercise
fun Date.isLeapYear(): Boolean{
    return(this.year % 4 == 0 && this.year % 100 != 0) || (this.year % 400 == 0)
}
fun Date.isValid(): Boolean {
    return try {
        LocalDate.of(this.year, this.month, this.day)
        true
    } catch (e: Exception) {
        false
    }
}