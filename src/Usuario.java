import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Usuario
{
    private int id;
    private static int contador = 0;
    private String alias;

    private List<Publicacion> publicaciones;


    public Usuario(String alias) {
        this.id = contador++;
        this.alias = alias;
        this.publicaciones = new ArrayList<>();
    }


    //-------------------------------GETTERS & SETTERS------------------------------------------------------------------
    public List<Publicacion> getPublicaciones() {
        return publicaciones;
    }
    public void setPublicaciones(List<Publicacion> publicaciones) {
        this.publicaciones = publicaciones;
    }
    public String getAlias() {
        return alias;
    }
    public void setAlias(String alias) {
        this.alias = alias;
    }
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
        Usuario.contador = contador;
    }





    //-------------------------------------MÉTODOS----------------------------------------------------------------------

    public void addPublicacion(Publicacion publicacion)
    {

            this.publicaciones.add(publicacion);


    }






    @Override
    public String toString() {
        return "ID del usuario: "+ this.id+"\n"+"Alias del usuario: "+this.alias;
    }
}
