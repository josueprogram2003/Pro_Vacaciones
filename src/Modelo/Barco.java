package Modelo;



public class Barco {
private int matricula_b;
private String nombre_b;
private int n_amarre;
private int cuota;
    
    public Barco(){
    }

    public Barco(int matricula_b, String nombre_b, int n_amarre, int cuota) {
        this.matricula_b = matricula_b;
        this.nombre_b = nombre_b;
        this.n_amarre = n_amarre;
        this.cuota = cuota;
    }

    public Barco(String nombre_b, int n_amarre, int cuota) {
        this.nombre_b = nombre_b;
        this.n_amarre = n_amarre;
        this.cuota = cuota;
    }

    
    
    public int getMatricula_b() {
        return matricula_b;
    }

    public void setMatricula_b(int matricula_b) {
        this.matricula_b = matricula_b;
    }

    public String getNombre_b() {
        return nombre_b;
    }

    public void setNombre_b(String nombre_b) {
        this.nombre_b = nombre_b;
    }

    public int getN_amarre() {
        return n_amarre;
    }

    public void setN_amarre(int n_amarre) {
        this.n_amarre = n_amarre;
    }

    public int getCuota() {
        return cuota;
    }

    public void setCuota(int cuota) {
        this.cuota = cuota;
    }

   

}
