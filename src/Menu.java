import java.util.Scanner;

public class Menu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean salir = false;



        while (!salir) {
            System.out.println("˚₊· ͟͟͞͞➳❥˚₊· ͟͟͞͞➳❥˚₊· ͟͟͞͞➳❥");
            System.out.println("➊ Añadir videojuego.");
            System.out.println("➋ Mostrar ranking.");
            System.out.println("➌ Guardar ranking.");
            System.out.println("➍ Cargar ranking.");
            System.out.println("➎ Eliminar videojuego.");
            System.out.println("➏ Exportar a texto.");
            System.out.println("➐ Salir.");
            System.out.println("˚₊· ͟͟͞͞➳❥˚₊· ͟͟͞͞➳❥˚₊· ͟͟͞͞➳❥");


            int menu = sc.nextInt();
            sc.nextLine();
            switch (menu) {

                case 1:
                    boolean salir2 = false;
                    while (!salir2){

                        System.out.println("Quieres añadir un videojuego físico o digital?");
                        System.out.println("➊ Físico.");
                        System.out.println("➋ Digital.");
                        System.out.println("➌ Salir.");
                        int menu2 = sc.nextInt();
                        sc.nextLine();
                        switch (menu2){
                            case 1:
                                VideoFunciones.add_videojuego_fisico();
                                break;
                            case 2:
                                VideoFunciones.add_videojuego_digital();
                                break;
                            case 3:
                                System.out.println("Pos na'");
                                salir2 = true;
                            default:
                                System.out.println("Introduce un numero valido vaaaaa porfis.");
                        }
                        }

                    break;
                case 2:
                    VideoFunciones.mostrar_ranking();
                    break;
                case 3:
                    VideoFunciones.guardar_fichero_binario();
                    break;
                case 4:
                    VideoFunciones.cargar_fichero_binario();
                    break;
                case 5:
                    VideoFunciones.eliminar_videojuego_por_titulo();
                    break;
                case 6:
                    VideoFunciones.videojuegos_a_texto();
                    break;
                case 7:
                    salir = true;
                    System.out.println("▶Aips");
                    break;

                default:
                    System.out.println("Introduceme un numero valido enga campeon@");

            }
        }
    }
}
