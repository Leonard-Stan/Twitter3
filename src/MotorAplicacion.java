import java.util.ArrayList;
import java.util.List;

public class MotorAplicacion
{
   private List<Usuario> usuarios;
   private List<Publicacion> publicacions;


   public MotorAplicacion()
   {
      this.usuarios = new ArrayList<>();
      this.publicacions = new ArrayList<>();
   }






   public List<Usuario> getUsuarios() {
      return usuarios;
   }

   public void setUsuarios(List<Usuario> usuarios) {
      this.usuarios = usuarios;
   }

   public List<Publicacion> getPublicacions() {
      return publicacions;
   }

   public void setPublicacions(List<Publicacion> publicacions) {
      this.publicacions = publicacions;



   }

   //-------------------------------MÉTODOS-----------------------------------------------------------------------------

   public void addPublicacion(Publicacion publicacion)
   {
      this.publicacions.add(publicacion);
   }

   public void addUser(Usuario usuario)
   {
      this.usuarios.add(usuario);
   }

   public void mostrarPublicaciones()
   {
      if (publicacions.isEmpty())
      {
         System.out.println("No hay publicaciones recientes");
      }
      else
      {
         for (Publicacion p:publicacions)
         {
            System.out.println(p);
         }
      }


   }



   @Override
   public String toString() {
      return " "+publicacions+"\n";
   }
}
