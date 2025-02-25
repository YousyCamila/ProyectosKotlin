import Primero.Primer
import Segundo.Segundo
//import Tercero.Estudiante
import Tercero.Tercer
import Quinto.Estudiante
import Quinto.operacion
import Quinto.Libro

fun main() {
    println("Nivel 1 ")
    val primer = Primer()

    //println("Nombre = :${primer.nombre}")
    //println("Apellido = :${primer.apellido}")

    //OPERACIONES
   // println ("Suma : ${primer.suma}")
   // println ("Resta : ${primer.resta}")
    // println ("Multiplicacion : ${primer.multiplicacion}")
    //println ("Division : ${primer.division}")


    //primer.cambiarVariables()
    //primer.pregunta()

//SEGUNDO NIVEL
    val segundo = Segundo()
    //segundo.numEntero()
    //segundo.opDouble()
    //segundo.producto()
    //segundo.promedio()

// TERCER NIVEL
    val tercer = Tercer()

    //tercer.definirlo()
    // tercer.positivo()
    //val estudiante1 = Estudiante("Camila", 19)
  //  val estudiante2 = Estudiante("ludwig", 22)
   // tercer.solicitud()
    //tercer. convertidor()

// CUARTO NIVEL  val cuentaBancaria = CuentaBancaria()
//    val ejercicio1 = Ejercicio1()
//    val listaNombres = ListaNombres()
//    val propiedadPersonalizada = PropiedadPersonalizada()
//    val animal = Animal()
//
//    //Metodo para el ejercio 1 del for
//
//    ejercicio1.imprimirArray()
//
//    //Metodos relacionados con el ejercicio de cuanta bancaria
//
//    cuentaBancaria.inicializarCuenta()
//    cuentaBancaria.depositar()
//    cuentaBancaria.mostrarDetalles()
//    cuentaBancaria.retirar()
//    cuentaBancaria.mostrarDetalles()
//
//    //Metodos relacionados al Listas mutables relacionado de la clase ListasNombres
//
//    listaNombres.inicializarLista()
//    listaNombres.agregarNombre()
//    listaNombres.mostrarLista()
//
//    //Metodos relacionados con el ejercicio 4 paraestablecer valores a propiedades
//    // Establecer un valor válido
//    propiedadPersonalizada.establecerValor(10)
//    // Obtener el valor actual
//    val valorActual = propiedadPersonalizada.obtenerValor()
//    // Intentar establecer un valor inválido (negativo)
//    propiedadPersonalizada.establecerValor(-5)
//
//    //Metodos relacionados al ejercicio 5
//
//    println("Sonido del animal genérico:")
//    animal.hacerSonido()
//
//    // Crear una instancia de la clase derivada Perro
//    val perro = Perro()
//    println("\nSonido del perro:")
//    perro.hacerSonido()

    //QUINTO NIVEL

    println("Nivel 5-2.1")
    println("\n")
    val numeros =
        mutableSetOf(
            1,
            2,
            3,
            4,
            5
        ) // Se usa mutableSetof para poder modificar el conjunto de números después de crearlo

    println("Set original: $numeros")

    // acá se usa .add para intentar agregar o validar si el número ya existe
    val agregado = numeros.add(3)

    println("Intento de agregar el número 3 nuevamente: $agregado")
    println("Set después del intento: $numeros")

    println("\n")
    println("Nivel 5-2.2")
    println("\n")
    val estudiantes =
        listOf(
            Estudiante("Santiago", 20, 6.5),
            Estudiante("Miguel", 22, 6.7),
            Estudiante("Jordan", 21, 6.2),
            Estudiante("Henry", 19, 5.4),
            Estudiante("Jason", 23, 7.5)
        )
    // it se refiere a cada estudiante de la lista estudiantes
    // (es un parámetro implícito en lambdas).
    // Filtramos los estudiantes con promedio mayor a 7

    val aprobados = estudiantes.filter { it.promedio > 7 }

    // Recorremos la lista de aprobados y mostramos cada estudiante en la pantalla.
    println("Estudiantes con promedio superior a 7:")
    aprobados.forEach { println(it) }

    println("\n")
    println("Nivel 5-2.3")
    println("\n")

    // acá llamamos la función `operacion`, pasando una lambda como argumento
    operacion { println("¡Hola desde la función lambda!") }

    println("\n")
    println("Nivel 5-2.4")
    println("\n")

    // Creamos una instancia de la data class Libro
    val libro = Libro("Cien años de soledad", "Gabriel García Márquez", 1967)

    // Mostramos las propiedades del libro
    println("Título: ${libro.titulo}")
    println("Autor: ${libro.autor}")
    println("Año de publicación: ${libro.añoPublicacion}")

}