

class Persona {
    public void presentarse() {
        System.out.println("Soy una persona.");
    }
}

class Estudiante extends Persona {
    @Override
    public void presentarse() {
        System.out.println("Soy un estudiante.");
    }
}

class Profesor extends Persona {
    @Override
    public void presentarse() {
        System.out.println("Soy un profesor.");
    }
}

// Clase de prueba para el ejercicio 2
public class Main {
    public static void main(String[] args) {
        Persona persona1 = new Estudiante();
        persona1.presentarse();
        
        Persona persona2 = new Profesor();
        persona2.presentarse();
    }
}
