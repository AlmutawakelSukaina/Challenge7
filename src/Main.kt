fun main() {
    val Su = StandarLibraryFunction("Sukiana", 30)
//Apply
    Su.apply {
        Name = "Ali"
    }
    println(Su.Name)

    //Let
    var LET = "Hello World"
    var len = LET.let {
        println("let() called on $it")
        println(it.length)
    }
    //run
    var RUN = "Welcome"
    println(RUN)
    RUN = run {
        RUN = "Inside the Run"
        RUN
    }
    println(RUN)

    //with

    with(Su)
    {
        Name = "Omar"
        age = 90
    }
    println("Name ${Su.Name}  Age ${Su.age}")

    //also
    val listColor = mutableListOf("Red", "Yellow", "Green")
    listColor.also {
        println("The list Before add $it")
    }.add("White")

    listColor.also {
        println("The list Before add $it")
    }

//Standard library infix function notation
    var a=10
    var b=30
    var c=90

    var result1=(a>b).or(b<c)
    println(result1)
    var result2=a.shl(1)
    println(result2)
    println(a++)

  //User defined infix function notation

  var m=infixFunction()
    val result3= m DoubleOFNum 5
    println("Double of 5 is $result3")

    val AD="SALWA"
    val result4=m CheckDataType AD
    println("The dateType of AD is $result4")

    //Member Function
    //Local function
    fun Message(N:String):String
    {
        return "Welcome $N "
    }
    val n="Ali"
     println(Message (n))
     //Inline Function
    val mm=memberFun()
    var aa = 2
    println(mm.someMethod(aa, {println("Just Inline function")}))

    //Lambda Function

    var sum: (Int, Int) -> Int = fun(x: Int, y: Int): Int = x + y
    println(sum(2,3))

    //User defined Function
    var mul=multi(5,8)
    println("The multiplication of 5,8 =$mul ")


    val stringLength: Int = stringLengthFunc("Good morning")
  println(stringLength)
}


//User defined Function
val stringLengthFunc: (String) -> Int = { input ->
    input.length
}
fun multi(a: Int, b: Int): Int {
    var number = a.times(b)
    return number
}




class memberFun

{

    inline fun someMethod(a: Int, func: () -> Unit):Int {
        func()
        return 2*a
    }




}
class infixFunction {

    infix fun DoubleOFNum(Num: Int): Int {
        var x = Num * 2
        return x

    }

    infix fun CheckDataType(Element: Any): Any {
        var y = when (Element) {
            is String -> "String"
            is Int -> "Integer"
            is Double -> "Double"
            else -> "Invalid"
        }
        return y
    }


}





class StandarLibraryFunction
{

 var Name:String=" ";
 var age:Int=0;

    constructor(Name:String,age:Int)
    {
        this.Name=Name
        this.age=age
    }


}