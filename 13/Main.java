// Prueba de las implementaciones
public class Main {
    public static void main(String[] args) {
        // Prueba de descuentos
        Descuento descuento1 = new DescuentoPorcentaje(10);
        Descuento descuento2 = new DescuentoFijo(50);
        System.out.println("Precio con descuento porcentaje: " + descuento1.aplicarDescuento(500));
        System.out.println("Precio con descuento fijo: " + descuento2.aplicarDescuento(500));
        
        // Prueba de exportación de documentos
        DocumentoWord doc = new DocumentoWord();
        doc.exportar("Contenido del documento");
        
        // Prueba de envío de mensajes
        NotificacionPushMensajero mensajero = new NotificacionPushMensajero();
        mensajero.enviarMensaje("Hola, este es un mensaje!");
    }
}