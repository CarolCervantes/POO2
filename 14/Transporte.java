abstract class Transporte {
    abstract void mover();
}

class Bicicleta extends Transporte {
    @Override
    void mover() {
        System.out.println("Pedaleando la bicicleta");
    }
}

class Coche extends Transporte {
    @Override
    void mover() {
        System.out.println("Conduciendo el coche");
    }
}