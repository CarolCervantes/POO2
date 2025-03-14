interface Vehiculo {
    void conducir();
    void cargarMercancia();
}

interface Conduccion {
    void conducir();
}

interface TransporteMercancia {
    void cargarMercancia();
}

class Camion implements Conduccion, TransporteMercancia {
    public void conducir() {
        System.out.println("Conduciendo camión...");
    }
    
    public void cargarMercancia() {
        System.out.println("Cargando mercancía...");
    }
}
