/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package ordenamientos;

import java.io.IOException;
import java.util.Stack;
import java.util.logging.Level;
import java.util.logging.Logger;

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
        /**
        //int arreglo[]={15,67,8,16,44,27,12,35,56,21,13,28,60,36,7,10};
        //metodos.setA(arreglo);
        metodos.generarAleatorios();
        //System.out.println("Metodo de insercion");
        System.out.println("Arreglo desordenado");
        metodos.imprimir();
        //metodos.insercion();
        metodos.QuickSort();***/
        try {
            metodos.GeneraAleatoriosADIsco();
        } catch (IOException ex) {
            Logger.getLogger(PruebaMetodos.class.getName()).log(Level.SEVERE, null, ex);
        }
       
        System.out.println("Arreglo ordenado");
        //metodos.imprimir();
        
        // TODO code application logic here
    }

}
