class Apple(color:String, shape:String) {
    var color: String? = null
    var shape: String? = null

    init {
        println("color $color y su forma es $shape")
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
    var fruit = Apple("roja","redonda")
    var greenFruit = Apple("verde","ovalada")
    println (fruit.GetColor())
    println (fruit.GetShape())
    println (greenFruit.GetColor())
    println (greenFruit.GetShape())
}