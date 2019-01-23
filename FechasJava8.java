/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javatime;

// Clase para tratar fechas (sólo día, mes y año)
import java.time.LocalDate;
// Enumerado para los meses del año (Enero, ...)
import java.time.Month;

/**
 *
 * @author usuario
 */
public class FechasJava8 {
    
    public static void main(String[] args) {
        
        /* CREACIÓN DE FECHAS Y OBTENCIÓN DE CAMPOS*/
        
        // Fecha actual
        LocalDate hoy = LocalDate.now();
        System.out.println("Hoy es " + hoy);
        
        // Obtener campos individualmente
        System.out.println("El año es " + hoy.getYear());
        System.out.println("El mes es " + hoy.getMonthValue());
        System.out.println("El dia es " + hoy.getDayOfMonth());
        
        // Creación de fechas concretas
        LocalDate nacimientoJose = LocalDate.of(1999, 3, 8);
        System.out.println("Jose es un mentiroso " + nacimientoJose);
        
        LocalDate nacimientoRosa = LocalDate.of(1988, Month.APRIL, 13);
        System.out.println("Rosa también miente " + nacimientoRosa);
        
        /* COMPARACIÓN DE FECHAS */
        System.out.println("Han nacido el mismo día? " + 
                nacimientoRosa.equals(nacimientoJose));
        
        if (nacimientoJose.isAfter(nacimientoRosa)){
            System.out.println("Jose es más joven...o eso dice");
        }
        
        // Método isBefore()
        
        /* EJEMPLO CON LA CLASE MOTHDAY */
        
        
    }
    
}
