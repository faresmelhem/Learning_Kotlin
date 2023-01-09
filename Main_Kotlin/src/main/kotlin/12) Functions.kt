fun main() {


    voulme1(1,5,6)
    voulme2(height = 3,length = 6)// u can change squance order like this

}

fun voulme1(length:Int , breadth:Int, height:Int=10):Unit  // we put height as default value
{

println( length * breadth * height )
}


fun voulme2(length:Int , breadth:Int=7, height:Int):Unit  // we put breadth as default value
{

    println( length * breadth * height )
}
