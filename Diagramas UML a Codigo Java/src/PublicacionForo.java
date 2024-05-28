import java.time.LocalDateTime;

public class PublicacionForo {
    private String titulo;
    private String contenido;
    private LocalDateTime fechaPublicacion;

    // Constructor
    public PublicacionForo(String titulo, String contenido, LocalDateTime fechaPublicacion) {
        this.titulo = titulo;
        this.contenido = contenido;
        this.fechaPublicacion = fechaPublicacion;
    }

}