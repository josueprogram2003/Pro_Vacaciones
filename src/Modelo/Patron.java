
package Modelo;

public class Patron {
   
   String dni_p;
   String nombre_p;
   String apellido_pp;
   String apellido_pm;

    public Patron(String dni_p, String nombre_p, String apellido_pp, String apellido_pm) {
        this.dni_p = dni_p;
        this.nombre_p = nombre_p;
        this.apellido_pp = apellido_pp;
        this.apellido_pm = apellido_pm;
    }

    public Patron() {
    }

    public Patron(String nombre_p, String apellido_pp, String apellido_pm) {
        this.nombre_p = nombre_p;
        this.apellido_pp = apellido_pp;
        this.apellido_pm = apellido_pm;
    }

    public String getDni_p() {
        return dni_p;
    }

    public void setDni_p(String dni_p) {
        this.dni_p = dni_p;
    }

    public String getNombre_p() {
        return nombre_p;
    }

    public void setNombre_p(String nombre_p) {
        this.nombre_p = nombre_p;
    }

    public String getApellido_pp() {
        return apellido_pp;
    }

    public void setApellido_pp(String apellido_pp) {
        this.apellido_pp = apellido_pp;
    }

    public String getApellido_pm() {
        return apellido_pm;
    }

    public void setApellido_pm(String apellido_pm) {
        this.apellido_pm = apellido_pm;
    }
   
   
}
