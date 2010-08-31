/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package ordenamiento;

/**
 *
 * @author josue
 */
public class Persona implements Comparable {
    private int edad;
    private double sueldo;
    private String nombres, apellidoM,apellidoP;

    public String getApellidoM() {
        return apellidoM;
    }

    public void setApellidoM(String apellidoM) {
        this.apellidoM = apellidoM;
    }

    public String getApellidoP() {
        return apellidoP;
    }

    public void setApellidoP(String apellidoP) {
        this.apellidoP = apellidoP;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    public int compareTo(Object o) {
        //para comparar nombres
        
        //Para comparar edades
        return this.edad-((Persona)o).getEdad();
        //throw new UnsupportedOperationException("Not supported yet.");
    }

    public String toString()
    {
        return this.nombres+" "+this.apellidoM+" "+this.apellidoP+" "+this.edad+" "+this.sueldo;
    }
}
