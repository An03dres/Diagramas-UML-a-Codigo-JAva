import java.time.LocalDateTime;

public class Tarea {
    private String nombre;
    private String descripcion;
    private LocalDateTime fechaEntrega;

    // Constructor
    public Tarea(String nombre, String descripcion, LocalDateTime fechaEntrega) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.fechaEntrega = fechaEntrega;
    }

}