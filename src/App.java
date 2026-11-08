import java.util.Scanner;

public class App {
    public static void main(String[] args){
        Scanner leer = new Scanner(System.in);
        String[] referencias = {"chaqueta Cuero Iconn", "Jean slim fit", "Camiseta polo Leather", null, null};
        int opcion = 0;
        String prendaBuscada;
        
        while (opcion != 4) {
            System.out.println("Menu Chevignon");
            System.out.println("1. Mostrar prendas disponibles");
            System.out.println("2. Consultar stock del producto");
            System.out.println("3. Ingresar nueva prenda al inventario");
            System.out.println("4. Finalizar");
            opcion = leer.nextInt();
            leer.nextLine();
            
            if (opcion == 1) {
                System.out.println("Aqui encontraras nuestras prendas");
                for (String prenda : referencias) {
                    if (prenda != null) {
                        System.out.println("- " + prenda);
                    }
                }
            } else if (opcion == 2) {
                System.out.println("¿Que prenda deseas buscar?");
                prendaBuscada = leer.nextLine();
                
                boolean existe = nombreFuncion(referencias, prendaBuscada);
                if (existe == true) {
                    System.out.println("¡Sí! La prenda sí está en el inventario.");
                } else {
                    System.out.println("No tenemos esa prenda registrada.");
                }
            } else if (opcion == 3) {
                System.out.println("¿Qué nueva prenda deseas agregar al inventario?");
                String nuevaPrenda = leer.nextLine();
                
                for (int i = 0; i < referencias.length; i++) {
                    if (referencias[i] == null) {
                        referencias[i] = nuevaPrenda;
                        System.out.println("Prenda agregada con éxito");
                        break;
                    }
                }
            } else if (opcion == 4) {
                System.out.println("Cerrando sistema...");
            } else {
                System.out.println("Opción no encontrada, digita de nuevo");
            }
        }
    } 
    
    public static boolean nombreFuncion(String[] arreglo, String nombreBuscado){
        for (String prenda : arreglo) {
            if (prenda != null) { 
                if (prenda.equals(nombreBuscado)) {
                    return true;
                }
            }
        }
        return false;
    }
}