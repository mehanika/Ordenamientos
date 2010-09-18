/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package ordenamientos;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;

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
        particiona(F,F1,F2,part);
        fusiona(F,F1,F2,part);
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
              if(inLine != null){
                  pw.println(inLine);}
              k++;
          }
          l=0;
          while( l < part){
              inLine = br.readLine();
              if(inLine != null){
                  pw1.println(inLine);}
              l++;
          }
      }
      pw.close();
      pw1.close();
    }

    private void fusiona(String F, String F1, String F2, int part)  throws IOException{
    int R1=0,R2=0,k=0,l = 0;
    boolean B1,B2;
        //Abriendo Archivo F para escritura
    FileWriter fw = new FileWriter (F);
      BufferedWriter bw = new BufferedWriter(fw);
      PrintWriter pw = new PrintWriter(bw);
      //Abriendo f1 para lectura
      FileReader fr1 = new FileReader(F1);
      BufferedReader br1 = new BufferedReader(fr1);
      //Abriendo f2 para lectura
      FileReader fr2 = new FileReader(F2);
      BufferedReader br2 = new BufferedReader(fr2);
      //PASO 3
      B1=true; B2=true;
       String inLine="",inLine2="";
       //PASO 4
       inLine=br1.readLine();
      if(inLine!=null)
      {
        
          R1=Integer.parseInt(inLine);
          B1=false;
      }
      ///PASO 6
       inLine2=br2.readLine();
       if(inLine2!=null)
       {
        R2=Integer.parseInt(inLine2);
        B2=false;
       }
       //PASO 8
       while((inLine!=null || B1==false) && (inLine2!=null || B2==false))
       {
           k=0; l=0;
           while((k<part && B1==false) &&(l<part && B2==false))
           {    //8.1.1
               if(R1<=R2)
               {
                   pw.println(R1);
                   B1=true; k++;
                   //8.1.1.1
                   inLine=br1.readLine();
                  
                   if(inLine!=null)
                   {
                        R1 = Integer.parseInt(inLine);
                       B1=false;
                   }
                   //8.1.1.2
               }
               else
                   {
                       pw.println(R2);
                       B2=true; l++;
                   
                   //8.1.1.3
                   inLine2=br2.readLine();
                   
                   if(inLine2!=null)
                   {
                       R2=Integer.parseInt(inLine2);
                       B2=false;
                   }
               }
           }//fin While
       
       
       //paso 8.3
       if(k<part)
          // 8.3.1
       {
           while((k<part)&&(B1==false))
        {
            pw.println(R1);
            B1=true;
            k++;
            //8.3.1.1
            inLine=br1.readLine();
            if(inLine!=null)
            {
                
                R1=Integer.parseInt(inLine);
                B1=false;
            }
        }
       }
       //8.5
       if(l<part)
       {
           while(l<part && B2==false)
           {
               pw.println(R2);
               B2=true;
               l++;
               //8.5.1.1
               inLine2=br2.readLine();
               if(inLine2!=null)
               {
                   
                   R2=Integer.parseInt(inLine2);
                   B2=false;
               }
           }
       }
    }//FIN paso 8
       if(B1==false)
           pw.println(R1);
       if(B2==false)
           pw.println(R2);
       //PASO 14
       while(inLine!=null)
       {
           
           R1=Integer.parseInt(inLine);
            pw.println(R1);
            inLine=br1.readLine();
       }
       //16
       while(inLine2!=null)
       {
           
           R2=Integer.parseInt(inLine2);
            pw.println(R2);
            inLine2=br2.readLine();
        }
       br1.close();
       br2.close();
        pw.close();
  }


    public static void main(String args[]){

        String F = "F.txt", f1 = "F1.txt", f2 = "F2.txt";
        MezclaDirecta mDirecta = new MezclaDirecta();
        try {
            mDirecta.MezclaDirectamente(F, f1, f2);
///AWW
        } catch (IOException ex) {
            Logger.getLogger(MezclaDirecta.class.getName()).log(Level.SEVERE, null, ex);
        }
///AWW



    }



}
