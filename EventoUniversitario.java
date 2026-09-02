import java.io.PrintStream;
import java.util.ArrayList;
import java.util.List;

public class EventoUniversitario {
    private final String id;
    private String titulo;
    private double costoBase;
    private boolean gratuito;
    private static int cantidadEventos = 0;
    private Sala sala;
    private List<Actividad> actividades;

    public EventoUniversitario(String id, String titulo, double costoBase, boolean gratuito) {
        this.id = id;
        this.titulo = titulo;
        this.costoBase = costoBase;
        this.gratuito = gratuito;
        this.actividades = new ArrayList();
        ++cantidadEventos;
    }

    public EventoUniversitario(EventoUniversitario otro) {
        this.id = otro.id;
        this.titulo = otro.titulo;
        this.costoBase = otro.costoBase;
        this.gratuito = otro.gratuito;
        this.sala = otro.sala;
        this.actividades = new ArrayList(otro.actividades);
        ++cantidadEventos;
    }

    public void asignarSala(Sala sala) {
        this.sala = sala;
    }

    public void crearActividad(int id, String titulo, int cupo, String tipo) {
        Actividad actividad;
        if (tipo.equalsIgnoreCase("Charla")) {
            actividad = new Charla(id, titulo, cupo, "Disertante no especificado");
        } else {
            if (!tipo.equalsIgnoreCase("Taller")) {
                throw new IllegalArgumentException("Tipo de actividad invalido: " + tipo);
            }

            actividad = new Taller(id, titulo, cupo, true);
        }

        this.actividades.add(actividad);
    }

    public double calcularCostoEstimado() {
        if (this.gratuito) {
            return (double)0.0F;
        } else {
            double costoTotal = this.costoBase;

            for(Actividad actividad : this.actividades) {
                costoTotal += actividad.calcularCostoMateriales();
            }

            return costoTotal * 1.21;
        }
    }

    public void mostrarDatos() {
        System.out.println();
        System.out.println("==========================================");
        System.out.println("       EVENTO UNIVERSITARIO");
        System.out.println("==========================================");
        System.out.println("ID: " + this.id);
        System.out.println("Titulo: " + this.titulo);
        System.out.println("Costo base: $" + this.costoBase);
        System.out.println("Gratuito: " + this.gratuito);
        if (this.sala != null) {
            System.out.println("Sala: " + String.valueOf(this.sala));
        } else {
            System.out.println("Sala: Sin asignar");
        }

        System.out.println("Cantidad de actividades: " + this.actividades.size());
        System.out.println();
        System.out.println("----- ACTIVIDADES -----");

        for(Actividad actividad : this.actividades) {
            actividad.mostrarIdentificacion();
            System.out.println("Costo de materiales: $" + actividad.calcularCostoMateriales());
            if (actividad instanceof Charla charla) {
                System.out.println("Disertante: " + charla.getDisertante());
            }

            if (actividad instanceof Taller taller) {
                System.out.println("Requiere notebook: " + taller.isRequiereNotebook());
            }

            actividad.mostrarInscripciones();
            System.out.println();
        }

        PrintStream var10000 = System.out;
        Object[] var10002 = new Object[]{this.calcularCostoEstimado()};
        var10000.println("Costo estimado del evento: $" + String.format("%.2f", var10002));
        System.out.println("==========================================");
    }

    public String getId() {
        return this.id;
    }

    public String getTitulo() {
        return this.titulo;
    }

    public double getCostoBase() {
        return this.costoBase;
    }

    public boolean isGratuito() {
        return this.gratuito;
    }

    public Sala getSala() {
        return this.sala;
    }

    public List<Actividad> getActividades() {
        return this.actividades;
    }

    public static int getCantidadEventos() {
        return cantidadEventos;
    }
}
