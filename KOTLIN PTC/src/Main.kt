import Models.Administrador.*
import Models.Caso.Caso
import Models.Cliente.Cliente
import Models.Detective.Detectives
import Models.Detective.TipoEvidencia
import Models.Evidencia.Evidencia
import Models.Historial.Historial
import Models.Questions.Auth
import Models.RegistroCaso.RegistroCaso

fun main() {
    val admin = Administrador()

    println("Nombre: ${admin.nombre}")
    println("Identificación: ${admin.identificacion}")
    println("Activo: ${admin.activo}")
    println("Dirección: ${admin.direccion}")
    println("Teléfono: ${admin.telefono}")
    println("Email: ${admin.email}")
    println("\n")


    val contrato = Contrato()

    println("Descripción del Servicio: ${contrato.descripcionServicio}")
    println("Cliente: ${contrato.nombreCliente}")
    println("Detective Asignado: ${contrato.nombreDetective}")
    println("Tarifa: ${contrato.tarifa}")
    println("Historial: ${contrato.historial.joinToString()}")
    println("\n")


    val rol = Rol()

    println("Nombre del Rol: ${rol.nombre}")
    println("Estado: ${if (rol.estado) "Activo" else "Inactivo"}")
    println("Usuarios asignados: ${rol.usuarios.joinToString()}")
    println("\n")

    val usuario = Usuario()

    println("Username: ${usuario.username}")
    println("Email: ${usuario.email}")
    println("Contraseña: ${usuario.password}")
    println("Rol: ${usuario.role}")
    println("\n")


    val cliente = Cliente()

    println("Información del Cliente")
    println("Nombre: ${cliente.nombre}")
    println("Identificación: ${cliente.identificacion}")
    println("Dirección: ${cliente.direccion}")
    println("Activo: ${cliente.activo}")

    println("\nCasos")
    println("Caso 1: ${cliente.casoNombre1}, ID: ${cliente.casoId1}, Cantidad: ${cliente.casoCantidad1}")
    println("Caso 2: ${cliente.casoNombre2}, ID: ${cliente.casoId2}, Cantidad: ${cliente.casoCantidad2}")

    println("\nContratos")
    println("Contrato 1: ${cliente.contratoDescripcion1}, Estado: ${cliente.contratoEstado1}, ID: ${cliente.contratoId1}")
    println("Contrato 2: ${cliente.contratoDescripcion2}, Estado: ${cliente.contratoEstado2}, ID: ${cliente.contratoId2}")

    println("\nFacturas")
    println("Factura 1: ID: ${cliente.facturaId1}, Total: ${cliente.facturaTotal1}, Estado: ${cliente.facturaEstado1}")
    println("Factura 2: ID: ${cliente.facturaId2}, Total: ${cliente.facturaTotal2}, Estado: ${cliente.facturaEstado2}")

    println("\nHistoriales")
    println("Historial 1: ID: ${cliente.historialId1}, Fecha: ${cliente.historialFecha1}, Detalle: ${cliente.historialDetalle1}")
    println("Historial 2: ID: ${cliente.historialId2}, Fecha: ${cliente.historialFecha2}, Detalle: ${cliente.historialDetalle2}")

    println("\nRegistro de Caso")
    println("ID: ${cliente.registroCasoId}, Descripción: ${cliente.registroCasoDescripcion}, Estado: ${cliente.registroCasoEstado}")

    println("\n")

    val formulario = Formulario()

    println("Nombre: ${formulario.nombre}")
    println("Número de Celular: ${formulario.numeroCelular}")
    println("Descripción: ${formulario.descripcion}")
    println("Fecha de Envío: ${formulario.fechaEnvio}")
    println("ID Cliente: ${formulario.idCliente}")
    println("Correo Cliente: ${formulario.correoCliente}")
    println("Estado: ${formulario.estado}")
    println("Respuesta: ${formulario.respuesta}")

    println("\n")


    val historial = Historial()

    println("Descripción: ${historial.descripcion}")
    println("Fecha de Inicio: ${historial.fechaInicio}")
    println("Fecha Final: ${historial.fechaFinal}")
    println("ID Cliente: ${historial.idCliente}")
    println("ID Detective: ${historial.idDetective}")
    println("\n")

    val caso = Caso()

    println("Nombre del Caso: ${caso.nombreCaso}")
    println("ID Cliente: ${caso.idCliente}")
    println("ID Detective: ${caso.idDetective}")

    println("Evidencias Asociadas:")
    println("- ${caso.evidenciaId1}")
    println("- ${caso.evidenciaId2}")

    println("Registros de Caso:")
    println("- ${caso.registroCasoId1}")
    println("- ${caso.registroCasoId2}")

    println("Contratos Asociados:")
    println("- ${caso.contratoId1}")
    println("- ${caso.contratoId2}")

    println("Activo: ${caso.activo}")

    println("\n")

    val detective = Detectives()

    println("Nombre: ${detective.nombre}")
    println("Identificación: ${detective.tipoIdentificacion} - ${detective.numeroIdentificacion}")
    println("Dirección: ${detective.direccion}")
    println("Teléfono: ${detective.telefonoMovil}")
    println("Email: ${detective.email}")
    println("Sexo Biológico: ${detective.sexoBiologico}")

    println("\nEspecialidades:")
    println("- ${detective.especialidad1}")
    println("- ${detective.especialidad2}")

    println("\nCasos Actuales:")
    println("- ${detective.casoNombre1} (Estado: ${detective.casoEstado1})")
    println("- ${detective.casoNombre2} (Estado: ${detective.casoEstado2})")

    println("\nHistorial de Casos:")
    println("- ${detective.historialDetalle1} (${detective.historialFecha1})")
    println("- ${detective.historialDetalle2} (${detective.historialFecha2})")

    println("\nRegistros de Caso:")
    println("- ${detective.registroDescripcion1} (Estado: ${detective.registroEstado1})")
    println("- ${detective.registroDescripcion2} (Estado: ${detective.registroEstado2})")

    println("\nContratos Asociados:")
    println("- ${detective.contratoDescripcion1} (Activo: ${detective.contratoEstado1})")
    println("- ${detective.contratoDescripcion2} (Activo: ${detective.contratoEstado2})")

    println("\nActivo: ${detective.activo}")

    println("\n")

    val evidencia = Evidencia()

    println("Fecha de Evidencia: ${evidencia.fechaEvidencia}")
    println("Descripción: ${evidencia.descripcion}")
    println("ID del Caso: ${evidencia.idCaso}")
    println("Tipo de Evidencia: ${evidencia.tipoEvidencia}")

    println("\nDetalles del Archivo:")
    println("Nombre: ${evidencia.archivoNombre}")
    println("Tipo: ${evidencia.archivoTipo}")
    println("Ruta: ${evidencia.archivoRuta}")

    println("\nTimestamps:")
    println("Creado En: ${evidencia.creadoEn}")
    println("Actualizado En: ${evidencia.actualizadoEn}")

    println("\n")

    val registro = RegistroCaso()

    println("=== Detalles del Registro de Caso ===")
    println("Descripción: ${registro.descripcion}")
    println("Fecha de Inicio: ${registro.fechaInicio}")
    println("Fecha de Finalización: ${registro.fechaFinalizacion}")
    println("Estado del Registro: ${registro.estadoRegistro}")
    println("Seguimiento (%): ${registro.seguimientoPorcentaje}")
    println("Caso Asociado: ${registro.nombreCaso} (ID: ${registro.idCaso})")
    println("Cliente: ${registro.nombreCliente} (ID: ${registro.idCliente})")
    println("Detective: ${registro.nombreDetective} (ID: ${registro.idDetective})")
    println("Activo: ${registro.activo}")

    println("\n")

    val tipoEvidencia = TipoEvidencia()

    println("Tipo de Evidencia")
    println("tipoDocumento: ${tipoEvidencia.tipoDocumento}")
    println("tipoFotografia: ${tipoEvidencia.tipoFotografia}")
    println("Tipo Video : ${tipoEvidencia.tipoVideo}")
    println("Tipo Audio: ${tipoEvidencia.tipoAudio}")
    println("Archivos Digitales: ${tipoEvidencia.archivosDigitales}")

    println("\n")

    val auth = Auth(usuario)

    println("Sistema de autentificacion")

    print("Usuario")
    val inputUserName = readLine() ?: ""

    print("Contraseña")
    val inputPassword = readLine() ?: ""

    print("Rol")
    val inputRole = readLine() ?: ""

    val esAutentificado= auth.autentificar(inputUserName,inputPassword,inputRole)

    if (esAutentificado) {
        println(" ¡Bienvenido, $inputUserName! Tienes acceso al sistema.")
    } else {
        println(" Error de autenticación. Intenta de nuevo.")
    }

}


