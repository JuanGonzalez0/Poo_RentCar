package rentcar;

import java.time.LocalDate;


public class RentCar {
        public static void main(String[] args) {
   
        Auto a1 = new Auto("rj45","147", "blanco", "fiat", 3323);
        Auto a2 = new Auto("rj11","600", "azul", "fiat", 8234);
        
        Cliente c1 = new Cliente(38920208, "messi", 1159304023, "palermo", 23234);
        Cliente c2 = new Cliente(92091293, "marcelo", 1132304922, "villa 1-11-14", 4020); 
        
        Reserva res1 = new Reserva ( c1, LocalDate.of(2023,3,12), LocalDate.of(2023,4,12));
        Reserva res2 = new Reserva ( c2, 20);
        
        res1.agregarAuto(a1);
        res2.agregarAuto(a2);
        
        res1.imprimirTicket();
        res2.imprimirTicket();
        
    }    
}
