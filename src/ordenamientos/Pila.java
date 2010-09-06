/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package ordenamientos;

import java.util.ArrayList;

/**
 *
 * @author josue
 */
import java.util.Vector;

public class Pila <Tipo> {

    private int     size;
    private Vector<Tipo>    elementos;

    public Pila() {
        super();
        elementos = new Vector<Tipo>();
        size = 0;
    }

    public boolean pilaVacia () {
        if (size==0) {
            return true;
        }
        return false;
    }

    public void apilar ( Tipo o ) {
        elementos.add(size, o);
        size++;
    }

    public Tipo desapilar () {

        try {
            if(pilaVacia())
                throw new ErrorPilaVacia();
            else {
                return elementos.get(--size);
            }
        } catch(ErrorPilaVacia error) {
            System.out.println("ERROR: la pila esta vacía");
            return null;
        }
    }

    public int getSize() {
        return size;
    }

}

@SuppressWarnings("serial")
class ErrorPilaVacia extends Exception {
    public ErrorPilaVacia() {
        super();
    }
}

