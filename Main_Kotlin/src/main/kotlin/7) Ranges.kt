import kotlin.random.Random

fun main() {

    val rMain= 1..10  // .. mean  from number 1 to 10

    ////////////////////////////////// ranges basics: from / down to / until /step

     val r1= 1..5// has num 1 2 3 4 5
    println("r1= $r1")

    val r2 = 5 downTo 1// has num 5 4 3 2 1
    println("r2= $r2")
// if u reverse it , it will give logical error not code error

    val r3= 5 downTo 1 step 2 // has 5 3 1
    println("r3= $r3")

    val r4= 'a'..'z' // has a b c d.... x y z
    println("r4= $r4")

    val isPresent='a' in r4// has true or false , it checks if element is there or not
    println(isPresent)

    val r5=10.downTo(1) // 5 4 3 2 1
    println("r5= $r5")

    val r6=1.rangeTo(5) // 1 2 3 4 5
    println("r6= $r6")

    val r7= 1 until 5 // 1 2 3 4 // until doesn't include last number
    println("r8= $r7")

    //////////////////////////////////////// Random

    val r8=(1..5).random()// easy random :D
    println("r7= $r8")

    val x=(1..5).random()
    println("x= $x")

    val y=(10..15).random()
    println("y= $y")

    val z = Random.nextInt(9)  // number is in range [0, limit)
    println("z= $z")

    print("l= ")
    for (l in z..y) print("$l ") // z value must be lower than y else logical error

println()

//////////////////////////////////////// Reverse and filter

    print("q= ")
    for (q in rMain.reversed())
        print("$q ")

println()

    print("w= ")
    for (w in (5 downTo 1).reversed())
        print("$w ")
println()

    println("rMain= ${rMain.filter { it % 2 == 0 }}") // 2 4 6 8 10
}