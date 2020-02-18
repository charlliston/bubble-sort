
package exercicio2;

/**
 *
 * @author charllistonadrianni
 */
public class Exercicio2 {

 
    public static void main(String[] args) {

        int [] lista = {10, 9, 8, 7, 6, 5, 4, 3, 2, 1, 0};
        
        bubbleSort(lista);
                 
            for(int i=0; i < lista.length; i++) {  
                System.out.print(lista[i] + " ");  
            }  
   
    }  
    
    
    static void bubbleSort(int[] lista) {  
        int tam = lista.length;  
        int temp = 0;  
        
        for(int i=0; i < tam; i++) {  
            for(int j=1; j < (tam-i); j++) {  
                if(lista[j-1] > lista[j]) {  
                    temp = lista[j-1];  
                    lista[j-1] = lista[j];  
                    lista[j] = temp;  
                }       
            }  
        }  
    }
}
