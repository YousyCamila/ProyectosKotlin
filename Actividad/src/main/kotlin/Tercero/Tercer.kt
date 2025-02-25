package Tercero

class Tercer {
    fun definirlo() {
        println("Ingrese un numero: ")
        val numb = readln().toInt()


        if (numb >= 10) {
            println("Es mayor que 10")
        } else {
            println("Es menor que 10")
        }
    }

    fun positivo() {
        println("Ingrese un numero")
        val num = readln().toInt()

        when{
            num > 0 -> println("Positivo")
            num < 0 -> println("Negativo")
            else -> println("cero")
        }
    }

    fun multiplicar (a: Int, b: Int): Int {
        return a * b
    }
    fun  solicitud () {
    println("Ingrese el primer numero")
    val num1 = readln().toInt()
    println("Ingrese el segundo numero")
    val num2 = readln().toInt()

        val resultado = multiplicar(num1, num2)
        println("el resultado es ${resultado}")

    }

    fun convertidor() {
        println("ingrese un numero decimal")
        val numeroDecimal = readln().toFloat()

        val numeroEntero = numeroDecimal.toInt()

        println("Numero convertido a entero ${numeroEntero}")
    }


}