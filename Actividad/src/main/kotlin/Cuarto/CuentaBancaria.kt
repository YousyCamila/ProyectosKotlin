import java.util.Scanner

class CuentaBancaria {

    private val scanner = Scanner(System.`in`)
    private lateinit var titular: String
    private var saldo: Double = 0.0

    // Método para inicializar la cuenta (solicitar titular y saldo inicial)
    fun inicializarCuenta() {
        println("¡Bienvenido al sistema de Cuenta Bancaria!")
        print("Ingrese el nombre del titular: ")
        titular = scanner.nextLine()
        print("Ingrese el saldo inicial: ")
        saldo = scanner.nextDouble()
        scanner.nextLine() // Limpiar el buffer del scanner
        println("Cuenta creada exitosamente.")
        mostrarDetalles()
    }

    // Método para depositar un monto
    fun depositar() {
        print("Ingrese el monto a depositar: ")
        val monto = scanner.nextDouble()
        scanner.nextLine() // Limpiar el buffer del scanner
        saldo += monto
        println("Depósito exitoso. Saldo actual: $saldo")
    }

    // Método para retirar un monto
    fun retirar() {
        print("Ingrese el monto a retirar: ")
        val monto = scanner.nextDouble()
        scanner.nextLine() // Limpiar el buffer del scanner
        if (monto > saldo) {
            println("Error: No tienes suficiente saldo para retirar $monto")
        } else {
            saldo -= monto
            println("Retiro exitoso. Saldo restante: $saldo")
        }
    }

    // Método para mostrar los detalles de la cuenta
    fun mostrarDetalles() {
        println("\nDetalles de la cuenta:")
        println("Titular: $titular")
        println("Saldo: $saldo")
    }
}