import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Publicacion
{
    private int id;
    private static int contador = 0;

    private Usuario usuario;

    private String texto;

    private LocalDate localDate;

    private int likes;

    private List<String> comentarios;

    //----------------para la foto, extra------------|

    private String archivo;
    private String titulo;
    private boolean esFoto;

    //----------------------CONSTRUCTORES-------------------------------------------------------------------------------

    public Publicacion(Usuario usuario, String texto)
    {
        this.usuario = usuario;
        this.id = contador++;
        this.localDate = LocalDate.now();
        this.likes = 0;
        this.comentarios = new ArrayList<>();
        this.texto = texto;
        esFoto = false;
    }

    public Publicacion(Usuario usu, String archivo, String titulo)
    {
        this.usuario = usu ;
        this.id = contador++;
        this.localDate = LocalDate.now();
        this.likes = 0;
        this.archivo = archivo;
        this.titulo = titulo;
        this.esFoto = true;
        this.comentarios = new ArrayList<>();
    }





    //--------------------------GETTERS & SETTERS-----------------------------------------------------------------------
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public static int getContador() {
        return contador;
    }
    public static void setContador(int contador) {
        Publicacion.contador = contador;
    }
    public Usuario getUsuario() {
        return usuario;
    }
    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }
    public String getTexto() {
        return texto;
    }
    public void setTexto(String texto) {
        this.texto = texto;
    }
    public LocalDate getLocalDate() {
        return localDate;
    }
    public void setLocalDate(LocalDate localDate) {
        this.localDate = localDate;
    }
    public int getLikes() {
        return likes;
    }
    public void setLikes(int likes) {
        this.likes = likes;
    }
    public List<String> getComentarios() {
        return comentarios;
    }
    public void setComentarios(List<String> comentarios) {
        this.comentarios = comentarios;
    }
    public String getArchivo() {
        return archivo;
    }
    public void setArchivo(String archivo) {
        this.archivo = archivo;
    }
    public String getTitulo() {
        return titulo;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    public boolean isEsFoto() {
        return esFoto;
    }
    public void setEsFoto(boolean esFoto) {
        this.esFoto = esFoto;
    }


    //----------------------MÉTODOS-------------------------------------------------------------------------------------

    public void addComentario(String comentario)
    {
        this.comentarios.add(comentario);
    }









    @Override
    public String toString() {
        if (esFoto)
        {
            return this.usuario +"\n titulo: "+this.titulo+"\n"+this.localDate+"\n"+"\n\n";

        }
        else
            return this.usuario.getAlias() +"\n"+this.texto+"\n"+this.localDate+"\n"+"\n\n";
    }
}
