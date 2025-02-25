class PropiedadPersonalizada {

    // Propiedad privada
    private var valor: Int = 0

    // Getter personalizado
    fun obtenerValor(): Int {
        println("Obteniendo el valor actual: $valor")
        return valor
    }

    // Setter personalizado
    fun establecerValor(nuevoValor: Int) {
        if (nuevoValor >= 0) { // Validación: el valor no puede ser negativo
            valor = nuevoValor
            println("Valor establecido correctamente: $valor")
        } else {
            println("Error: No se puede establecer un valor negativo.")
        }
    }
}