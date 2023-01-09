class Name // if u put private the other classes won't see it
{
    var fname:String=""
    var lname:String="" }

class Person  {
private var name=Name()// this is how to make a variable of a class

    fun display(F:String,L:String="me"){ // u can put default value

        name.fname=F
        name.lname=L

      println("First and Last name")
        println("first name: ${name.fname}")
        println("last name: ${name.lname}")

    }

}

fun main() {
val people=Person()// this is how to make a variable of a class

    println("enter first name")
    val f= readLine()!!.toString()

    println("enter last name")
    val l= readLine()!!.toString()

    people.display(f,l)//entering parameters


}