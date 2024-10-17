package main.date

import java.time.LocalDate

data class Date(
    val year: Int,
    val month: Int,
    val day: Int
):Comparable<Date> {
    constructor() : this(LocalDate.now().year, LocalDate.now().monthValue, LocalDate.now().dayOfMonth)

    // Implementing natural ordering by comparing year, then month, then day
    override fun compareTo(other: Date): Int {
        return compareValuesBy(this, other, Date::year, Date::month, Date::day)
    }
}






//    :Comparable<Date> {
//    override fun compareTo(other: Date): Int {
//
//    }
//}
//vagy
//class MyDate (year: Int, month: Int, day: Int) {
    ////
//}
//
//fun Date.isValidDate() {
//    var dayIsValid=when(month) {
//        2-> day in 1..daysInFebruary
//        4.6.9.11 -> day in 1 =<
//    }
//
//}
//
//fun Date.isLeapYear(): Boolean {
//
//}

