import javafx.beans.binding.When
import sun.plugin2.message.Message
import kotlin.random.Random
fun main(args: Array<String>) {
//    println("Hello World!")
//
//    // Try adding program arguments via Run/Debug configuration.
//    // Learn more about running applications: https://www.jetbrains.com/help/idea/running-applications.html.
//    println("Program arguments: ${args.joinToString()}")
//    1: Khai báo biến
//    mutable,immutable
//
//    var name ="Ngo Huy Cuong"
//    name = "Ngo Huy Cuong 1"
//    print (name)
//      2. Kiểu dữ liệu
//        val pi = 3.14
//        val address = "199 Ly thuong kiet"
//        var text: string = "Hello"

//        Kiểu lý luận: Boolean
//        var isMale: Boolean = true

//        var number1 = 5
//        var number2 = 10
//        var result = number1 + number2

//        3: Toán tử
//        var number1 = 5
//        var number2=number1++
//        var number3=++number1

//        var numberx = 5
//        "abc" +numberx=>abc5

//        print("Number2 : "+ number2)


        //Nguyên nhân xảy ra
//        //Do number1++ nó là biểu thức đặt biệt có 2 biểu thức con sẻ được xử lý
//        println ("Number2 : ${number2}")
//        println ("Number3 : ${number3}")
//        println ("Number2+3 : ${number1+number2}")

//        number1 = number1 + 1
//        number1+=1
//        ++number1
//        number1++

//4: câu điều kiện: đưa ra các trường hợp để có thể xử lý

//// so sánh 2 số nếu
//        a>b => in ra la 1
//        a<b=> in ra -1
//        a==b=>in ra 0

//        var a=4
//        var b=5
//        if(a>b){
//        println(" a lon hon b")
//        } else if(a<b){
//                print("a be hon b")
//        }else {
//                print("a =b")
//        }

//Tinh BMI: Cân nặng (kg)/chiều cao (m)

//
//        var weight: Float = 74.5f
//        var height: Float = 1.75f
//
//        var bmi = weight / (height * height)
//        var message: String
//
//        var maxValueThin = 18.5f
//        var maxValueNormal = 24.9f
//        var maxValueLittleOverWeight = 29.9f
//        var maxValueFatLevel1 = 34.9f
//        var maxValueFatLeve2 = 39.9f
//
//        if (bmi < maxValueThin){
//                message = "Gầy"
//        } else if (bmi < maxValueNormal){
//                message = "Bình thường"
//        }else if (bmi < maxValueLittleOverWeight){
//                message = "Hơi béo"
//        } else if (bmi < maxValueFatLevel1){
//                message = "Béo phì cấp độ 1"
//        } else if (bmi < maxValueFatLeve2){
//                message = "Béo phì cấp độ 2"
//        } else {
//                message = "Béo phì cấp độ 3"
//        }
//
//        println("Chỉ số cơ thể: $bmi")
//        println("Tình trạng sức khỏe: $message")


//        var isMale = false
//        var message = if (isMale) {
//                "Đàng ông"
//        } else if (!isMale) {
//                "abc"
//        } else {
//                "đàn bà"
//        }
//        print (message)


//        var numberA = 5
//        var numberB = 10
//        var message = if (numberA > numberB) {
//                "A lớn hơn B"
//        } else if (numberA > numberB) {
//                "A bé hơn B"
//        } else {
//                "A bằng B"
//        }
//        print (message)

//4. Toán tử && và //
//
//        var account = "a"
//        var password = " "

// nếu như tài khoản và mật khẩu có giá trị thì mới cho đăng nhập
//
//        if(account.length > 0 && password.length >0) {
//                print ("Xử lý đăng nhập")
//        } else {
//                print ("Chưa truyền đủ thông tin")
//        }

//        if (account.length == 0 || password.length == 0)
//        {
//                print(" chưa truyền đủ thông tin để xử lý")
//        } else {
//                print(" xu lý đăng nhập")
//        }

//6. Câu điều kiện when

//        var month = 6
//
//        var message = when (month) {
//            in 1.. 3 -> "quý 1"
//            4,5,6 -> "Quý 2"
//                else -> "khong co quy nao"
//        }
//                print (message)


//    var month = 6
//    var message = when (month){
//        in 1..3 -> "Quý 1"
//        in 4..6 -> "Quý 2"
//        in 7..9 -> "Quý 3"
//        in 10..12 -> "Quý 4"
//        else -> "không thuộc quý nào"
//    }
//    print (message)

//5. Mảng

//        var arrNumber = mutableListOf<Int>(1,3,5,7,9)
    //mutableListOf thay đổi duoc trong mảng
//    var arrNumber = ListOf(int)(1,3,5,7,9)
    // không thay đổi duoc trong mảng
//thêm
//    arrNumber.add (11)

// in giá trị phần tử đầu tiên
//    println("Giá trị phần tử đầu tiên: ${arrNumber[0]}")
// in giá trị phần tử cuoi cung
//    println("Giá trị phần tử cuối cùng: ${arrNumber[arrNumber.size - 1]}")

// Xoa phần tử trong mảng
//    arrNumber.removeAt(0)
//    print(arrNumber[0])
    //Sua gia tri
    
//    arrNumber[0] = 11
//    print(arrNumber)

//    6. Vong lập for

        // in: trong khoang
//    for ((index,item) in (1..10 step 2).withIndex()){
//        println ("index: $index, Item: $item")
//    }

    // until: be hon ko bang
//    for (item in 1 until 10) {
//        println (item)
//    }

    // down to: đếm ngược

//    for (item in 10 downTo 1){
//        print(item)
//    }

//    for (item in 1 ..100){
//
//        // kiểm tra giá trị chia hết cho 2 va 5 thi dừng lại
//
//        if ( item % 2 == 0 && item % 5 ==0) {
//            println(item )
//            break
//        }
//    }

//        var count = 0
//    for (item in (1 ..100)){
//
//        // kiểm tra giá trị chia hết cho 2 va 5 thi dừng lại
//
//        if ( item % 2 == 0 && item % 5 ==0) {
//            count ++
//            if(count ==2) {
//                println (item )
//                break
//            }
//        }
//    }
//
//print ("tiep tuc")

//    var arr1 = mutableListOf (5, 4, 3, 2, 1)
//    var arr2 = mutableListOf (10, 20, 30, 40, 50)
//    arr1.add (11)
//
//    loop1@ for (elementArr2 in arr2){
//        println("vòng lap 1: $elementArr2")
//        for (elementArr1 in arr1) {
//            println("Vong lap 2: $elementArr1")
//            break@loop1
//        }
//    }
    //50
    //40
    //30
    //20
    //10
    //20
    //40
    //60
    //....
    //50

    // IQ + (AQ + EQ) = 100%
    // IQ = 20%
    // AQ + EQ=> thời gian + vượt qua nỗi sợ

//    var arr1 = mutableListOf (5, 4, 3, 2, 1)
//    var arr2 = mutableListOf (10, 20, 30, 40, 50)
//
//    for((index, item) in arr1.withIndex()){
//        if (index == 3){
//            continue
//        }
//        println(item)
//    }
//Vòng lập while
//                var count = Random.nextInt ( 10)
//                while ( count % 2 == 0){
//                        println(count)
//                        count += Random.nextInt ( 100)
//                }

//8: Phương thức

//        var a = "hello"
//        println(a)

//        showMessage("Hell00o")

//        for ((index, item) in (1..10 step 2).withIndex()) {
//                println ("Index: $index, Item: $item")
//        }
//
//        for ((index, item) in ("a,b,c,d").withIndex()){
//                println("Index: $index, Item: $item")
//        }

//        for (item in 1 until 10){
//                println(item)
//        }

//        for(item in 10 downTo 1) {
//                println(item)
//        }

//9. Object
    var cat2 = Animal02 ()
    cat2.name = "Kity"
    cat2.weight = "1.2 Kg"
    print("name: ${cat2.name}, weight: ${cat2.weight}")

    var cat3 = Animal()
    cat3.name = "Doremon"
    cat3


    var cat = Animal()
    cat.name = "a"
    cat.weight = "5.0 kg"
    println(cat.name)

//        var teo = Person ()
//        cat.name = "Kitty"
//        cat.weight = "1.2 Kg"
//
//        var cat2 = Animal("Doremon", "5.0 Kg")
//        cat2.name = "Doremon"
//        cat2.weight = "5.0 kg"
//
//        println ("Name: ${cat.name}, weight: ${cat.weight}")
//        println ("Name: ${cat2.name}, weight: ${cat2.weight}")

// cách 2 để print thông tin ra thay vi phải đánh 2 dòng lệnh như trên
//        cat.printInfo()
//        cat2.printInfo()


//        tính đóng gói: quản lý thông tin khi sử dụng, không quản lý được dữ liệu đầu vào, thể hiện việc các thông tin của đối tượng nên sử dụng hoặc các phương thức getter và setter để truy cập



}

// () chứa tham số (biến)
//fun showMessage (message: String): Unit {
//println(message)
//}

