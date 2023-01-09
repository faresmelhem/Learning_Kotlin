fun main() {


    val def :Int=1
    val def2 :String="string"
    val def3 :Boolean= true //the output is word not number
    val def4 :Boolean= false

    println(def)
    println(def2)
    println(def3)
    println(def4)


   // var def5 :Float=1  //wrong
   // var def5 :Int=1.5 //wrong
    val def5:Float=1.5F //you need to put "F" to say its float
    val def6:Int=1 //can't edit the value later on

    println("def5= $def5")
    println("def6= $def6")


    println(5+6) //11
    println(5.5+6) //11.5
    println(5.5 +6.0) //11.5
    //print(5+"string")//wrong
    println("strong" + " string")
    println("string " + def2)
    println("string $def2") // this method called template
    println("str\"ong\"") // str"ong"


    val name :String="me"
    println(name)
    println(name.isBlank()) // checks for non-whitespace characters
    println(name.isEmpty()) // checks string length is 0 or not

    val name2 :String ="  "
    println(name2)
    println(name2.isBlank())//blank means content is white spaces only
    println(name2.isEmpty())

    val name3:String = "faris"
    println(name3)

    //name3=4// val cannot be re-assigned if it was declared

    val name4 = "faris" //you have to write the whole word of (lateinit var)
    println(name4)

    //lateinit val name4:String //wrong

    val name5:Int?// same as lateinit
    name5 = readLine()!!.toInt()//this is how to enter value from console
    println(name4)

    val name6:Any// there is Any type same as void in c++
    name6 = readLine()!!//you don't need to change it to int because its any as u wish
    println(name5)


}//End of main

/*
*   readLine()!!  to read from console
*
* */