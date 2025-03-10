

abstract class Figura {
    public abstract void calcularArea();
}

class Circulo extends Figura {
    private double radio;

    public Circulo(double radio) {
        this.radio = radio;
    }

    @Override
    public void calcularArea() {
        System.out.println("Área del círculo: " + (Math.PI * radio * radio));
    }
}

class Rectangulo extends Figura {
    private double ancho, alto;

    public Rectangulo(double ancho, double alto) {
        this.ancho = ancho;
        this.alto = alto;
    }

    @Override
    public void calcularArea() {
        System.out.println("Área del rectángulo: " + (ancho * alto));
    }
}
// Clase de prueba para el ejercicio 1
public class Main {
    public static void main(String[] args) {
        Figura miFigura = new Circulo(5);
        miFigura.calcularArea();
        
        miFigura = new Rectangulo(4, 6);
        miFigura.calcularArea();
    }
}