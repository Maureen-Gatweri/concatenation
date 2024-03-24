fun main() {
    var firstName = "Maureen"
    var lastName = "Gatweri"
    var fullName = firstName + " " + lastName
    println(fullName)


    var num1 = 345
    var num2 = 456
    var sum = num1 + num2
    println(sum)
    var num3 = 5770
    var num4 = 670
    var subtract = num3 - num4
    println( subtract)

    var num5 = 6000
    var num6 = 300
    var divider = num5 / num6
    println(divider)

 var name = "Maureen"
 var age = 20
 var country = "Kenya"
    var sentence = name+ " "+age+ " " +country
 println(sentence)


    var y = "Hi, my name is"
    var name = "Gatweri"
    var x = "and I am"
    var age = 20
    var z = "years old"

    var sentence: S = (y + "" + name + "" + x + "" + age + "" + z).apply {
        println(this)
    }


}
