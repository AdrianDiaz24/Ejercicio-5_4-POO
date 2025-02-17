


fun main(){
    val notificaciones = listOf<Notificable>(CorreoElectronico("Adrian Diaz", "Buenas tardes \nle escribia para preguntarle como esta? \nun saludo"), MensajeTexto("Juan", "Hoy era el examen de Lenguaje?"), NotificacionPush("YouTube", "Nuevo video de IlloJuan"))

    for (notificacion in notificaciones){
        notificacion.enviarNotificacion()
    }
}