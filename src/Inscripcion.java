import java.time.LocalDate;

public class Inscripcion {
    private LocalDate fecha;
    private String estado;
    private Estudiante estudiante;
    private Actividad actividad;

    public Inscripcion(Estudiante estudiante, Actividad actividad) {
        this.estudiante = estudiante;
        this.actividad = actividad;
        this.fecha = LocalDate.now();
        this.estado = "Confirmada";
    }

    public LocalDate getFecha() {
        return this.fecha;
    }

    public String getEstado() {
        return this.estado;
    }

    public Estudiante getEstudiante() {
        return this.estudiante;
    }

    public Actividad getActividad() {
        return this.actividad;
    }

    public String toString() {
        String var10000 = String.valueOf(this.fecha);
        return "Inscripcion {fecha=" + var10000 + ", estado='" + this.estado + "', estudiante=" + this.estudiante.getNombre() + ", actividad=" + this.actividad.getTitulo() + "}";
    }
}
