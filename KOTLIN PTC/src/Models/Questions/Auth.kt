package Models.Questions

import Models.Administrador.Usuario
import java.io.DataInput

class Auth (val usuario: Usuario ) {

    fun autentificar (inputUsername: String, inputPassword:String, inputRole:String) : Boolean{

        if (inputUsername != usuario.username) {
            println("Usuario Incorrecto VETEEEE")
            return false
        }

        if (inputPassword != usuario.password){
            println("FUA NO LE SABE")
            return false
        }
        if (inputRole != usuario.role){
            println("Rol incorrecto")
            return false
        }
        println("Registro Exitoso, tiene  acceeso al caso, evidencias, registros del caso y tipo de evidencias")
        return true


    }
}