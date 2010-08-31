/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package ordenamiento;

import java.util.ArrayList;

/**
 *
 * @author josue
 */
public class MergeSort {

     public ArrayList ordenaMerge(ArrayList L) {
        int n = L.size(), i;
        ArrayList L1 = new ArrayList(), L2 = new ArrayList();
        if (n > 1) {
            int m = (int) Math.floor((double) n / (double) 2);
            for (i = 0; i < m; i++) {
                L1.add(L.get(i));
            }
            for (i = m; i < n; i++) {
                L2.add(L.get(i));
            }
            L = merge(ordenaMerge(L1), ordenaMerge(L2));
        }
        return L;
    }

    public ArrayList merge(ArrayList L1, ArrayList L2) {
        ArrayList L = new ArrayList();
        while (!(L1.isEmpty()) && !(L2.isEmpty())) {
           // if ((Integer) L1.get(0) < (Integer) L2.get(0)) {
                if (((Persona) L1.get(0)).compareTo(L2.get(0))<0) {
                L.add(L1.get(0));
                L1.remove(0);
                if (L1.isEmpty()) {
                    while (!L2.isEmpty()) {
                        L.add(L2.get(0));
                        L2.remove(0);
                    }
                }
            } else {
                L.add(L2.get(0));
                L2.remove(0);
                if (L2.isEmpty()) {
                    while (!L1.isEmpty()) {
                        L.add(L1.get(0));
                        L1.remove(0);
                    }
                }
            }
        }

        return L;
    }

    public static void main(String[] args) {
        MergeSort N = new MergeSort();
        Persona p1= new Persona();
        p1.setNombres("Josue E.");
        p1.setApellidoM("Ucan");
        p1.setApellidoP("Pech");
        p1.setEdad(19);
        p1.setSueldo(150);

        Persona p2= new Persona();
        p2.setNombres("Jebus");
        p2.setApellidoM("Sou");
        p2.setApellidoP("Till");
        p2.setEdad(25);
        p2.setSueldo(1500);


        Persona p3= new Persona();
        p3.setNombres("Yoji");
        p3.setApellidoM("Bio");
        p3.setApellidoP("Mehanika");
        p3.setEdad(28);
        p3.setSueldo(2400);

        ArrayList Lista = new ArrayList();
///QAI
        /*Lista.add(77);
        Lista.add(23);
        Lista.add(56);
        Lista.add(254);
        Lista.add(32);
        Lista.add(99);
        Lista.add(0);
        Lista.add(85);
        Lista.add(99);
        Lista.add(0);*/
        Lista.add(p1);
        Lista.add(p2);
        Lista.add(p3);

        Lista = N.ordenaMerge(Lista);
        int i;
//
//     for(i=0;i<Lista.size();i++)
//         System.out.println(Lista.get(i));

        System.out.println(Lista);

    }
}
