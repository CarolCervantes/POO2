
abstract class Descuento {
    abstract double aplicarDescuento(double precio);
}

class DescuentoPorcentaje extends Descuento {
    private double porcentaje;
    
    public DescuentoPorcentaje(double porcentaje) {
        this.porcentaje = porcentaje;
    }
    
    @Override
    double aplicarDescuento(double precio) {
        return precio - (precio * porcentaje / 100);
    }
}

class DescuentoFijo extends Descuento {
    private double monto;
    
    public DescuentoFijo(double monto) {
        this.monto = monto;
    }
    
    @Override
    double aplicarDescuento(double precio) {
        return precio - monto;
    }
}