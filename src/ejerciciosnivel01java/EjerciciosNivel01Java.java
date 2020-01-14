package ejerciciosnivel01java;

import java.util.Arrays;

/**
 *
 * @author Jorge Cisneros
 */
public class EjerciciosNivel01Java {

    int [] listaNumeros = {333, 31, 200, 20, 5, 99};
    
    public int maximo ( int[] lista){
        int auxiliar = lista[0];
        for (int i=0; i< lista.length; i++){
            if (auxiliar < lista[i]){
                auxiliar = lista[i];
            }
        }
        return auxiliar;
    }
 
    public int[] maximos ( int[] lista){
        int max1 = lista[0];
        int max2 = lista[1];
        for (int i=0; i< lista.length; i++){
           if (max1 < lista[i]){
               max2 = max1;
               max1 = lista[i];
           }
           else if (max2 < lista[i] && lista[i] != max1){
               max2 = lista[i];
           }
        }
        int [] maxArray = {max1, max2};
        return maxArray;
    }
    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        EjerciciosNivel01Java ejercicio = new EjerciciosNivel01Java();
        System.out.println(ejercicio.maximo(ejercicio.listaNumeros));
        
        System.out.println(
                Arrays.toString(
                        ejercicio.maximos(ejercicio.listaNumeros)
                )
        );
    
    }
    
}
