

class CorreoElectronico(val correoRemitente: String, val mensaje: String): Notificable {
    override fun enviarNotificacion() {
        println("Recibiste un nuevo correo electroico de $correoRemitente \n$mensaje")
    }
}