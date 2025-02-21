package Models.Administrador
import java.math.BigDecimal
import java.util.*

class Contrato {

    val descripcionServicio = "Servicio de vigilancia privada"
    val fechaInicio = Date(124, 1, 1)
    val fechaCierre = Date(124, 6, 1)
    val clausulas = "Confidencialidad total y reporte semanal."
    val tarifa = 25000.00
    val estado = true

    val idCliente = "cliente001"
    val nombreCliente = "María González"

    val idDetective = "detective001"
    val nombreDetective = "Juan Pérez"

    val historial = listOf(
        "Cambio de detective el 15/03/2024",
        "Ampliación del contrato el 10/05/2024"
    )
}
