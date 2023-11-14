
package practica4.u4u5;

/**
 *
 * @author Cesar Arcos Ortega
 */
public class Practica4U4U5 {
public static int[] sumarconsumagua(int[][]num, int numconsagua, int numconsaguadia){        int[] consumocasa = new int [numconsagua];
        for (int i = 0; i < numconsagua; i++) {
            int suma = 0;
            for (int j = 0; j < numconsaguadia; j++) {
                suma += num [i][j];
            }
            consumocasa[i] = suma;
        }
        return consumocasa;
    }
    public static int[] sumarconsumodia(int [][] numeros){
        int numconsagua = numeros.length;
        int numcad = numeros.length;
        int [] consumodia = new int [numcad];
        for (int j = 0; j < numeros.length; j++) {
            int suma = 0;
            for (int i = 0; i < numeros.length; i++) {
                suma += numeros[i][j];
            }
            consumodia[j] = suma;
        }
        return consumodia;
    }
    public static void main(String[] args) {
        int[][] numeros = {
            {100, 50, 30, 120, 60},
            {32, 122, 46, 80, 90},
            {45, 100, 56, 26, 36},
            {60, 110, 72, 33, 40},    
        };
        int[] consumoCasa = Practica4U4U5.sumarconsumagua(numeros, 4, 5);
        for (int a: consumoCasa){
            System.out.println(a);
        }
        int [] consumodia = Practica4U4U5.sumarconsumodia(numeros);
        for (int o: consumodia) {
            System.out.println(o);
        }
    }
 
}