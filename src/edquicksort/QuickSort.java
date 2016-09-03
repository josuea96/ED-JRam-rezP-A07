//Josué Alexis Ramírez Pérez A00513622 ITIC 4º Semestre
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edquicksort;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author josuealexis96
 */
public class QuickSort extends EDQuickSort{
    protected int [] vector;
    
    public QuickSort(int[] vector){//Se declara un constructor de la clase
        //con los parametros
        this.vector = vector;
    }
    public QuickSort(){//Se declara un constructor de la clase sin añadir parametros
        this.vector = vector;
    }
    
    public int [] CrearVector(){//Se crea un metodo para pedirle al usuario los valores que
        //quiere poner el vector y su respectivo tamaño
        Scanner sc;
        sc = new Scanner(System.in);
        System.out.print("Escribe el tamaño del arreglo: ");
        int n = sc.nextInt();
        int vector[] = new int [n];
       
        for (int i = 0; i < n; i++){//Se va recorriendo el puntero en el arreglo
            //para que el usuario inserte el número que guste
            System.out.print("Escribe el dato " + i + " : ");
            vector[i] = sc.nextInt();//Se guarda el numero dado en la una posicion del vector
        }
        return vector;
    } 
    
    public static void QuickSort(int [] vector, int inicio, int fin){//Se crea un metodo para
        //realizar el algoritmo de ordenamiento QuickSort incluyendo el vector que se usara y los punteros
    
        int i = inicio,j = fin,aux;//Se declaran las variables que se utilizaran incluyendo un pivote para saber
        //como se va a estar ordenando
        
        int pivote = vector[(inicio + fin)/2];//El pivote estara en el centro del arreglo y se calculara
        //sumando las posiciones del arreglo, el inicio y el fin, para despues dividir ese resultado entre dos
        //y encontrar el centro del arreglo
        do{
            while(vector[i] < pivote){//Se realiza una condición para verificar si el número que se encuentra
                //en la posición i es menor al que se encuentra en el pivote
                i++;//De ser así, se mueve la posición i en mas 1
            }
            while(vector[j] > pivote){//Se realiza una condición para verificar si el número que se encuentra
                //en la posición j es mayor al que se encuentra en el pivote
                j--;//De ser así, se mueve la posición j en menos 1
            }
            if(i <= j){//Se genera una condición para verificar si el valor que se encuentra en i es menor
                //o igual al que se encuentra en j
                aux = vector[i];//Si la condición se cumple, se guarda el valor que se encuentra en i en una variable auxiliar
                vector[i] = vector[j];//Se guarda el valor que se encuentra en j en i
                vector[j] = aux;//El valor que se guardo en la variable auxiliar se guarda en la posición j
                i++;//La posición i se mueve 1 espacio a la derecha
                j--;//La posición j se mueve 1 espacio a la izquierda
            }
            System.out.println(Arrays.toString(vector));//Imprime el arreglo convirtiendolo en un String
        }while(i <= j);//El ciclo se repetira hasta que el valor de i sea menor o igual al valor que
        //tiene j
        
        if(inicio < j){
            QuickSort(vector,inicio,j);
        }
        if(i < fin){
            QuickSort(vector,i,fin);
        } 
    }
}
