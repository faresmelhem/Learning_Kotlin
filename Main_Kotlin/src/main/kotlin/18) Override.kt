fun main(args: Array<String>) {

    val dog = MyDog()

    println(dog.color)

    dog.eat()
}

open class MyAnimal {

    open var color: String = "White"

    open fun eat() {
        println("Animal Eating")
    }
}

class MyDog : MyAnimal() {

    var bread: String = ""

    override var color: String = "Black"

    fun bark() {
        println("Bark")
    }

    override fun eat() {
      super<MyAnimal>.eat()//in case there is multi inheritance u can decide of which class to override from and use
      println("Dog is eating")
    }
}

/*
* -> i think overRide effects in initialization just
*   1. Method Overriding
*   2. Property Overriding
* */