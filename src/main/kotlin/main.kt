fun main(args: Array<String>) {
    println(flower(22,17))

}
fun flower(a:Int,b :Int):Boolean{
    var first = a % 2 ==0
    var second = b % 2 ==1
    return first == second

}