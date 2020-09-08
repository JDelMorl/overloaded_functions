fun main(){
    var userAns = 0
    var ans1 = ""
    var ans2 = ""
    var ans3 = ""
    do {
        println("Please enter the number of your selection: ")
        println("1) Residential Customer")
        println("2) Business Customer")
        print("Enter Your Choice: ")
        userAns = readLine()!!.toInt()
        if (userAns == 1) {
            print("Enter your name: ")
            ans1 = readLine().toString()
            print("Enter your phone: ")
            ans2 = readLine().toString()
            println(customer(ans1, ans2))
        } else if (userAns == 2) {
            print("Enter your name: ")
            ans1 = readLine().toString()
            print("Enter your phone: ")
            ans2 = readLine().toString()
            print("Enter your business name: ")
            ans3 = readLine().toString()
            println(customer(ans1, ans2, ans3))
        }
    }while (userAns != 1 && userAns != 2)


}


fun customer(x: String, y: String): Unit{
    return println(x + "\n" + y + "\n\n\n")
}
fun customer(x: String, y: String, z: String): Unit{
    return println(x + "\n" + y+ "\n" + z + "\n\n\n")
}