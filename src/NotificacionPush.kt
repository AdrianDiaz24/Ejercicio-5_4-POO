class NotificacionPush(val aplicacion: String, val mensaje: String): Notificable {
    override fun enviarNotificacion() {
        println("$aplicacion \n$mensaje")
    }
}