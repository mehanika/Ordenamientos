/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package ordenamientos;

import java.util.Stack;

/**
 *
 * @author Josue Eduardo Pech Ucan
 */
public class PruebaMetodos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Metodos metodos=new Metodos();

        //int arreglo[]={3,5,7,9,4,6,1,10,2};
        //metodos.setA(arreglo);
        metodos.generarAleatorios();
        //System.out.println("Metodo de insercion");
        System.out.println("Arreglo desordenado");
        metodos.imprimir();
        //metodos.insercion();
        metodos.QuickSort();
       
        System.out.println("Arreglo ordenado");
        metodos.imprimir();
        
        // TODO code application logic here
    }

}
