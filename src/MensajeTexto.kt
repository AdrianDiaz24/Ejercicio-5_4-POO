class MensajeTexto(val mandatario: String, val mensaje: String): Notificable {
    override fun enviarNotificacion() {
        println("Mensaje recibido de $mandatario \n$mensaje")
    }
}