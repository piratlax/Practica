class Apple2() {
    var color: String? = null
    var shape: String? = null

    constructor(color:String, shape:String):this() {

        this.color = color
        this.shape = shape
    }
    fun GetColor(): String? {

        return this.color
    }

    fun GetShape(): String? {
        return this.shape
    }

}
fun main(args: Array<String>) {
    var fruit = Apple2("roja","redonda")
    var greenFruit = Apple2("verde","ovalada")
    println (fruit.GetColor())
    println (fruit.GetShape())
    println (greenFruit.GetColor())
    println (greenFruit.GetShape())
}