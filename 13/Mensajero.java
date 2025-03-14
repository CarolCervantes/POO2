interface Mensajero {
    void enviarMensaje(String mensaje);
}

class EmailMensajero implements Mensajero {
    @Override
    public void enviarMensaje(String mensaje) {
        System.out.println("Enviando correo: " + mensaje);
    }
}

class SmsMensajero implements Mensajero {
    @Override
    public void enviarMensaje(String mensaje) {
        System.out.println("Enviando SMS: " + mensaje);
    }
}

class NotificacionPushMensajero implements Mensajero {
    @Override
    public void enviarMensaje(String mensaje) {
        System.out.println("Enviando notificación push: " + mensaje);
    }
}



