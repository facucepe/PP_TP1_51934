public class Charla extends Actividad {
    private String disertante;

    public Charla(int id, String titulo, int cupoMaximo, String disertante) {
        super(id, titulo, cupoMaximo);
        this.disertante = disertante;
    }

    public String getDisertante() {
        return this.disertante;
    }

    public double calcularCostoMateriales() {
        return (double)0.0F;
    }

    public String getTipo() {
        return "Charla";
    }
}
