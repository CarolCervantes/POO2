interface Documento {
    void exportar(String contenido);
}

class DocumentoPDF implements Documento {
    @Override
    public void exportar(String contenido) {
        System.out.println("Exportando a PDF: " + contenido);
    }
}

class DocumentoWord implements Documento {
    @Override
    public void exportar(String contenido) {
        System.out.println("Exportando a Word: " + contenido);
    }
}

class DocumentoExcel implements Documento {
    @Override
    public void exportar(String contenido) {
        System.out.println("Exportando a Excel: " + contenido);
    }
}
