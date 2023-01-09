fun main() {

    var i= readLine()!!.toInt()
    while (i<8){

        if (i%2 ==0)
            println(i)
        i++
    }

/////////////////
    do {
        if (i%2 ==0)
            println(i)
        i++
    }while (i<20)
}