import java.util.Date;
import java.util.List;

public class Foro {
    private Usuario autor;
    private String contenido;
    private Date fechaPublicacion;
    private List<Comentario> comentarios;

    public boolean añadirComentario(Comentario comentario) {
        if (comentario == null) {
            throw new IllegalArgumentException("El comentario no puede ser nulo");
        }
        return false;
    }
}