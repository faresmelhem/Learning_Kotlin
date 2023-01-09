import java.math.BigInteger

fun main() {
    println(getFibonacciNumber(8, BigInteger("1"), BigInteger("0")))
}

//////////// n is the target number
//////////// a is the last number
//////////// b is the before the last number
//recursion returns last updated value of the thing u returned not first time u return it

tailrec fun getFibonacciNumber(n: Int, a: BigInteger, b: BigInteger): BigInteger {
    if (n == 0) return  b
    else return getFibonacciNumber(n - 1, a + b, a) }


/* Tailrec Function : Recursive Functions
*       -> Prevents Stackoverflow Exception
*   Fibonacci Series
*   0  1  1  2  3  5  8  13  21 ......
*   p8 p7 p6  p5 p4 p3 p2 p1 p0 (if need the 8th Fibonacci number ) according to
*  above code as u can change it to count from back easily , put (n +1) and switch (n) numbers
* */


//////////////////////////////////////////////////////////


/* loop way (my code)

fun find1(T:Double,N1:Double,N2:Double,V:Double)
{ var t1=N1 ; var temp=V  ; var v1=N1  ;  var v2=N2
    // print("$v1 ,")
    while (t1 < T){
        // print(" $v2,")
        temp= v1 + v2
        v1= v2
        v2= temp
        t1++ }
    print(" $v2,")} */