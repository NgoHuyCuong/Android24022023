open class Animal (var name: String, var weight: String) {
  // 1: Thuoc tinh
  // 2: Chuc nang
//
//    var name: String = ""
//        set(value) {
//            if (value == "") throw Exception("Null")
//            field = value
//        }
//        get() { return "Get $field" }
//
//    var weight: String = ""
//        get() { return "Weight $field" }
//        set(value) {
//            field = value
//        }

  open fun printInfo() {
    println("Name: $name, weight: $weight")
  }

}