import java.util.*

class Rectangle(val width: Int, val height: Int) {
    val isSquare: Boolean
        get() {
            return width == height
        }

}

fun main(){
    val rectangle = Rectangle(2,3)
    println(rectangle.isSquare)

    println(eval(Sum(Sum(Num(2),Num(5)),Num(2))))
    map()

}

enum class Color(val r: Int, val g: Int, val b: Int){
    RED(255,0,0)
}

interface Expr
class Num(val value: Int): Expr
class Sum(val left : Expr,val right: Expr): Expr

fun eval(e: Expr): Int{
    if (e is Num){
        return e.value
    }

    if (e is Sum){

        return eval(e.left) + eval(e.right)

    }
    throw IllegalAccessException("Unknown expression")
}

fun eval1(e: Expr): Int =
        when(e){
            is Num ->{
                e.value
            }

            is Sum ->{
                val left = eval1(e.left)
                val right = eval1(e.right)
                left + right
            }

            else -> throw IllegalAccessException("Unknown expression")
        }

fun map(){
    val binaryReps = TreeMap<Char, String>()
    for (c in 'A'..'f'){
        val binary = Integer.toBinaryString(c.toInt())
        binaryReps[c] = binary
    }

    for ((letter,binary) in binaryReps){
//        println("$letter = $binary")
    }
    println("kotlin" >"java" && "kotlin" < ("scala"))

}