package main

import main.date.Date
import main.dictionary.IDictionary
import main.dictionary.ListDictionary

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
    val name ="Jakab Eduard"
    println(name.monogram())

    val fruits = listOf("apple", "pear", "melon")
    println(fruits.joinWithSeparator("#"))

    println(fruits.longestString()) // Output: "strawberry"

//3 exercise
//val firstDate = Date(2024,10,3)
//val secondDate = Date()
//val thirsDate = Date(2024)
//val fouthDate = Date(2)

}
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
    fun List<String>.longestString(): String {
        return this.maxByOrNull { it.length } ?: ""
    }

}
