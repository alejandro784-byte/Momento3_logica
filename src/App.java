import java.util.Scanner;

public class App {
    public static void main(String[] args){
        Scanner leer = new Scanner(System.in);
        String[] referencias = {"chaqueta Cuero Iconn", "Jean slim fit", "Camiseta polo Leather", null, null};
        int opcion = 0;
        
        while (opcion != 4) {
            System.out.println("Menu Chevignon");
            System.out.println("1. Mostrar prendas disponibles");
            System.out.println("2. Consultar stock del producto");
            System.out.println("3. Ingresar una nueva prenda al inventario");
            System.out.println("4. Finalizar");
            opcion = leer.nextInt();
            leer.nextLine();
            
            if (opcion == 1) {
                System.out.println("Aquí mostraremos las prendas (pronto)");
            } else if (opcion == 2) {
                System.out.println("Aquí buscaremos (pronto)");
            } else if (opcion == 3) {
                System.out.println("Aquí agregaremos (pronto)");
            } else if (opcion == 4) {
                System.out.println("Cerrando sistema...");
            } else {
                System.out.println("Opción no encontrada, digita de nuevo");
            }
        }
    } 
}