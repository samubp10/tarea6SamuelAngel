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
import java.time.MonthDay;
import java.time.YearMonth;

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
        
        /* EJEMPLO CON LA CLASE MONTHDAY */
        // Sólo guarda el día y el mes (no el año)
        LocalDate diaAnda = LocalDate.of(1976, Month.FEBRUARY, 28);
        
        MonthDay diaMesAndalucia = MonthDay.of(diaAnda.getMonth(), diaAnda.getDayOfMonth());
        MonthDay diaMesHoy = MonthDay.from(LocalDate.now());
        
        if (diaMesAndalucia.equals(diaMesHoy)){
            System.out.println("Hoy es el día de Andalucía");
            
        }
         
        /* EJEMPLO CON LA CLASE YEARMONTH */
        // Sólo guarda el año y el mes (no el día)
        
        YearMonth caducidadTarjeta = YearMonth.of(2019, Month.MARCH);
        System.out.println("Su tarjeta caduca en " + caducidadTarjeta);
        YearMonth actual = YearMonth.from(LocalDate.now());
        
        if (caducidadTarjeta.isBefore(actual)){
            System.out.println("Su tarjeta ha caducado");
        }
        
        
    }
    
}
