
package Interfaces;

import Modelo.Salida;
import java.util.List;


public interface CRUD_salida {
    
    public List SelectSalida();
    public boolean InsertSalida(Salida s);
    public boolean DeleteSalida(int id);
    public boolean UpdateSalida(Salida s);
    public List SearchSalida(int id);
}
