import java.time.LocalTime;

public class principal {
    public static void main(String[] args) {
        System.out.println("Hola mundo!");    
        showCurrentDateTime();
    }
    public static void showCurrentDateTime () {
        LocalTime myObj = LocalTime.now();
        System.out.println("Fecha y hora actual: " + myObj);
    }
}
