var  start:Int=0

fun Int.sum(num:Int):Int{start += num ; return if (num==0) start else sum(num-1)}

//another style :
//fun recursion(a:Int,b:Int, z:Int):Int= if (a < b) z else recursion(a,b+1,z=z+b)

///////////////////////////////////////
