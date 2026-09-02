public class Taller extends Actividad {
    private boolean requiereNotebook;

    public Taller(int id, String titulo, int cupoMaximo, boolean requiereNotebook) {
        super(id, titulo, cupoMaximo);
        this.requiereNotebook = requiereNotebook;
    }

    public boolean isRequiereNotebook() {
        return this.requiereNotebook;
    }

    public double calcularCostoMateriales() {
        return this.requiereNotebook ? (double)5000.0F : (double)2000.0F;
    }

    public String getTipo() {
        return "Taller";
    }
}
