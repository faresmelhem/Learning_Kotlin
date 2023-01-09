fun main() {
var Tower_damage:Float
var Creep_health:Float
var Tower_Hits:Int
var Reduction:Float

while (true){

    println("please enter tower damage")
    Tower_damage= readLine()!!.toFloat()
    println("please enter creep health ")
    Creep_health= readLine()!!.toFloat()
    println("please enter Reduction ")
    Reduction= readLine()!!.toFloat()
    Tower_Hits =0
    Tower_damage = Tower_damage -  Tower_damage *  Reduction

while (Creep_health >= 0 ) {

    Creep_health = Creep_health - Tower_damage
    Tower_Hits ++

    println("Creep health:$Creep_health")
}
    println("Tower Hits: $Tower_Hits")
}
}