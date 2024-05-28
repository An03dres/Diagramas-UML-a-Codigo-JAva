import java.util.List;

public class Profesor extends Usuario {
    private List<Curso> cursosImpartidos;
    private List<Tarea> tareasAsignadas;
    private List<Calificacion> calificacionesPublicadas;
    private List<PublicacionForo> foroPublicaciones;

    public boolean asignarTarea(Tarea tarea, List<Estudiante> estudiantes) {
        // Implementación aquí
        return false;
    }

    public boolean publicarCalificacion(Calificacion calificacion, List<Estudiante> estudiantes) {
        // Implementación aquí
        return false;
    }

    public boolean publicarEnForo(PublicacionForo publicacion) {
        // Implementación aquí
        return false;
    }
}