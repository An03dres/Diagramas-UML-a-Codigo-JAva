import java.util.List;

public class Estudiante extends Usuario {
    private List<Curso> cursosInscritos;
    private List<Tarea> tareasEnviadas;
    private List<Calificacion> calificacionesRecibidas;
    private List<PublicacionForo> foroPublicaciones;

    public boolean enviarTarea(Tarea tarea) {
        if (tarea == null) {
            throw new IllegalArgumentException("La tarea no puede ser nula");
        }
        return tareasEnviadas.add(tarea);
    }

    public boolean recibirCalificacion(Calificacion calificacion) {
        if (calificacion == null) {
            throw new IllegalArgumentException("La calificación no puede ser nula");
        }
        return calificacionesRecibidas.add(calificacion);
    }

    public boolean publicarEnForo(PublicacionForo publicacion) {
        if (publicacion == null) {
            throw new IllegalArgumentException("La publicación no puede ser nula");
        }
        return foroPublicaciones.add(publicacion);
    }
}