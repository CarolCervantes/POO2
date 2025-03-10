

class Vehiculo {
    public void mover() {
        System.out.println("El vehículo se está moviendo.");
    }
}

class Coche extends Vehiculo {
    @Override
    public void mover() {
        System.out.println("El coche se está moviendo.");
    }
}

class Bicicleta extends Vehiculo {
    @Override
    public void mover() {
        System.out.println("La bicicleta se está moviendo.");
    }
}

// Clase de prueba para el ejercicio 4
public class Main {
    public static void main(String[] args) {
        Vehiculo miVehiculo = new Coche();
        miVehiculo.mover();
        
        miVehiculo = new Bicicleta();
        miVehiculo.mover();
    }
}
