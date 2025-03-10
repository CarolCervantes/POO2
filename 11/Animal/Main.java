

class Animal {
    public void hacerSonido() {
        System.out.println("El animal hace un sonido.");
    }
}

class Perro extends Animal {
    public void correr() {
        System.out.println("El perro está corriendo.");
    }
}

// Clase de prueba para el ejercicio 3
public class Main {
    public static void main(String[] args) {
        Animal miAnimal = new Perro();
        // miAnimal.correr(); // Esto causará un error de compilación
    }
}
