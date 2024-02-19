import java.sql.SQLOutput;
import java.util.Objects;
import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        MotorAplicacion motorAplicacion = new MotorAplicacion();
        boolean exists = false;
        String answer2="";
        //---------------METER ALGUNOS USUARIOS DE PRUEBA---------------------------------------------------------------
        Usuario usu1 = new Usuario("Primero");
        Usuario usu2 = new Usuario("Segundo");
        Usuario usu3 = new Usuario("Tercero");

        motorAplicacion.addUser(usu1);
        motorAplicacion.addUser(usu2);
        motorAplicacion.addUser(usu3);

        //----------------------------------LOGIN/REGISTER--------------------------------------------------------------

        System.out.println("Bienvenido a twitter 3.0, ¿desea iniciar sesión?: y/n");
        String answer = sc.nextLine();
        String usuActual ="";
        while (answer != "exit")
        {
            if (Objects.equals(answer, "y"))
            {

                answer2="";
                //Pedimos al usuario un "alias" para iniciar sesión o registrarse.
                System.out.println("Introduzca un Usuario");
                usuActual = sc.nextLine();

                //comprobamos que el usuario existe, si existe, nos logeamos, sinó, se crea el usuario.
                for (Usuario p : motorAplicacion.getUsuarios()) {
                    if (Objects.equals(usuActual, p.getAlias())) {
                        System.out.println(p.getAlias() + " se a logeado correctamente\n");
                        exists = true;
                    }

                }

                //si no existe se crea el usuario.
                if (!exists) {

                    Usuario usuario = new Usuario(usuActual);
                    motorAplicacion.addUser(usuario);
                    System.out.println(usuActual + " se ha creado correctamente");

                }

                while (!Objects.equals(answer2, "0"))
                {
                    System.out.println("¿Desea hacer una Foto(1) o un tweet(2) | ir a la página principal (3) | ver perfil (4)");
                    answer2 = sc.nextLine();


                    if (Objects.equals(answer2, "1"))
                    {
                        for (Usuario t : motorAplicacion.getUsuarios())
                        {
                            if (Objects.equals(t.getAlias(), usuActual)) {

                                Publicacion publicacion = new Publicacion(t, sc.nextLine(), sc.nextLine());
                                addPublicacionEnGeneral(publicacion, t, motorAplicacion);
                                System.out.println("Se ha publicado correctamente");

                            }

                        }

                    }
                    else if (Objects.equals(answer2, "2"))
                    {
                        for (Usuario t : motorAplicacion.getUsuarios())
                        {
                            if (Objects.equals(t.getAlias(), usuActual))
                            {
                                Publicacion publicacion = new Publicacion(t, sc.nextLine());
                                addPublicacionEnGeneral(publicacion, t, motorAplicacion);
                                System.out.println("Se ha publicado correctamente");

                            }
                        }
                    }
                    else if (Objects.equals(answer2, "3"))
                    {
                        motorAplicacion.mostrarPublicaciones();

                        answer2 = sc.nextLine();
                    }

                    else if (Objects.equals(answer2, "4"))
                    {
                        System.out.println("¿Desea ver su perfil u Otro perfil?(m/o) ");
                        answer2 = sc.nextLine();
                        if (Objects.equals(answer2, "m")) {
                            for (Usuario u : motorAplicacion.getUsuarios()) {
                                if (Objects.equals(u.getAlias(), usuActual)) {

                                    System.out.println(u.getPublicaciones());


                                }
                            }
                        }

                    }


                }



            }


        }


    }


    public static void addPublicacionEnGeneral(Publicacion publicacion, Usuario usuario ,MotorAplicacion motorAplicacion)
    {
        motorAplicacion.addPublicacion(publicacion);
        usuario.addPublicacion(publicacion);
    }
}
