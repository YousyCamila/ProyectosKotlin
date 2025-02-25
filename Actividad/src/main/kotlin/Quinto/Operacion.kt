package Quinto


// Definimos una función de orden superior llamada `operacion`
// Esta función recibe otra función como parámetro y la ejecuta

fun operacion(funcion: () -> Unit) {
    println("Función en ejecución...")
    funcion()
}
