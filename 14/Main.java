
public class Main {    public static <Figura> void main(String[] args) {
        // Prueba de figuras
        Figura circulo = new Circulo(5);
        Figura rectangulo = new Rectangulo(4, 6);
        System.out.println("Área del círculo: " + circulo.calcularArea());
        System.out.println("Área del rectángulo: " + rectangulo.calcularArea());
        
        // Prueba de cuentas bancarias
        CuentaBancaria cuenta = new CuentaAhorros(0.05);
        cuenta.depositar(1000);
        ((CuentaAhorros) cuenta).aplicarInteres();
        System.out.println("Saldo en cuenta de ahorros: " + cuenta.getSaldo());
        
        // Prueba de transporte
        Transporte bici = new Bicicleta();
        Transporte coche = new Coche();
        bici.mover();
        coche.mover();
    }
}
