interface OperacionBancaria {
    void transferir();
    void retirar();
    void pagarFactura();
}

interface Transferencia {
    void transferir();
}

interface Retiro {
    void retirar();
}

interface PagoFactura {
    void pagarFactura();
}

class Banco implements Transferencia, Retiro, PagoFactura {
    public void transferir() {
        System.out.println("Realizando transferencia...");
    }
    
    public void retirar() {
        System.out.println("Realizando retiro...");
    }
    
    public void pagarFactura() {
        System.out.println("Pagando factura...");
    }
}