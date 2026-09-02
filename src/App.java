public class App {
    public static void main(String[] args) {
        Estudiante estudiante1 = new Estudiante("50001", "Juan Perez");
        Estudiante estudiante2 = new Estudiante("50002", "Maria Gonzalez");
        Estudiante estudiante3 = new Estudiante("50003", "Lucas Rodriguez");
        Sala sala1 = new Sala(1, "Aula Magna");
        EventoUniversitario evento1 = new EventoUniversitario("EV001", "Jornada de Programacion", (double)10000.0F, false);
        evento1.asignarSala(sala1);
        evento1.crearActividad(1, "Programacion Orientada a Objetos", 30, "Charla");
        evento1.crearActividad(2, "Taller de Java", 30, "Taller");
        ((Actividad)evento1.getActividades().get(0)).inscribir(estudiante1);
        ((Actividad)evento1.getActividades().get(0)).inscribir(estudiante2);
        ((Actividad)evento1.getActividades().get(1)).inscribir(estudiante2);
        ((Actividad)evento1.getActividades().get(1)).inscribir(estudiante3);
        evento1.mostrarDatos();
        System.out.println();
        System.out.println("==========================================");
        System.out.println("       DEMOSTRACION DE POLIMORFISMO");
        System.out.println("==========================================");

        for(Actividad actividad : evento1.getActividades()) {
            actividad.mostrarIdentificacion();
            System.out.println("Tipo: " + actividad.getTipo());
            System.out.println("Costo de materiales: $" + actividad.calcularCostoMateriales());
            System.out.println();
        }

        System.out.println("==========================================");
        System.out.println("TOTAL DE EVENTOS CREADOS: " + EventoUniversitario.getCantidadEventos());
        System.out.println("==========================================");
    }
}
