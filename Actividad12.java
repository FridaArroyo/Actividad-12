package actividad.pkg12;
import java.util.Scanner;
public class Actividad12 {
public static void main(String[] args) {
     
        Scanner leer = new Scanner(System.in);
        boolean end = false;
        Directorio d = new Directorio();
        d.load();
        while (!end){
            System.out.printf("\n\n%s\n%s\n%s\n%s\n%s\n\n%s",
                    "======== MENÚ ========","1. Mostrar todos los contactos",
                    "2. Crear nuevos contactos", "3. Borrar un contacto",
                    "4. Salir", "¿Qué deseas hacer? ");
            switch(leer.nextInt()){
                case 1:
                    d.list();
                    break;
                case 2:
                    System.out.print("\nIngresa el teléfono: ");
                    String phone = leer.next();
                    System.out.print("Ingresa el nombre: ");
                    String name = leer.next();
                    d.create(phone, name);
                    break;
                case 3:
                    System.out.print("\nIngresa el teléfono: ");
                    String contact = leer.next();
                    d.delete(contact);
                    break;
                case 4:
                    System.out.println("\nAdiós");
                    d.save();
                    end = true;
                    break;
                default:
                    System.out.println("Por favor, escribe una opción válida");
                    break;
            }
        }   
    }
    
}
