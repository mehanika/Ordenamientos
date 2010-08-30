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

     public ArrayList ordenMerge(ArrayList L) {
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
            L = merge(ordenMerge(L1), ordenMerge(L2));
        }
        return L;
    }

    public ArrayList merge(ArrayList L1, ArrayList L2) {
        ArrayList L = new ArrayList();
        while (!(L1.isEmpty()) && !(L2.isEmpty())) {
            if ((Integer) L1.get(0) < (Integer) L2.get(0)) {
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
        ArrayList Lista = new ArrayList();
///QAI
        Lista.add(77);
        Lista.add(23);
        Lista.add(56);
        Lista.add(254);
        Lista.add(32);
        Lista.add(99);
        Lista.add(0);
        Lista.add(85);
        Lista.add(99);
        Lista.add(-14);

        Lista = N.ordenMerge(Lista);
        int i;
//
//     for(i=0;i<Lista.size();i++)
//         System.out.println(Lista.get(i));

        System.out.println(Lista);

    }
}
