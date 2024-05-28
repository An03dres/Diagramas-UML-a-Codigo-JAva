import src.MaterialEstudio;

public class Main {
    public static void main(String[] args) {
        // Crear un nuevo usuario
        Usuario usuario = new Usuario();
        usuario.crearCuenta();
        System.out.println("Cuenta de usuario creada.");

        // Crear un nuevo estudiante
        Estudiante estudiante = new Estudiante();
        estudiante.crearCuenta();
        System.out.println("Cuenta de estudiante creada.");

        // Crear un nuevo profesor
        Profesor profesor = new Profesor();
        profesor.crearCuenta();
        System.out.println("Cuenta de profesor creada.");

        // Crear un nuevo curso
        Curso curso = new Curso();
        MaterialEstudio materialEstudio = new MaterialEstudio();
        if (curso.añadirMaterialEstudio(materialEstudio)) {
            System.out.println("Material de estudio añadido al curso.");
        } else {
            System.out.println("No se pudo añadir el material de estudio al curso.");
        }

        // Crear un nuevo foro
        Foro foro = new Foro();
        Comentario comentario = new Comentario();
        if (foro.añadirComentario(comentario)) {
            System.out.println("Comentario añadido al foro.");
        } else {
            System.out.println("No se pudo añadir el comentario al foro.");
        }
    }
}
