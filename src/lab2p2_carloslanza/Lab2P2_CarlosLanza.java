import java.util.ArrayList;
import java.util.Scanner;
import lab2p2_carloslanza.Articulos;
import lab2p2_carloslanza.Conferenciasvirtuales;
import lab2p2_carloslanza.Cursosenlinea;
import lab2p2_carloslanza.Libros;
import lab2p2_carloslanza.Usuario;

public class Lab2P2_CarlosLanza{
    public static void main(String[] args) {
        Libros Libros = new Libros("TítuloLibro", "AutorLibro", "GéneroLibro", 2022, true);
        Articulos articulo1 = new Articulos("TítuloArticulo", "AutorArticulo", "TemaArticulo", "2022-01-26", true);
        Cursosenlinea curso1 = new Cursosenlinea("TítuloCurso", "InstructorCurso", 8, "PlataformaCurso");
        Conferenciasvirtuales conferencia1 = new Conferenciasvirtuales("TítuloConferencia", "Conferencista", "2022-01-27", "1 hora", "EnlaceAcceso");

        Usuario estudiante = new Usuario("Estudiante1", "contraseña1", "estudiante");
        Usuario profesor = new Usuario("Profesor1", "contraseña2", "profesor");
        Usuario bibliotecario = new Usuario("Bibliotecario1", "contraseña3", "bibliotecario");

        ArrayList<Object> listaRecursos = new ArrayList<>();
        Object libro1 = null;
        listaRecursos.add(libro1);
        listaRecursos.add(articulo1);
        listaRecursos.add(curso1);
        listaRecursos.add(conferencia1);

        ArrayList<Usuario> listaUsuarios = new ArrayList<>();
        listaUsuarios.add(estudiante);
        listaUsuarios.add(profesor);
        listaUsuarios.add(bibliotecario);

        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese nombre de usuario:");
        String inputUsuario = scanner.nextLine();
        System.out.println("Ingrese contraseña:");
        String inputContraseña = scanner.nextLine();

        Usuario usuarioActual = null;
        for (Usuario usuario : listaUsuarios) {
            if (usuario.nombreUsuario.equals(inputUsuario) && usuario.contraseña.equals(inputContraseña)) {
                usuarioActual = usuario;
                break;
            }
        }

        if (usuarioActual != null) {
            System.out.println("Inicio de sesión exitoso. Tipo de usuario: " + usuarioActual.tipoUsuario);

            while (true) {
                System.out.println("Menú principal:");
                System.out.println("1. Listar Recursos");
                System.out.println("2. Crear Recurso");
                System.out.println("3. Eliminar Recurso");
                System.out.println("4. Modificar Recurso");
                System.out.println("5. Salir");

                int opcion = scanner.nextInt();
                scanner.nextLine();  // Consumir la nueva línea después del entero

                switch (opcion) {
                    case 1:
                        listarRecursos(listaRecursos);
                        break;
                    case 2:
                        if (usuarioActual.tipoUsuario.equals("profesor") || usuarioActual.tipoUsuario.equals("bibliotecario")) {
                            System.out.println("Opción no implementada para este ejemplo.");
                        } else {
                            System.out.println("Permiso denegado. Solo profesores y bibliotecarios pueden agregar recursos.");
                        }
                        break;
                    case 3:
                        if (usuarioActual.tipoUsuario.equals("bibliotecario")) {
                            System.out.println("Opción no implementada para este ejemplo.");
                        } else {
                            System.out.println("Permiso denegado. Solo bibliotecarios pueden eliminar recursos.");
                        }
                        break;
                    case 4:
                        if (usuarioActual.tipoUsuario.equals("bibliotecario")) {
                            System.out.println("Opción no implementada para este ejemplo.");
                        } else {
                            System.out.println("Permiso denegado. Solo bibliotecarios pueden modificar recursos.");
                        }
                        break;
                    case 5:
                        System.out.println("Saliendo del programa. ¡Hasta luego!");
                        System.exit(0);
                        break;
                    default:
                        System.out.println("Opción no válida. Inténtelo de nuevo.");
                }
            }
        } else {
            System.out.println("Inicio de sesión fallido. Verifique sus credenciales.");
        }
    }

    private static void listarRecursos(ArrayList<Object> recursos) {
        System.out.println("Lista de Recursos:");
        for (Object recurso : recursos) {
            System.out.println(recurso.toString());
        }
    }
} 