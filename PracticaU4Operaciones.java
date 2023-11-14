
package practicau4.operaciones;

/**
 *
 * @author Cesar Arcos Ortega
 */
public class PracticaU4Operaciones {

    
    public static void main(String[] args) {
       int num1 = 10;
        int num2 = 5;

        System.out.println("Suma: " + suma(num1, num2));
        System.out.println("Resta: " + resta(num1, num2));
        System.out.println("Multiplicación: " + multiplicacion(num1, num2));
        System.out.println("División: " + division(num1, num2));
    }

    public static int suma(int num1, int num2) {
        return num1 + num2;
    }

    public static int resta(int num1, int num2) {
        return num1 - num2;
    }
    public static int multiplicacion(int num1, int num2) {
        return num1 * num2;
    }

    public static double division(int num1, int num2) {
        if (num2 == 0) {
            throw new IllegalArgumentException("No se puede dividir por cero");
        }
        return (double) num1 / num2;
    }
    
}
