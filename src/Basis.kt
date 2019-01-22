import sun.rmi.runtime.Log

//常量（使用 val 关键字声明 ）
val a: Int = 1
val b = 1 // Int 类型自动推断
val c: Int = 0

fun main(args: Array<String>) {
    val c: Int
    println("Hi PeanutMan")

//    eques()
//    array()
    string()
}

fun sum(a: Int, b: Int): Int {
    return a + b
}

fun sum1(a: Int, b: Int) = a + b

fun printSum(a: Int, b: Int) {
    println(a + b)
}

fun arrayListString(args: Array<String>){
    if (args.size == 0) return

    println("First argument: ${args[0]}")
}

fun eques(){
    val a: Int = 1000
    println( a == a)
    val boxedA: Int? = a
    val otherBoxedA: Int? = a;
    println( boxedA == otherBoxedA )

    val b: Byte = 1
    val c: Int = b.toInt()
}

fun array(){

    val asc = Array(5, {i -> (i * i).toString()})
    for (s in asc)
    println(s)
}

fun string(){
    val i = 10
    val s = "i = $i"
    println(s)
    val a = "abcd"
    val str = "$a.lenth is ${a.length}"
    println(str)
}

fun stringTrimMargin(){
    println(""" sfasdfad
        | shosh
    """.trimMargin())
}

