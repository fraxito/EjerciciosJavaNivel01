package ejerciciosnivel01java;

import java.util.Arrays;

/**
 *
 * @author Jorge Cisneros
 */
public class EjerciciosNivel01Java {

    int [] listaNumeros = {15, 31, 200, 2, 5, 99};
    
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
        int [] arrayMaximos = {lista[0], lista[0]};
        
        for (int i=0; i< lista.length; i++){
           if (arrayMaximos[0] < lista[i]){
               arrayMaximos[1] = arrayMaximos[0];
               arrayMaximos[0] = lista[i];
           } 
        }
        return arrayMaximos;
    }
    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        EjerciciosNivel01Java ejercicio = new EjerciciosNivel01Java();
        System.out.println(ejercicio.maximo(ejercicio.listaNumeros));
        
        System.out.println(Arrays.toString(ejercicio.maximos(ejercicio.listaNumeros)));
    
    }
    
}
