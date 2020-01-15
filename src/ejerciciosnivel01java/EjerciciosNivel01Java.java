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
    
    private String quita(String cadena){
        String auxiliar = "";
        for (int i=0; i< cadena.length(); i++){
            if (cadena.charAt(i) != ' '){
                auxiliar = auxiliar + cadena.charAt(i);
            }
        }
        return auxiliar;
    }
    private boolean palindromo(String cadena){
        //primera fase: creo un nuevo String que sea una copia del 
        //que me pasan pero quitándole los espacios en blanco
        String auxiliar = quita(cadena);
        //ahora en auxiliar tengo el string pero sin espacios en blanco
        //declaro dos indices para que digan qué posiciones estoy comparando
        int indiceIzq = 0;
        int indiceDer = auxiliar.length()-1;
        
        //mientras sean iguales los caracteres en esas posiciones la palabra será un palindromo
        //en el momento en el que una de esas comparaciones falle, es que no es palíndromo
        
        //además, si el indice izquierdo es mayor que el derecho, ya he chequeado toda la frase
        while (auxiliar.charAt(indiceIzq) == auxiliar.charAt(indiceDer) && indiceIzq <= indiceDer){
            indiceIzq++;
            indiceDer--;
        }
        boolean resultado = true;
        if (indiceIzq < indiceDer){ // si esto se cumple es que la palabra no es un palíndromo
            resultado = false;
            System.out.println("NO ES UN PALINDROMO ");
        }
        else{
            System.out.println("SI ES UN PALINDROMO ");
        }
    return resultado; 
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
