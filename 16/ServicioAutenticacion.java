
interface ServicioAutenticacion {
    boolean autenticar(String usuario, String contraseña);
}

class AutenticacionLocal implements ServicioAutenticacion {
    @Override
    public boolean autenticar(String usuario, String contraseña) {
        return "usuario123".equals(usuario) && "contraseña123".equals(contraseña);
    }
}

class AutenticacionOAuth implements ServicioAutenticacion {
    @Override
    public boolean autenticar(String usuario, String contraseña) {
        return usuario.startsWith("oauth_"); // Simulación de autenticación OAuth
    }
}

class GestorAutenticacion {
    private ServicioAutenticacion servicio;

    public GestorAutenticacion(ServicioAutenticacion servicio) {
        this.servicio = servicio;
    }

    public boolean iniciarSesion(String usuario, String contraseña) {
        return servicio.autenticar(usuario, contraseña);
    }
}