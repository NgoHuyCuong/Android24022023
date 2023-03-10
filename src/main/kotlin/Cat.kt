import java.awt.Color

class Cat (name: String, weight: String,var color: String): Animal(name, weight) {
//
//    var color: String = ""
//    constructor(name: String, weight: String, color: String): super(name, weight){
//        this.color = color
//
//        fun run (){
//            println("chay bang 4 chân")
//        }

        override fun printInfo() {
                super.printInfo()
                println("       Tinh Da Hinh--- Cat printInfo")
                super.printInfo()
        }
//        override fun printInfo() {
//        super.printInfo()
//        println("Cat printInfo")
//        }
}
//    (
//    name: String,
//    weight: String,
//    var color: String
//): Animal(name, weight) {
//
//    override fun printInfo() {
//        super.printInfo()
//        println("Cat printInfo")
