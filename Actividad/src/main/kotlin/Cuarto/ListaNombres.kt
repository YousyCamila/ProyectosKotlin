import java.util.Scanner

class ListaNombres {

    private val scanner = Scanner(System.`in`)
    private val nombres = mutableListOf<String>()

    // Método para inicializar la lista con nombres predeterminados
    fun inicializarLista() {
        nombres.addAll(listOf("Ana", "Carlos", "Diana", "Eduardo"))
        println("Lista inicial de nombres: $nombres")
    }

    // Método para agregar un nombre a la lista
    fun agregarNombre() {
        print("Ingrese un nombre para agregar a la lista: ")
        val nombre = scanner.nextLine()
        nombres.add(nombre)
        println("Nombre agregado exitosamente.")
    }

    // Método para mostrar la lista actualizada
    fun mostrarLista() {
        println("Lista actualizada de nombres: $nombres")
    }
}