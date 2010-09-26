/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package ordenamientos;

import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author josue
 */
public class MezclaNatural {

public void mezclaEquilibrada(String F,String F1,String F2,String F3)throws IOException
{
  boolean band;
  String inLineF1="", inLineF3="";
particionInicial(F,F2,F3);
band = true;
do{
if(band){
particionFusion(F2,F3,F,F1);
band = false;
}
else{
particionFusion(F,F1,F2,F3);
band = true;
}

FileReader fr1=new FileReader(F1);
BufferedReader br1=new BufferedReader(fr1);
FileReader fr3=new FileReader(F3);
BufferedReader br3=new BufferedReader(fr3);

inLineF1 = br1.readLine();
inLineF3 = br3.readLine();

br1.close();
br3.close();

} while (inLineF1 != null || inLineF3 != null);


}

public void particionInicial(String F,String F2,String F3) throws IOException{
int aux = 0,R;
boolean band;
String inLine="";

FileReader fr=new FileReader(F);
BufferedReader br=new BufferedReader(fr);

FileWriter fw2 = new FileWriter (F2);
      BufferedWriter bw2 = new BufferedWriter(fw2);
      PrintWriter pw2 = new PrintWriter(bw2);

FileWriter fw3 = new FileWriter (F3);
BufferedWriter bw3 = new BufferedWriter(fw3);
PrintWriter pw3 = new PrintWriter(bw3);

inLine=br.readLine();
R=Integer.parseInt(inLine);
pw2.println(R);
band=true; aux=R;
while((inLine=br.readLine())!=null){
  ///inLine=br.readLine();
  R=Integer.parseInt(inLine);
  if(R>=aux)
  {
    aux=R;
    if(band==true){
        pw2.println(R);
    }else{ pw3.println(R);}


  }else{
      aux=R;
      if(band==true){
          pw3.println(R);
          band=false;
      }else
      {
          pw2.println(R);
          band=true;
      }
  }
}
pw2.close();
pw3.close();
     
}

public void particionFusion(String FA,String FB,String FC,String FD) throws IOException{
int R1=0,R2=0,aux;
boolean b,dele1,dele2;
String inLineB="",inLineA="";

FileReader fra=new FileReader(FA);
BufferedReader bra=new BufferedReader(fra);

FileReader frb=new FileReader(FB);
BufferedReader brb=new BufferedReader(frb);

FileWriter fwc = new FileWriter (FC);
      BufferedWriter bwc = new BufferedWriter(fwc);
      PrintWriter pwc = new PrintWriter(bwc);

FileWriter fwd = new FileWriter (FD);
BufferedWriter bwd = new BufferedWriter(fwd);
PrintWriter pwd = new PrintWriter(bwd);

b=true;
inLineA=bra.readLine();
inLineB=brb.readLine();
if(inLineA!=null){
R1=Integer.parseInt(inLineA);}
if(inLineB!=null){
R2=Integer.parseInt(inLineB);}

    if(R1<R2)
    {
        aux=R1;
    }else
    {
    aux=R2;
    }

dele1=false; dele2=false;

while(((inLineA!=null) || (dele1!=true)) &&((inLineB!=null) || (dele2!=true)))
{//8.1
     
    if(dele1==true)
    {
        inLineA=bra.readLine();
        ///SI falla checar aqui
       
    if(inLineA!=null){
R1=Integer.parseInt(inLineA);}
        //R1=Integer.parseInt(inLineA);
        dele1=false;
    }
    //8.3
   
    if(dele2==true)
    {///Si falla checar
        inLineB=brb.readLine();
        if(inLineB!=null){
            R2=Integer.parseInt(inLineB);}
        //R2=Integer.parseInt(inLineB);
       

        dele2=false;
    }
    //8.5
    if(R1<R2)
    {
        if(R1>=aux)
        {
            aux=this.ayuda1(aux, R1, pwc, pwd, b);
            dele1=true;
            //8.5.1.1
        }else if(R2>=aux)
        {
            aux=this.ayuda1(aux, R2, pwc, pwd, b);
            dele2=true;
        }else
        {
            aux=ayuda2(aux, R1, pwc, pwd, b);
            b=cambio(b);
            
            dele1=true;
        }
    }else
    {//8.5.3
        if(R2>=aux)
        {
         aux=this.ayuda1(aux, R2, pwc, pwd, b);
         dele2=true;
        }else if(R1>=aux)
        {
            aux=this.ayuda1(aux, R1, pwc, pwd, b);
            dele1=true;
        }
        else
        {
         aux=ayuda2(aux, R2, pwc, pwd, b);
         b=cambio(b);
         
         dele2=true;
        }
    }
}
//10
if(dele1==true && inLineA==null)
{
ayuda3(aux,R2,brb,pwc,pwd,b);
}

if(dele2==true && inLineB==null)
{
    ayuda3(aux,R1,bra,pwc,pwd,b);
}

pwc.close();
pwd.close();
}

public int ayuda1(int aux,int R,PrintWriter pwc ,PrintWriter pwd,boolean b) throws IOException
{
  

    aux=R;

    if(b==true)
    {
        pwc.println(R);
    }else
    {
        pwd.println(R);
    }

    return aux;
    
}
public int ayuda2(int aux,int R,PrintWriter pwc,PrintWriter pwd,boolean b) throws IOException
{
     

    aux=R;
    if(b==true)
    {
        pwd.println(R);
        b=false;
    }else
    {
        pwc.println(R);
        b=true;
    }
 

    return aux;
}
public void ayuda3(int aux,int R,BufferedReader br,PrintWriter pwc,PrintWriter pwd, boolean b) throws IOException
{

String inLine="";
    if(R>=aux)
    {
        this.ayuda1(aux, R, pwc, pwd, b);
    }else
    {
        ayuda2(aux, R, pwc, pwd, b);
        ///b=cambio(b);
    }

    while((inLine=br.readLine())!=null)
    {
    
     R=Integer.parseInt(inLine);
     if(R>=aux)
     {
        this.ayuda1(aux, R, pwc, pwd, b);
     }else
     {
         aux=ayuda2(aux, R, pwc, pwd, b);
         //b=cambio(b);
     }
    }
}

public boolean cambio(boolean b)
{
    boolean B;
    if(b==true)
    {
        B=false;
    }else
    {
        B=true;
    }
    return B;
}
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         String F = "F.txt", f1 = "F1.txt", f2 = "F2.txt",f3="F3.txt";
        MezclaNatural mNatural=new MezclaNatural();
        try {
            mNatural.mezclaEquilibrada(F, f1, f2, f3);
            // TODO code application logic here
        } catch (IOException ex) {
            Logger.getLogger(MezclaNatural.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
