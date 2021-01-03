
package Interfaces;

import Modelo.Patron;
import java.util.List;


public interface CRUD_patron {
  
   public List SelectPatron();
   public boolean InsertPatron(Patron p);
   public boolean DeletePatron(String dni_p);
   public List SearchPatron(String dni_p);
   public boolean UpdatePatron(Patron p);
}
