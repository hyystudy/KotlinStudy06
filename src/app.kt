fun main(args: Array<String>) {
    //可空基本数据类型 由于可能会存在null 对应都是java中的包装类型
    println(Person("hyy", 25).isOlderThan(Person("zal", 26)))
    println(Person("hyy", 25).isOlderThan(Person("zal")))

    val i = 1
    //错误 类型不匹配
    //val l : Long = i
    //只能显示转换
    val l: Long = i.toLong()
    val x: Long = 1
    val y: Int = x.toInt()

    val list = listOf(1L, 2L, 3L)
    println(i.toLong() in list)

    foo(42)

    val b: Byte = 1
    val a = b + 3L//自动提升为long
    println(a in list)

    val answer: Any = 42//any 是根类 和java的object类一样 但是不能为null
    val any: Any? = null//any? 可以为null
}

//Unit 相当于java中的void
fun printTset(string: String) : Unit {
    println(string)
}

fun foo(long: Long) = println(long)
data class Person(val name: String,
                  val age: Int? = null){//对应Integer
    fun isOlderThan(other: Person): Boolean?{
        if (age == null || other.age == null) return null
        return age > other.age
    }
}