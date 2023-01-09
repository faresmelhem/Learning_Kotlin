fun main() {

  var  i=1..10

    for (x in i){

        if (x %2 ==0){
            if (x==6) continue// u can put @  to use continue for outter loob look bottom eg
            println(x)
    }}

    println("2nd eg")
///////////////////////////////////////

 myloob@   for(z in 1..3 )
    {
        for (h in 1..3)

        { if (z==2 && h == 2)

            break@myloob  //break stops the inner loob only so we use tag to stop the loob u want

            println(z)} }
}

