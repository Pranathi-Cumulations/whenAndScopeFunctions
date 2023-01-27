//let , run , apply, also , with

// let and also context object : it
// run, apply and width context object : this

//apply and also return the context object.
//let, run, and with return the lambda result.

data class Human(var name : String , var age : Int = 30)

fun main(){

    //let
    var x  = mutableListOf(1,2,3,4)
    x.map { it*it }.filter { it > 3 }.let {
        println(it)
    }
    for (each in x){
        println(each)
    }

    //returns the lambda result
    var y = x.let{
        it.size
    }

    println(y)


    //syntacticallly with is a bit different  and returns the lambda result

    val numbers = mutableListOf(1, 2, 3)
    val firstAndLast = with(numbers) {
        "The first element is ${first()}," +
                " the last element is ${last()}"
    }
    println(firstAndLast)


    //run works same as with but syntactically it is more like let
    val firstAndLast2 = numbers .run{
        "The first element is ${first()}," +
                " the last element is ${last()}"
    }
    println(firstAndLast2)

    //apply
    var human1 = Human("Pranathi").apply {
        age = 21
    }

    //also
    var human2 = Human("Pranathi").also {
        it.age = 21
    }


}
