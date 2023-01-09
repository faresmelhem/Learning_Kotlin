fun main() {

    println("please type your name:")
    var name :String = readLine().toString()
    display(name)
    /*                                                        */
    sum()
    println(sum())
}

fun display(n:String):Unit// return type unit is like void
{ println(n)}

fun sum():Int{
    var a =5
    var b = 6
    return a+b }

fun x1():Int=5
fun x2()="me"
// fun x3():Int    wrong , u need body

fun x4():Any=true
//fun x5():Unit=5   wrong
//fun x6():Nothing=5  wrong

