fun main() {

    var dog = Dog()
    dog.bread = "labra"
    dog.color = "black"
    dog.bark()
    dog.eat()

    var cat = Cat()
    cat.age = 7
    cat.color = "brown"
    cat.meow()
    cat.eat()

    var animal = Animal()
    animal.color = "white"
    animal.eat()
}

open class Animal {         // Super class

    var color: String = ""

    fun eat() {
        println("Eat")
    }
}

class Dog : Animal() {      // Sub class

    var bread: String = ""

    fun bark() {
        println("Bark")
    }
}

class Cat : Animal() {      // Sub class / Child class / Derived class

    var age: Int = -1

    fun meow() {
        println("Meow")
    }
}