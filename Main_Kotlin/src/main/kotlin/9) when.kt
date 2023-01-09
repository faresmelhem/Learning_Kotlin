fun main() {
    when(val x= readLine()!!.toInt()){// if i don't put constant the (when) wont work

        1 -> println("x is 1")

        2 , 3-> println("x is 2 or 3")

        4-> {
            println("x is 4")
            println("test") }

        4-> println("x is 4")// first one will be used

        in 5..10-> println("x is $x")// you can use !in (not in)

        else -> print("x is unknown")    }

    /////////////////////////////////////////////////////////

    var y= readLine()!!.toInt()

    when(y){ 1->y=8 }

    //////////////////////////////
    val z:String = when(y){ 1->"insert" else ->"update"}
    print(z)
    ///////////////////////////////

    val ll ="Aiman"

    when(ll){
        "Aiman"-> print("d")
    }
}