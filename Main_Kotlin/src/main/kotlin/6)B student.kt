class `6)B student` {
    var name:String=""
    var id:Int=0
    var status:Boolean=false

    fun fillData(){
     println("enter your name ")
        name= readLine()!!.toString()

        println("enter your id ")
        id= readLine()!!.toInt()

        println("enter your subject status")
        val subject= readLine()!!.toString()

        status = subject=="pass"
    }
    fun printData(){
        println("student username is: $name")
        println("student id is: $id")
        println("student status is: $status")
    }
}

