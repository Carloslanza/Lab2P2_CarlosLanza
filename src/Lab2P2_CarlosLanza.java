import java.util.ArrayList;
import java.util.Scanner;
import lab2p2_carloslanza.Articulos;
import lab2p2_carloslanza.Conferenciasvirtuales;
import lab2p2_carloslanza.Cursosenlinea;
import lab2p2_carloslanza.Libros;
import lab2p2_carloslanza.Usuario;

public class Lab2P2_CarlosLanza {
    static ArrayList recursos = new ArrayList<>();
    static ArrayList<Usuario> usuarios = new ArrayList<>();
    static Usuario usuarioActual = null;

    public static void main(String[] args) {
        inicializarDatos();

        iniciarSesion();

        if (usuarioActual != null) {
            menuPrincipal();
        } else {
            System.out.println("Credenciales incorrectas. Saliendo del programa.");
        }
    }

    static void inicializarDatos() {
        usuarios.add(new Usuario("estudiante1", "contrasena1", "usuario1"));
        usuarios.add(new Usuario("profesor1", "contrasena2", "usuario2"));
        usuarios.add(new Usuario("bibliotecario1", "contrasena3", "usuario3"));

        recursos.add(new Libros("Libro 1", "Autor 1", "Género 1", 2000, true));
        recursos.add(new Articulos("Artículo 1", "Autor 2", "Tema 1", "2022-01-26", ""));
        recursos.add(new Cursosenlinea("Curso 1", "Instructor 1", 8, "Plataforma A"));
        recursos.add(new Conferenciasvirtuales("Conferencia 1", "Conferencista 1", "2022-01-27", 2, "Enlace A"));
    }

    static void iniciarSesion() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese su nombre de usuario: ");
        String nombreUsuario = scanner.nextLine();

        System.out.print("Ingrese su contraseña: ");
        String contrasena = scanner.nextLine();

        for (Usuario usuario : usuarios) {
            if (usuario.getNombreUsuario().equals(nombreUsuario) && usuario.getContrasena().equals(contrasena)) {
                usuarioActual = usuario;
                return;
            }
        }
    }

    static void menuPrincipal() {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Menú Principal:");
            System.out.println("1. Listar Recursos");
            System.out.println("2. Crear Recurso");
            System.out.println("3. Eliminar Recurso");
            System.out.println("4. Modificar Recurso");
            System.out.println("5. Salir");

            System.out.print("Seleccione una opción: ");
            String opcion = scanner.nextLine();

            switch (opcion) {
                case "1":
                    listarRecursos();
                    break;
                case "2":
                    crearRecurso();
                    break;
                case "3":
                    eliminarRecurso();
                    break;
                case "4":
                    modificarRecurso();
                    break;
                case "5":
                    System.out.println("Saliendo del programa.");
                    return;
                default:
                    System.out.println("Opción inválida. Inténtelo de nuevo.");
            }
        }
    }

    static void listarRecursos() {
        System.out.println("Lista de Recursos:");
        for (Object Recurso : recursos) {
            boolean recurso = false;
            System.out.println(recurso);
        }
    }

    static void crearRecurso() {
        if (usuarioActual.getTipoUsuario() == "usuario1" || usuarioActual.getTipoUsuario() == "usuario2") {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Ingrese el tipo de recurso (Libro/Articulo/Curso/Conferencia): ");
            String tipoRecurso = scanner.nextLine().toLowerCase();

            switch (tipoRecurso) {
                case "libro":
                    recursos.add(crearLibro());
                    break;
                case "articulo":
                    recursos.add(crearArticulo());
                    break;
                case "curso":
                    recursos.add(crearCurso());
                    break;
                case "conferencia":
                    recursos.add(crearConferencia());
                    break;
                default:
                    System.out.println("Tipo de recurso no válido.");
            }
        } else {
            System.out.println("Acceso no autorizado para crear recursos.");
        }
    }

    public static Libros crearLibro() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el título del libro: ");
        String titulo = scanner.nextLine();

        System.out.print("Ingrese el autor del libro: ");
        String autor = scanner.nextLine();

        System.out.print("Ingrese el género del libro: ");
        String genero = scanner.nextLine();

        System.out.print("Ingrese el año de publicación del libro: ");
        int anoPublicacion = Integer.parseInt(scanner.nextLine());

        System.out.print("El libro está disponible (si/no): ");
        boolean disponibilidad = scanner.nextLine().equalsIgnoreCase("si");

        return new Libros(titulo, autor, genero, anoPublicacion, disponibilidad);
    }

    public static Articulos crearArticulo() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el título del artículo: ");
        String titulo = scanner.nextLine();

        System.out.print("Ingrese el autor del artículo: ");
        String autor = scanner.nextLine();

        System.out.print("Ingrese el tema del artículo: ");
        String tema = scanner.nextLine();

        System.out.print("Ingrese la fecha de publicación del artículo (YYYY-MM-DD): ");
        String fechaPublicacion = scanner.nextLine();

        System.out.print("El artículo está disponible en línea (si/no): ");
        boolean accesoEnLinea = scanner.nextLine().equalsIgnoreCase("si");

        return new Articulos(titulo, autor, tema, fechaPublicacion, "1");
    }

    public static Cursosenlinea crearCurso() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el título del curso: ");
        String titulo = scanner.nextLine();

        System.out.print("Ingrese el instructor del curso: ");
        String instructor = scanner.nextLine();

        System.out.print("Ingrese la duración en semanas del curso: ");
        int duracionSemanas = Integer.parseInt(scanner.nextLine());

        System.out.print("Ingrese la plataforma de enseñanza del curso: ");
        String plataformaEnsenanza = scanner.nextLine();

        return new Cursosenlinea(titulo, instructor, duracionSemanas, plataformaEnsenanza);
    }

    public static Conferenciasvirtuales crearConferencia() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el título de la conferencia: ");
        String titulo = scanner.nextLine();

        System.out.print("Ingrese el conferencista de la conferencia: ");
        String conferencista = scanner.nextLine();

        System.out.print("Ingrese la fecha de la conferencia (YYYY-MM-DD): ");
        String fecha = scanner.nextLine();

        System.out.print("Ingrese la duración de la conferencia en horas: ");
        int duracionHoras = Integer.parseInt(scanner.nextLine());

        System.out.print("Ingrese el enlace de acceso a la conferencia: ");
        String enlaceAcceso = scanner.nextLine();

        return new Conferenciasvirtuales(titulo, conferencista, fecha, duracionHoras, enlaceAcceso);
    }

    static void eliminarRecurso() {
        if (usuarioActual.getTipoUsuario() == "") {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Ingrese el título del recurso a eliminar: ");
            String tituloEliminar = scanner.nextLine();

            recursos.removeIf(recurso -> {
                System.out.println("Ingrese el titulo: ");
                String titulo = scanner.nextLine();
                return recursos.add(titulo);
            });
        } else {
            System.out.println("Acceso no autorizado para eliminar recursos.");
        }
    }

    static void modificarRecurso() {
        if (usuarioActual.getTipoUsuario() == "usuario2") {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Ingrese el título del recurso a modificar: ");
            String tituloModificar = scanner.nextLine();

            for ( Object x : recursos) {
                if (recursos.isEmpty()) {
                    System.out.print("Ingrese el nuevo título del recurso: ");
                    recursos.add("xxx");
                    recursos.set(0, x);

                    System.out.print("Ingrese el nuevo autor del recurso: ");
                    String autor = scanner.nextLine();
                    recursos.add(autor);

                    System.out.println("Recurso modificado correctamente.");
                    return;
                } else {
                }
            }

            System.out.println("Recurso no encontrado.");
        } else {
            System.out.println("Acceso no autorizado para modificar recursos.");
        }
    }
}
