package Models.Cliente

class Cliente {

    val nombre = "Laura Martínez"
    val identificacion = "98765432B"
    val direccion = "Avenida Principal 456"
    val activo = true

    // Datos simples sin listOf anidados
    val casoNombre1 = "Caso de Investigación A"
    val casoId1 = "6531d4e7c9b234a1d2f3c567"
    val casoCantidad1 = 2

    val casoNombre2 = "Seguimiento B"
    val casoId2 = "6531d4e7c9b234a1d2f3c568"
    val casoCantidad2 = 1

    val contratoDescripcion1 = "Servicio de Seguridad"
    val contratoEstado1 = true
    val contratoId1 = "6531d4e7c9b234a1d2f3c569"

    val contratoDescripcion2 = "Investigación Privada"
    val contratoEstado2 = false
    val contratoId2 = "6531d4e7c9b234a1d2f3c570"

    val facturaId1 = "6531d4e7c9b234a1d2f3c571"
    val facturaTotal1 = 1500.00
    val facturaEstado1 = "Pagado"

    val facturaId2 = "6531d4e7c9b234a1d2f3c572"
    val facturaTotal2 = 800.00
    val facturaEstado2 = "Pendiente"

    val historialId1 = "6531d4e7c9b234a1d2f3c573"
    val historialFecha1 = "2023-10-01"
    val historialDetalle1 = "Revisión inicial"

    val historialId2 = "6531d4e7c9b234a1d2f3c574"
    val historialFecha2 = "2023-10-15"
    val historialDetalle2 = "Actualización de estado"

    val registroCasoId = "6531d4e7c9b234a1d2f3c575"
    val registroCasoDescripcion = "Registro de seguimiento"
    val registroCasoEstado = "En progreso"
}
