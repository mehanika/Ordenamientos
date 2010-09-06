/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package ordenamientos;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.*;

/**
 *
 * @author josue
 */
public class MezclaDirecta {

    public int numeroElementos(String F) throws IOException {
        int n =0;

        FileReader fr= new FileReader(F);
        BufferedReader br = new BufferedReader(fr);
        String inLine = "";

        while(inLine != null){
            inLine = br.readLine();
            n++;
        }
        return n;
    }

    public void MezclaDirectamente(String F,String F1, String F2) throws IOException{
        int n =0, part = 1;
        n = numeroElementos(F);
    while(part < n){
        particiona(F,F1,F2,n);
        fusiona(F,F1,F2,n);
        part = part * 2;
    }

    }


 private void particiona(String F, String F1, String F2, int part)  throws IOException{
      int k,l;
      FileReader fr = new FileReader(F);
      BufferedReader br = new BufferedReader(fr);

      FileWriter fw = new FileWriter (F1);
      BufferedWriter bw = new BufferedWriter(fw);
      PrintWriter pw = new PrintWriter(bw);

      FileWriter fw1 = new FileWriter (F2);
      BufferedWriter bw1 = new BufferedWriter(fw1);
      PrintWriter pw1 = new PrintWriter(bw1);

      String inLine="";

      while(inLine !=null){
          k=0;
          while(k < part){
              inLine = br.readLine();
              if(inLine != null)
                  pw.println(inLine);
              k++;
          }
          l=0;
          while( 1 < part){
              inLine = br.readLine();
              if(inLine != null)
                  pw1.println(inLine);
              l++;
          }
      }
      pw.close();
      pw1.close();
    }

    private void fusiona(String F, String F1, String F2, int n)  throws IOException{

    }


    public static void main(String args[]){

        String F = "F.txt", fi = "F1.txt", f2 = "F2.txt";
        MezclaDirecta mDisrecta = new MezclaDirecta();
///AWW



    }



}
