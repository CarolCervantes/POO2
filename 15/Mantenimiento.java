interface Mantenimiento {
    void reparar();
    void limpiar();
}

interface Reparacion {
    void reparar();
}

interface Limpieza {
    void limpiar();
}

class Taller implements Reparacion, Limpieza {
    public void reparar() {
        System.out.println("Reparando equipo...");
    }
    
    public void limpiar() {
        System.out.println("Limpiando equipo...");
    }
}