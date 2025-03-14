class CuentaBancaria {
    protected double saldo;
    
    public void depositar(double monto) {
        saldo += monto;
    }
    
    public void retirar(double monto) {
        saldo -= monto;
    }
    
    public double getSaldo() {
        return saldo;
    }
}

class CuentaAhorros extends CuentaBancaria {
    private double tasaInteres;
    
    public CuentaAhorros(double tasaInteres) {
        this.tasaInteres = tasaInteres;
    }
    
    public void aplicarInteres() {
        saldo += saldo * tasaInteres;
    }
}
