import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class VideoFunciones {
    static Scanner sc = new Scanner(System.in);

    static List<Videojuego> ranking = new ArrayList<>();
    static File fichero_videojuego = new File("videojuegos.dat");
    static File fichero_videojuego_texto = new File("videojuegos.txt");


    public static void crearFichero() {



        try {
            if (fichero_videojuego_texto.createNewFile()) {
                System.out.println(" ");
                System.out.println("✓ Se ha creado el .txt correctamente");
            } else {
                System.out.println("El archivo ya .txt existe");
            }
        } catch (IOException e) {
            System.out.println("❌Error al crear el archivo");
            throw new RuntimeException(e);
        }
        try {
            if (fichero_videojuego.createNewFile()) {
                System.out.println(" ");
                System.out.println("✓ Se ha creado el .dat correctamente");
            } else {
                System.out.println("El archivo .dat ya existe");
            }
        } catch (IOException e) {
            System.out.println("❌Error al crear el archivo");
            throw new RuntimeException(e);
        }
    }

    public static void add_videojuego_digital() {

        System.out.println("En que plataforma esta el videojuego?");
        String plataforma = sc.nextLine();

        System.out.println("Cual es el titulo del videojuego?");
        String titulo = sc.nextLine();

        System.out.println("Que nota le pondiras?");
        int nota = sc.nextInt();
        sc.nextLine();
        System.out.println("En que tienda se vende?");
        String tienda_online = sc.nextLine();

        System.out.println("Cuanto pesa tu juego?");
        Double tamaño_juego = sc.nextDouble();

        VidiojuegoDigital juego = new VidiojuegoDigital(plataforma, titulo, nota, tienda_online, tamaño_juego);
        ranking.add(juego);
    }

    public static void add_videojuego_fisico() {


            System.out.println("¿En qué plataforma está el videojuego?");
            String plataforma = sc.nextLine();

            System.out.println("¿Cuál es el título del videojuego?");
            String titulo = sc.nextLine();

            System.out.println("¿Qué nota le pondrías?");
            int nota = sc.nextInt();
            sc.nextLine(); // limpiar el buffer

            System.out.println("¿En qué tienda se compró?");
            String tiendaCompra = sc.nextLine();

            System.out.println("¿En qué estado está el juego (nuevo, usado, etc.)?");
            String estado = sc.nextLine();

            VideojuegoFisico juego = new VideojuegoFisico(plataforma, titulo, nota, tiendaCompra, estado);
            ranking.add(juego);


    }

    public static void mostrar_ranking() {
        int contador = 1;
        if (ranking.isEmpty()) {
            System.out.println("La lista esta vacia");
        } else {

            ranking.forEach((videojuego -> {
                System.out.println("≣≣≣≣≣≣≣≣≣≣≣≣≣≣≣≣≣≣≣≣≣≣≣≣≣");
                System.out.println(contador + ". " + videojuego.toString());
            }));

        }

    }

    public static void eliminar_videojuego_por_titulo() {

            System.out.println("▷▶Dime el nombre del juegito.");
            String nombre_juego = sc.nextLine();

            int indice_a_borrar = -1;

            for (int i = 0; i < ranking.size(); i++) {
                if (ranking.get(i).getTitulo().equalsIgnoreCase(nombre_juego)) {
                    indice_a_borrar = i;
                    break;
                }
            }

            if (indice_a_borrar != -1) {
                ranking.remove(indice_a_borrar);
                System.out.println("✓ Juego eliminado.");
            } else {
                System.out.println("⚠ No se encontró ningún juego con ese título.");
            }



    }

    public static void guardar_fichero_binario(){
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("videojuego.dat"))) {
            oos.writeObject(ranking);
            System.out.println("✔ Datos guardados en binario.");
        } catch (IOException e) {
            System.out.println("❌ Error al guardar en binario: " + e.getMessage());
        }
    }

    public static void cargar_fichero_binario() {

        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("videojuego.dat"))) {
            ranking = (List<Videojuego>) ois.readObject();

            System.out.println("✔ Datos cargados desde binario.");
        } catch (FileNotFoundException e) {
            System.out.println("ℹ No hay archivo binario aún, se creará uno nuevo al guardar.");
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("❌ Error al leer desde binario: " + e.getMessage());
        }

    }
    public static void videojuegos_a_texto (){
        List<String> lineas_texto_videjuego = new ArrayList<>();

        ranking.forEach(videojuego -> {
            lineas_texto_videjuego.add(videojuego.toString());

            try {
                Files.write(fichero_videojuego_texto.toPath(), lineas_texto_videjuego, StandardOpenOption.TRUNCATE_EXISTING);
                System.out.println("✔ Datos escritos correctamente en el archivo de texto.");
            } catch (IOException e) {
                System.out.println("❌ Error al escribir en el archivo de texto: " + e.getMessage());
            }
        });
    }
}



