class Usuario {
    private String nombre;
    private String contrasena;
    
    public Usuario(String nombre, String contrasena) {
        this.nombre = nombre;
        this.contrasena = contrasena;
    }
    
    public String getNombre() {
        return nombre;
    }
    
    public String getContrasena() {
        return contrasena;
    }
}

// Clase AutenticacionService (responsable de la autenticación)
class AutenticacionService {
    public boolean autenticar(Usuario usuario, String contrasena) {
        return usuario.getContrasena().equals(contrasena);
    }
}

// Clase ValidacionService (responsable de la validación de datos)
class ValidacionService {
    public boolean validarUsuario(Usuario usuario) {
        return usuario.getNombre() != null && !usuario.getNombre().isEmpty();
    }
}   

