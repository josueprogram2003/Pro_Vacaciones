
package Interfaces;

import Modelo.Barco;
import java.util.List;


public interface CRUD_barco {

    public List SelectBarco();
    public boolean InsertBarco(Barco b);
    public boolean DeleteBarco(String matricula_b);
    public boolean UpdateBarco(Barco b);
    public List SearchBarco(String matricula_b);
    
}
