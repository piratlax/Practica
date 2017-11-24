fun main(args: Array<String>) {
    var nombre=ArrayList<String>()
    nombre.add("Mao")
    nombre.add("Fabiola")
    nombre.add("Mao Roberto")
    nombre.add("Manolo")
    nombre.add("Barbara")
    nombre.add("Melissa")

    for (todos in nombre) {

        println("Nombre " + todos)
        println (todos.length)

    }

    if (nombre.contains("Mao")){
        println("Ya existe el nombre")
    }else{
        println ("No existe el nombre")
    }
}