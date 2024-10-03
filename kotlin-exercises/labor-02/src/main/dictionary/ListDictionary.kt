package main.dictionary
import java.io.File
object ListDictionary: IDictionary {
     private val words= mutableListOf<String>()

    init{
    File(IDictionary.FILE_NAME).forEachLine {add(it)}
    }


    override fun  add (word: String ): Boolean {
        ///TODO("Not yet implemented")
        words.add(word)
        return true
    }

    override fun find(word: String): Boolean {
        return words.any{ it==word }
    }

    override fun size(): Int {
        return words.size
    }
}