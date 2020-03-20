/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fecha;

import java.text.ParseException;
import java.util.Calendar;

/**
 *
 * @author oncel
 */
public class Fecha {

    /**
     * @param args the command line arguments
     */
    
    public static void fechaHabil(Calendar fecha, int dias) throws ParseException{
        
         int dia =fecha.get(Calendar.DAY_OF_MONTH) ;
         if (validarFecha(fecha)) {
            for (int i = 0; i < dias; i++) {
            
            }
        }else{
             System.out.println("la fecha no puede ser menor a la actual");
         }
        
         System.out.println(dia);
    }
    public static boolean validarFecha(Calendar fecha){
        Calendar fechaActual = Calendar.getInstance();
        if (fechaActual.before(fecha)) {
            return true;
        }
        return false;
    }
    public static void main(String[] args) {
        // TODO code application logic here
         try {
            Calendar c1 = Calendar.getInstance();
        c1.set(2020, 2, 10);
            fechaHabil(c1, 2);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    
}
