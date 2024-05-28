import src.MaterialEstudio;
import java.util.ArrayList;
import java.util.List;


public class Curso {
    private String nombre;
    private String codigo;
    private List<MaterialEstudio> materialesEstudio;
    private List<Tarea> tareas;
    private List<Examen> examenes;
    private List<ClaseStreaming> clasesStreaming;

    public Curso() {
        this.materialesEstudio = new ArrayList<>();
        this.tareas = new ArrayList<>();
        this.examenes = new ArrayList<>();
        this.clasesStreaming = new ArrayList<>();
    }

    public boolean añadirMaterialEstudio(MaterialEstudio material) {
        if (material == null) {
            throw new IllegalArgumentException("El material de estudio no puede ser nulo");
        }
        if (materialesEstudio.contains(material)) {
            return false;
        }
        return materialesEstudio.add(material);
    }

    public boolean añadirTarea(Tarea tarea) {
        if (tarea == null) {
            throw new IllegalArgumentException("La tarea no puede ser nula");
        }
        if (tareas.contains(tarea)) {
            return false;
        }
        return tareas.add(tarea);
    }

    public boolean añadirExamen(Examen examen) {
        if (examen == null) {
            throw new IllegalArgumentException("El examen no puede ser nulo");
        }
        if (examenes.contains(examen)) {
            return false;
        }
        return examenes.add(examen);
    }

    public boolean añadirClaseStreaming(ClaseStreaming clase) {
        if (clase == null) {
            throw new IllegalArgumentException("La clase de streaming no puede ser nula");
        }
        if (clasesStreaming.contains(clase)) {
            return false;
        }
        return clasesStreaming.add(clase);
    }

}