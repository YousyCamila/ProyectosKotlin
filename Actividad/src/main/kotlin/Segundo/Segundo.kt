package Segundo

class Segundo {

    fun numEntero() {
        println("Ingresa un numero entero ")
        val numero = readln().toInt()
        if (numero % 2 == 0) {
            println("El numero $numero es par")
        } else {
            println("El numero $numero es impar")

        }
    }
    fun opDouble() {

        val numeroDouble: Double = 10.5

        val numeroFloat: Float = 3.2f

        val resultado = numeroDouble + numeroFloat
        println("El resultado de la operacion es: $resultado")

    }

    fun producto(){

        println("Ingresa el precio del producto:")
        val precioProducto = readLine()?.toDoubleOrNull()


        println("Ingresa el porcentaje de descuento:")
        val descuentoPorcentaje = readLine()?.toDoubleOrNull()


        if (precioProducto != null && descuentoPorcentaje != null) {

            val descuento = precioProducto * (descuentoPorcentaje / 100)


            val precioFinal = precioProducto - descuento


            println("Precio original: $$precioProducto")
            println("Descuento ($descuentoPorcentaje%): $$descuento")
            println("Precio final: $$precioFinal")
        } else {
            println("Entrada inválida. Por favor, ingresa números válidos.")
        }

    }

    fun promedio (){

        println("Ingresa el primer número:")
        val numero1 = readLine()?.toDoubleOrNull()

        println("Ingresa el segundo número:")
        val numero2 = readLine()?.toDoubleOrNull()

        println("Ingresa el tercer número:")
        val numero3 = readLine()?.toDoubleOrNull()


        if (numero1 != null && numero2 != null && numero3 != null) {

            val promedio = (numero1 + numero2 + numero3) / 3


            println("El promedio de los tres números es: $promedio")
        } else {
            println("Entrada inválida. Por favor, ingresa números válidos.")
        }
    }
}

