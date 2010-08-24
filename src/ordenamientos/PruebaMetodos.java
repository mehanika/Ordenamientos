/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package ordenamientos;

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

        int arreglo[]={1,2,3,4,5,6,7,8,9,10};
        //metodos.setA(arreglo);
        metodos.generarAleatorios();
        System.out.println("Metodo de insercion");
        System.out.println("Arreglo desordenado");
        metodos.imprimir();
        //metodos.insercion();
        metodos.burbujaMayor();
        System.out.println("Arreglo ordenado");
        metodos.imprimir();
        
        // TODO code application logic here
    }

}
