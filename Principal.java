import java.time.LocalTime;
import java.util.Scanner;

public class Principal {
    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        showCurrentDateTime(); 
        System.out.print("¿Cuántos usuarios quieres crear?: ");
        int numero = Integer.parseInt(sc.nextLine());
   
        Usuario[] listaUsuarios = crearArrayUsuarios(numero);

        System.out.println("\n--- LISTA DE USUARIOS CREADOS ---");
        for (Usuario u : listaUsuarios) {
            System.out.println("Usuario: " + u.nombre + " " + u.apellidos + " - Email: " + u.email);
        }   
    }
    public static Usuario[] crearArrayUsuarios(int cantidad) {
        Usuario[] usuarios = new Usuario[cantidad];

        for (int i = 0; i < cantidad; i++) {
            usuarios[i] = new Usuario();
            System.out.println("\n--- Usuario " + (i + 1) + " ---");
            
            System.out.print("Introduce el nombre: ");
            usuarios[i].nombre = sc.nextLine();
            
            System.out.print("Introduce los apellidos: ");
            usuarios[i].apellidos = sc.nextLine();
            
            System.out.print("Introduce el email: ");
            usuarios[i].email = sc.nextLine();
        }
        return usuarios;
    }

    public static void showCurrentDateTime () {
        LocalTime myObj = LocalTime.now();
        System.out.println("Fecha y hora actual: " + myObj);
    }
}
