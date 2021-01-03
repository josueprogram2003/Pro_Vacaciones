
package Modelo;


public class Salida {

    int id;
    String matricula;
    String dni;
    String fecha_s;
    String fecha_v;

    public Salida(int id, String matricula, String dni, String fecha_s, String fecha_v) {
        this.id = id;
        this.matricula = matricula;
        this.dni = dni;
        this.fecha_s = fecha_s;
        this.fecha_v = fecha_v;
    }

    public Salida() {
    }

    public Salida(String matricula, String dni, String fecha_s, String fecha_v) {
        this.matricula = matricula;
        this.dni = dni;
        this.fecha_s = fecha_s;
        this.fecha_v = fecha_v;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getFecha_s() {
        return fecha_s;
    }

    public void setFecha_s(String fecha_s) {
        this.fecha_s = fecha_s;
    }

    public String getFecha_v() {
        return fecha_v;
    }

    public void setFecha_v(String fecha_v) {
        this.fecha_v = fecha_v;
    }
    
    
}
