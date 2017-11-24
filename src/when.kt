fun main(args: Array<String>) {
    var calificacion:Int= readLine()!!.toInt()

    if (calificacion==2){
        println ("presionaste 2")
    }
    when(calificacion){
        1->{println("uno")}
        5->{
            for (i in 0..10 step 2)println ("Hola" + i)
        }
    }

for  (i in 6 downTo 1) println(i)

}