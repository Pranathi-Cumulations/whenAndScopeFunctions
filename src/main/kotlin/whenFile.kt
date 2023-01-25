//when in kotlin is super versatile can be used as a switch statament , to casting
// as a replacement of the if else statemnt

//moreover when can be used as an expression also as a statement


fun determineGrade(marks : Int): String{
    when(marks){
        in 70..100 -> return "A"
        in 50..69 -> return "B"
        else -> return "F"
    }
}

fun determineGrade2(marks:Int): String{
    var grade = when(marks){
        in 70..100 -> "A"
        in 50..69 -> "B"
        else -> "F"
    }
    return grade
}

//when with no parameters and as a replacement to if and else


fun main(args: Array<String>) {
    var num = 8
    when{
        (num%2 == 1) ->println("Odd")
        (num%2 ==0) -> println("Even")
    }

    println(determineGrade(56))
    println(determineGrade2(90))
}





