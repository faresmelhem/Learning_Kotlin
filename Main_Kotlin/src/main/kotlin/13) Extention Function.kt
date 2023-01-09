fun main() {

    val st= Student()
/////////////////////////////////////////////
    println("please enter your mark")
    var m= readLine()!!.toInt()
    println(st.pass(m))
/////////////////////////////////////////////
    st.gpa()
////////////////////////////////////////////

    val q:String= "hey"; val w:String=" hello" ; val e:String=" world"

    println(q.add(w,e))
/////////////////////////////////////
    var x:Int=5
    var z:Int=10
    var y:Int
    y= z.greaterThan(x)

    print(y)
}

class Student// if u put private u wont be able to create extension function
{
    fun pass(mark:Int=0):Boolean = mark >= 50

}
///////////////////////
fun Student.gpa () // extension function
{
    var x:Int ; var z=0
    for (i in 1..4)
    { x= readLine()!!.toInt()
        z += x }

   println(z/100.0)
}
///////////////////////
fun String.add(n1:String,n2:String):String//string is a class and can use extension from it  :D lol
{
return this + n1 +n2 // "this" stands for the "q"
}
//////////////////////////
fun Int.greaterThan(i:Int):Int
{
    if(this >i)
        return this
    else return i
}
/////////////////////