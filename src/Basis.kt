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
//    string()
//    forUntil()
//    str()
//    foo()
//    println(foo())
    InitOrderDemo("ss")
}



fun foo() {
    val i = run loop@{
        listOf(1,2,3,4,5,6).forEach a@{
            if (it == 3) return@loop 3
            if (it == 5) return@a
            println(it)
        }
        println("loop done")
    }

}
fun foo1(){

}

fun str() {
    val s = "Hello, world!\n"
    val text = """
    for (c in "foo")
        print(c)
    """.trimMargin()
    println(text)

    val text1 = """
    |Tell me and I forget.
    |Teach me and I remember.
    |Involve me and I learn.
    |(Benjamin Franklin)
    """.trimMargin()
    println(text1)

    val prices = 9.9

    val price = """
        ${'$'} $prices
        """
    println(price)
}

fun forUntil() {
    val array = arrayListOf("a", "b", "c")
    for ((i, v) in array.withIndex()) {
        println("the element at $i is $v")
    }

    for (i in 1..8 step 2) println(i)

    for (i in 8 downTo 1 step 2) println(i)


}




fun decimalDigitValue(c: Char): Int {

    val asc = Array(5, { i -> (i * i).toString() })
    asc.forEach { println(it) }

    if (c !in '0'..'9')
        throw IllegalArgumentException("Out of range")
    return c.toInt() - '0'.toInt() // 显式转换为数字
}

fun sum(a: Int, b: Int): Int {
    return a + b
}

fun sum1(a: Int, b: Int) = a + b

fun printSum(a: Int, b: Int) {
    println(a + b)
}

fun arrayListString(args: Array<String>) {
    if (args.isEmpty()) return

    println("First argument: ${args[0]}")
}

fun eques() {
    val a: Int = 1000
    println(a == a)
    val boxedA: Int? = a
    val otherBoxedA: Int? = a;
    println(boxedA == otherBoxedA)

    val b: Byte = 1
    val c: Int = b.toInt()
}

fun array() {

    val asc = Array(5, { i -> (i * i).toString() })
    for (s in asc)
        println(s)
}

fun string() {
    val i = 10
    val s = "i = $i"
    println(s)
    val a = "abcd"
    val str = "$a.lenth is ${a.length}"
    println(str)
}

fun stringTrimMargin() {
    println(""" sfasdfad
        | shosh
    """.trimMargin())
}


fun ifFun() {
    var max: Int
    if (a < b) max = b

    if (a < b) {
        max = b
    } else {
        max = a
    }

    max = if (a < b) b else a

}

class InitOrderDemo(name: String) {
    val firstProperty = "First property: $name".also(::println)

    init {
        println("First initializer block that prints ${name}")
    }

    val secondProperty = "Second property: ${name.length}".also(::println)

    init {
        println("Second initializer block that prints ${name.length}")
    }

    var counter = 0 // 注意：这个初始器直接为幕后字段赋值 field
        set(value) {
            if (value >= 0) field = value
        }
        get() {
           return field * field
        }
    fun test (){
        counter = 2

        println(counter)

        _table = mapOf("ss" to 1)
        val pair = "ss" to 1

        var ss = "3222"
        ss = "22"

    }


    private var _table: Map<String, Int>? = null
    public val table: Map<String, Int>
        get() {
            if (_table == null) {
                _table = HashMap() // 类型参数已推断出
            }
            return _table ?: throw AssertionError("Set to null by another thread")
        }

}
