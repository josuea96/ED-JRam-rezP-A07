//Josué Alexis Ramírez Pérez A00513622 ITIC 4º Semestre
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edquicksort;

import java.util.Arrays;

/**
 *
 * @author josuealexis96
 */
public class EDQuickSort {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        QuickSort QS = new QuickSort();//Se crea un objeto para mandar a llamar a los metodos
        //de la clase en donde se encuentran todos los metodos que se utilizaran en el QuickSort
        int [] vector = QS.CrearVector();//Se usa el objeto para mandar a llamar al metodo CrearVector
        //para generar el vector
        System.out.println("\n");
        System.out.println("Arreglo antes del ordenamiento");
        System.out.println(Arrays.toString(vector) + "\n");
        System.out.println("Ordenamiento QuickSort");
        QS.QuickSort(vector, 0, vector.length-1);
    }
    
}
