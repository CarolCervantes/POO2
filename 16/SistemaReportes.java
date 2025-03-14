interface GeneradorReporte {
    String generar(String datos);
}

class ReportePDF implements GeneradorReporte {
    @Override
    public String generar(String datos) {
        return "Reporte PDF: " + datos;
    }
}

class ReporteExcel implements GeneradorReporte {
    @Override
    public String generar(String datos) {
        return "Reporte Excel: " + datos;
    }
}

class GestorReportes {
    private GeneradorReporte generador;

    public GestorReportes(GeneradorReporte generador) {
        this.generador = generador;
    }

    public String generarReporte(String datos) {
        return generador.generar(datos);
    }
}
