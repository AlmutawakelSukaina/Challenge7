fun main()
{
val p=person("Ali",20)
    val x=person.Person("Ali")
    println(x.toString())
    println(p.toString())
    println(x.hashCode())
    println(p.hashCode())
    println(x.copy("Khaled"))
   // println(p.copy("Khaled"))

}



class person(name:String,Age:Int)
{
    var name="A"
    var Age=20
    data class Person(val name:String)
    {
        val Age=0
    }


}