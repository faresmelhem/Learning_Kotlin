fun main() {

    var st=Student1("fares",10)
}

class Student1 (var name: String)//first thing to execute is 1st constructor
// then init then 2nd constructor
{
    var id :Int=-1
    //var name :String="dummy" //

   init {
       //this.name=name // (this) key word means the one is defined in the class
       println("student has got name as ${this.name}")}

    constructor(n:String,id:Int):this(n)// u can declare in 2nd constructor but
    // won't be property and if there is no primary constructor u can remove the call
    {
        this.id=id
    }
}