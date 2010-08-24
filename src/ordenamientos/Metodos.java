/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package ordenamientos;
import java.util.Random;
/**
 *
 * @author Josue Eduardo Pech Ucan
 */
public class Metodos {

    private int [] A;

    /**
     * @return the A
     */
    public int[] getA() {
        return A;
    }

    /**
     * @param A the A to set
     */
    public void setA(int[] A) {
        this.A = A;
    }


    public void imprimir()
    {
        for(int i=0; i<A.length;i++)
        {
            System.out.println(A[i]);
        }
    }

    public void insercion()
    {
        int aux,k,comp=0,cambio=0;
     for(int i=1;i<A.length;i++)
     {
        
     aux=A[i]; k=i-1;

     if(!(aux<A[k]))
     {
         comp++;
     }

     while((k>=0) && (aux<A[k]))
     {
          comp++;
         cambio++;
         A[k+1]=A[k];
         k=k-1;
     }
     A[k+1]=aux;
     }
    System.out.println("Comparaciones: "+comp+" Cambios: "+cambio);
    }

    public void generarAleatorios()
    {
    A=new int[10];
    Random rnd = new Random();
    for(int i=0;i<A.length;i++)
    {
    int n=rnd.nextInt(5000);
    
    A[i]=n;
    }
    }

public void shellsort(){
        int INT, i, aux;
        boolean band;
        INT=A.length;

        while (INT >1){
            INT=(int)INT/2;
            band=true;
            while(band==true){
                band=false;
                i=0;
                while((INT+i)<=A.length-1){
                    if(A[i]>A[i+INT]){
                        aux=A[i];
                        A[i]=A[i+INT];
                        A[i+INT]=aux;
                        band=true;
                    }
                    i++;
                }
            }
        }

    }

    public void burbujaMenor(){
        int i, j, aux, N;

        for(i=1;i<A.length;i++){
            for(j=A.length-1;j>=i;j--){
                if((A[j-1])>(A[j])){
                    aux=A[j-1];
                    A[j-1]=A[j];
                    A[j]=aux;
                }

            }
        }


    }


 public void burbujaMayor(){
        int i, j, aux, N;

        for(i=1;i<A.length;i++){
            for(j=0;j<A.length-1;j++){
                if((A[j+1])<(A[j])){
                    aux=A[j+1];
                    A[j+1]=A[j];
                    A[j]=aux;
                }

            }
        }


    }

public void ShellsortV2()
{
   int intervalo, tamArreglo;
   Metodos metodoInsercion= new Metodos();
   intervalo=A.length;
   while(intervalo>1)
   {
       intervalo=intervalo/2;
       tamArreglo=A.length/intervalo;
       int aux2[]=new int[tamArreglo];
       for(int subgrupos=0; subgrupos<(A.length/tamArreglo);subgrupos++)
       {
           for(int j=0;j< tamArreglo;j++)
           {
           }
       }
   }
}

}
