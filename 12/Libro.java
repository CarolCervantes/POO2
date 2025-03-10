// Ejercicio 1: Refactorización de una Clase Libro

// Clase Libro (solo datos del libro)
class Libro {
    private String titulo;
    private String autor;

    public Libro(String titulo, String autor) {
        this.titulo = titulo;
        this.autor = autor;
    }

    public String getTitulo() {
        return titulo;
    }
    
    public String getAutor() {
        return autor;
    }
}

// Clase ReporteLibro (responsable de la generación de reportes)
class ReporteLibro {
    public void generarReporte(Libro libro) {
        System.out.println("Reporte del libro: " + libro.getTitulo() + " por " + libro.getAutor());
    }
}

// Clase PersistenciaLibro (responsable de la persistencia)
class PersistenciaLibro {
    public void guardarEnBaseDeDatos(Libro libro) {
        System.out.println("Guardando libro en la base de datos: " + libro.getTitulo());
    }
}
