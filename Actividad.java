import java.util.ArrayList;
import java.util.List;

public abstract class Actividad {
    private int id;
    private String titulo;
    private int cupoMaximo;
    private final int CUPO_MINIMO = 1;
    private List<Inscripcion> inscripciones;

    public Actividad(int id, String titulo, int cupoMaximo) {
        if (cupoMaximo < 1) {
            throw new IllegalArgumentException("El cupo maximo debe ser mayor o igual a 1");
        } else {
            this.id = id;
            this.titulo = titulo;
            this.cupoMaximo = cupoMaximo;
            this.inscripciones = new ArrayList();
        }
    }

    public Inscripcion inscribir(Estudiante estudiante) {
        if (this.inscripciones.size() >= this.cupoMaximo) {
            System.out.println("No hay cupos disponibles.");
            return null;
        } else {
            Inscripcion inscripcion = new Inscripcion(estudiante, this);
            this.inscripciones.add(inscripcion);
            return inscripcion;
        }
    }

    public void mostrarInscripciones() {
        System.out.println("Inscripciones de la actividad: " + this.titulo);
        if (this.inscripciones.isEmpty()) {
            System.out.println("No hay estudiantes inscriptos.");
        } else {
            for(Inscripcion inscripcion : this.inscripciones) {
                System.out.println(inscripcion);
            }

        }
    }

    public final void mostrarIdentificacion() {
        int var10001 = this.id;
        System.out.println("Actividad " + var10001 + " | Tipo: " + this.getTipo() + " | Titulo: " + this.titulo);
    }

    public abstract double calcularCostoMateriales();

    public abstract String getTipo();

    public int getId() {
        return this.id;
    }

    public String getTitulo() {
        return this.titulo;
    }

    public int getCupoMaximo() {
        return this.cupoMaximo;
    }

    public List<Inscripcion> getInscripciones() {
        return this.inscripciones;
    }
}
