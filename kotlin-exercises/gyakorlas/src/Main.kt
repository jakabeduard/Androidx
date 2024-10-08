fun main() {
    //println("Hello World!")

    ///val  es var-variable;
    val name ="Ktlin"
    var number=3
    number=4
    /// tipus  megadas   nem kotlezo ha erteket adunk  egybol
    ///  maskepp ,  val/var  name:String/Int
    ///pl val name : String
    val name2: String
    val number2: Int
    number2=23



    println(name)
    println("number ertek   $number")
    println("number ertek   $number+$number2")
    println("number ertek   ${number+number2}")

    val szamokImmutalabe=listOf<Int>()
    val szamokMutalabe=mutableListOf<Int>(1,3,5,7,8,9,10)
    //szamokImmutalabe.add  nincs
    //szamokMutalabe.add  van
    var szamokImmutalabe2=listOf<Int>( 1,2,4,5,6)/// lehet  masik  listat csinalni igy
    szamokImmutalabe2= listOf(577890,75675,878,6)
    println(szamokImmutalabe2)
    szamokMutalabe.add(34)
    szamokMutalabe.add(44)
    println(szamokMutalabe)
    for(elem in szamokMutalabe){
        println(elem)
    }

    for(e in szamokMutalabe){
        println(e)
    }

    for(i in 0..<szamokMutalabe.size){
        println(szamokMutalabe[i])
    }

    szamokMutalabe.forEach{t->println(t)}
    szamokMutalabe.forEach{elem->println(elem)}
    szamokMutalabe.forEach{it->println(it)}
    szamokMutalabe.forEach{println(it)}

    val lista=listOf<String>("hkjlskdjfl,fasdfjahk, dfasjdfh")

    val valtzoLista=mutableListOf<String>("fjasodfkjasdlf  fsdjkflajd kjlsdkjkl")
    valtzoLista.add("klsdjflsdk")
    valtzoLista.forEach{szo->print("$szo ")}
    val negativak= szamokMutalabe
        .map{ elem->elem*(-1)}

    negativak.forEach{println(it)}
    val negativakParosak= szamokMutalabe
        .map{ elem->elem*(-1)}
        .filter{ i->i%2==0 }
    negativak.forEach{println(it)}
    //ha nem kell a valtozo  akkor igy is lehet
    szamokMutalabe
        .map{ elem->elem*(-1)}
        .filter{ i->i%2==0 }
        .forEach{println(it)}

    println(avg(5,2))
    println(szamol(szamokMutalabe))

    val szemely= Person("Edu", 23 , true )
    println(szemely)


}
fun avg(elso: Int, masodik:Int ):Double{

    return (elso+masodik)/2.0
}
//void =Unit
fun szamokkir(lista:List<Int>):Unit{
    lista.forEach{t->println(t)}
}
//vagy
fun szamokkir2(lista:List<Int>){
    lista.forEach{t->println(t)}
}

fun szamol(lista:List<Int>):Int{
    var db=0
    lista.forEach{t->db+=(t)}
    return db
}
fun szamol2(lista:List<Int>):Int {
    return lista.sum()
}
fun szamolCompct(lista:List<Int>)= println(lista.sum())