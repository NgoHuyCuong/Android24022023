fun main(args: Array<String>) {
//     Dấu // gọi comment
//     1: Khai báo biến
//     mutable, immutable
//
//     Từ khóa khai báo biến là var
//    var name = "Phạm Tấn Phát"
//    name = "Phạm Tấn Phát 1"
//    print(name)
//     Từ khóa khai báo val
//    val pi = 3.14
//    val address = "199 Lý thường kiệt"

//     2: Kiểu dữ liệu
//     Kiểu String: Chuỗi
//    var text: String = "Hello"
//     Kiểu số nguyên: Int, Long
//    var age: Int = 29
//     Kiểu số thực: Float, Double
//    var weight: Float = 74.9f
//    var query = """
//        SELECT * FROM TableName
//        WHERE ID = 1
//        ORDER BY DESC
//    """.trimIndent()
//    print(query)
//    Kiểu lý luận: Boolean
//     var isMale: Boolean = true

//    3: Toán tử
    // Dấu + mà xử lý với chuỗi thì mang tính chất là phép nối chuỗi
    // String interpolation: Dùng để truyền biến vào 1 chuỗi
//    var number1 = 5
//    var number2 = 7
//
//    var result = ++number1 - --number2 + number1++ - number2++ + number2--
    // 6 - --number2 + number1++ - number2++ + number2--; a + 6, b = 7
    // 6 - 6 + number1++ - number2++ + number2--; a = 6, b = 6
    // 6 - 6 + 6 - number2++ + number2--; a = 7, b = 6
    // 6 - 6 + 6 - 6 + number2--; a = 7, b = 7
    // 6 - 6 + 6 - 6 + 7; a = 7, b = 6

    // number1 = 7, number2 = 6, result = 7

//    println("Number1: $number1")
//    println("Number2: $number2")
//    println("Result: $result")

    // Toán tử variable++
    // Thực hiện phép gán
    // Thực hiện tăng giá trị variable lên thêm 1

    // number1 =6, number2 = 6, result = 6
    // number1: 7  ; number 2:6  ; number:7
    // number1 = 5, number2 = 7, result = 7

//    4: Câu điều kiện => Đưa ra các trường hợp để có thể giải quyết

    // So sanh 2 số nếu
    // a > b => in ra la 1
    // a < b => in ra -1
    // a == b => in ra 0

//    var a = 5
//    var b = 5

    // magic number

//    if (a > b) {
//        print("A lon hon b")
//    } else if (a < b) {
//        print("A be hon b")
//    } else {
//        print("A bang b")
//    }

    // Tính bmi : cân nặng / chiều cao * chiều cao

//    var weight: Float = 74.5f
//    var height: Float = 1.75f
//
//    var bmi = weight / (height * height)
//    var message: String
//
//    var maxValueThin = 18.5f
//    var maxValueNormal = 24.9f
//    var maxValueLittleOverWeight = 29.9f
//    var maxValueFatLevel1 = 34.9f
//    var maxValueFatLevel2 = 39.9f
//
//    if (bmi < maxValueThin){
//        message = "Gầy"
//    } else if (bmi < maxValueNormal){
//        message = "Bình thường"
//    }else if (bmi < maxValueLittleOverWeight){
//        message = "Hơi béo"
//    } else if (bmi < maxValueFatLevel1){
//        message = "Béo phì cấp độ 1"
//    } else if (bmi < maxValueFatLevel2){
//        message = "Béo phì cấp độ 2"
//    } else {
//        message = "Béo phì cấp độ 3"
//    }
//
//    println("Chỉ số cơ thể: $bmi")
//    println("Tình trạng sức khỏe: $message")

    // In
    // Chỉ số cơ thể: ?
    // Tình trạng sức khỏe: ?

//    var numberA = 5
//    var numberB = 10
//    var message: String = if (numberA > numberB) {
//        "A lớn hơn B"
//    } else if (numberA < numberB) {
//        "A bé hơn B"
//    } else {
//        "A bằng B"
//    }
//
//    print(message)

    // Toán tử && và ||

//    var account = ""
//    var password = "a"
//
    // Nếu như tài khoản và mật khẩu có giá trị thì mới cho đăng nhập
//
//    if (account.length == 0 || password.length == 0) {
//        print("Chưa truyền đủ thông tin để xử lý")
//    } else {
//        print("Xử lý đăng nhập")
//    }

    // 4: Câu điều kiện when

//    var month = 6
//
//    var message = when (month) {
//        in 1..3 -> "Quí 1"
//        4, 5, 6, 8, 9 -> "Quí 2"
//        else -> "Không thuộc quý nào"
//    }
//
//    print(message)

    // 5: Mảng

//    var arrNumbers = mutableListOf<Int>(1, 3, 5, 7, 9)

    // Thêm dữ liệu vào mảng
//    arrNumbers.add(11)

    // In giá trị phần tử đầu tiên
//    println("Giá trị phần tử đầu tiên: ${arrNumbers[0]}")

    // In giá trị phần tử cuối cùng
//    println("Giá trị phần tử cuối cùng: ${arrNumbers[arrNumbers.size - 1]}")

    // Xóa phần tử trong mảng
//    arrNumbers.removeAt(0)

    // Sửa giá trị
//    arrNumbers[0] = 11
//    print(arrNumbers[0])

    // 6: Vòng lặp for

    // in: trong khoảng
//    for ((index, item) in (1..10 step 2).withIndex()) {
//        println("Index: $index, Item: $item")
//    }

    // until: Bé hơn chứ không bằng
//    for (item in 1 until 10) {
//        print(item)
//    }

    // down to: Đếm ngược
//    for (item in 10 downTo 1) {
//        println(item)
//    }

//    var count = 0
//
//    for (item in 1..100){
//        // Kiểm tra giá trị chia hết cho 2 và 5
//        if (item % 2 == 0 && item % 5 == 0) {
//            count++
//            if (count == 2) {
//                println(item)
//                break
//            }
//        }
//    }

//    var arr1 = mutableListOf(5, 4, 3, 2, 1)
//    var arr2 = mutableListOf(10, 20, 30, 40, 50)
//
//    for ((index, item) in arr1.withIndex()) {
//        if (index == 0) {
//            continue
//        }
//        println(item)
//    }

//    loop1@ for (elementArr2 in arr2) {
//        println("Vòng lặp 1: $elementArr2")
//        loop2@ for (elementArr1 in arr1) {
//            println("Vòng lặp 2: $elementArr1")
//            break@loop2
//        }
//    }

//    7: Vòng lặp while
//    var count = Random.nextInt(10)
//
//    while (count % 2 == 0) {
//        println(count)
//        count = Random.nextInt(100)
//    }

//    8: Phương thức
//    showMessage("Hello")

//    9: Object

    // Phuong thuc khoi tao
//    var cat = Animal()
//    cat.name = "a"
//    cat.weight = "5.0 kg"
//
//    print(cat.name)
//    cat.printInfo()
//    var cat2 = Animal("Doremon", "5.0 Kg")
//
//    cat.printInfo()
//    cat2.printInfo()

    // Tinh dong goi: The hien viec cac thong tin cua doi tuong nen su dung qua cac
    // phuong thuc getter va setter de truy cap

    // Tinh ke thua: Nâng cấp các chức năng mới
//
//    var cat1 = Cat (name = "Kity", weight = "3kg", color = "white")
//    cat1.printInfo()
//    var cat1 = Cat("Kity", "3 Kg", "White")
//    cat1.printInfo()
//    cat1.run ()
//
//        var cat1 = Cat("Kity", "3 Kg", "White")
//        cat1.printInfo()

//    Tính trượu tượng
//    var pizzaStore = PizzaStore()
//    pizzaStore.orderPizza(PizzaStore())
//Tính đa hình: cùng tên nhưng tùy thuộc vào đối tượng
    var cat1 = Cat ("Kity", weight = "3 Kg", color = "White")
    cat1.printInfo()
}


//fun showMessage(message: String) {
//    println(message)
//}
