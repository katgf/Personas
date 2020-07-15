/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package personas;

/**
 *
 * @author Admin
 */
public abstract class Personas {
 
 private String Nombre;
 private int AñoNacimiento;
 private String Profesion;
 private String TipoSangre;

    public Personas() {
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public int getAñoNacimiento() {
        return AñoNacimiento;
    }

    public void setAñoNacimiento(int AñoNacimiento) {
        this.AñoNacimiento = AñoNacimiento;
    }

    public String getProfesion() {
        return Profesion;
    }

    public void setProfesion(String Profesion) {
        this.Profesion = Profesion;
    }

    public String getTipoSangre() {
        return TipoSangre;
    }

    public void setTipoSangre(String TipoSangre) {
        this.TipoSangre = TipoSangre;
    }
 
 
 abstract String Especialidad();
 
 abstract double CalcularPago(int horasTrabajadas);
 
 
    public String calcularEdad(int añoActual){
            int edad = añoActual-AñoNacimiento;
            
            return "Este año lo terminaras con "+edad+ " años de edad";
        }
    
}
