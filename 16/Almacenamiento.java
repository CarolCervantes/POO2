import java.util.HashMap;
import java.util.Map;

interface Almacenamiento {
    void guardarArchivo(String nombre, String contenido);
    String recuperarArchivo(String nombre);
}

class AlmacenamientoLocal implements Almacenamiento {
    private Map<String, String> almacenamiento = new HashMap<>();
    
    @Override
    public void guardarArchivo(String nombre, String contenido) {
        almacenamiento.put(nombre, contenido);
    }
    
    @Override
    public String recuperarArchivo(String nombre) {
        return almacenamiento.get(nombre);
    }
}

class AlmacenamientoNube implements Almacenamiento {
    private Map<String, String> almacenamiento = new HashMap<>();
    
    @Override
    public void guardarArchivo(String nombre, String contenido) {
        almacenamiento.put(nombre, contenido);
    }
    
    @Override
    public String recuperarArchivo(String nombre) {
        return almacenamiento.get(nombre);
    }
}

class GestorArchivos {
    private Almacenamiento almacenamiento;

    public GestorArchivos(Almacenamiento almacenamiento) {
        this.almacenamiento = almacenamiento;
    }

    public void guardar(String nombre, String contenido) {
        almacenamiento.guardarArchivo(nombre, contenido);
    }

    public String recuperar(String nombre) {
        return almacenamiento.recuperarArchivo(nombre);
    }
}