class Animal {
    // 1: Thuoc tinh
    // 2: Chuc nang

    var name: String = ""
        set(value) {
            if (value == "") throw Exception("Null")
            field = value
        }
        get() { return "Get $field" }

    var weight: String = ""
        get() { return "Weight $field" }
        set(value) {
            field = value
        }

    fun printInfo() {
        println("Name: $name, weight: $weight")
    }

}