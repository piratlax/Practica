fun suma(a:Int,b:Int){
    println(a+b)
}

fun division(a:Double,b:Double):Double{
    var resultado=a/b
    return resultado
}

fun main(args: Array<String>) {
    suma(10,20)
    println (division(7.5,2.0))
    prueba()
}

fun prueba():Unit{
    println ("estoy vacio")
}