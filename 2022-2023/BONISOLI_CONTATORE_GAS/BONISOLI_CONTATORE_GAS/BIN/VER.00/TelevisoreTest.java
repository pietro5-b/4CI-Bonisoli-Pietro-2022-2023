

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * The test class TelevisoreTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class TelevisoreTest
{
    public static void main(String[] args) {
       
        int pollici;
        String schermo;
        String colore;
        int canale;
        int volume;
        int luminos;
        boolean acceso;
        
        Televisore t1 = new Televisore(10, "plasma", "a colori", 4, 15, 50, false);
        Televisore t2 = new Televisore(5, "plasma", "a colori", 4, 15, 50, true);
       
        
         System.out.println("Pollici primo televisore: " + t1.getPollici());
        System.out.println("Pollici secondo televisore: " + t2.getPollici()+"\n");

        System.out.println("Schermo primo televisore: " + t1.getSchermo());
        System.out.println("Schermo secondo televisore: " + t2.getSchermo()+"\n");
       
        System.out.println("Colore primo televisore: " + t1.getColore());
        System.out.println("Colore secondo televisore: " + t2.getColore()+"\n");
       
        System.out.println("Canale primo televisore: " + t1.getCanale());
        System.out.println("Canale secondo televisore: " + t2.getCanale()+"\n");
       
        System.out.println("Volume primo televisore: " + t1.getVolume());
        System.out.println("Volume secondo televisore: " + t2.getVolume()+"\n");
       
        System.out.println("Luminosità  primo televisore: " + t1.getLuminos());
        System.out.println("Luminosità  secondo televisore: " + t2.getLuminos()+"\n");
       
        
         if (t1.getAcceso()) {
            System.out.println("Televisore n1 é acceso");
        } else {
            System.out.println("Televisore n1 é spento");
        }
       
        if (t2.getAcceso()) {
            System.out.println("Televisore n2 é acceso");
        } else {
            System.out.println("Televisore n2 é spento\n");
        }
       
       
       
        t1.spegni();
        if (t1.getAcceso()) {
            System.out.println("Televisore 1 é acceso");
        } else {
            System.out.println("Televisore 1 é spento");
        }
       
        t1.accendi();
        if (t1.getAcceso()) {
            System.out.println("Televisore 1 é acceso");
        } else {
            System.out.println("Televisore 1 é spento");
        }
       
       
       
        t1.aumentaCanale();
        System.out.println("\nIl numero del canale e'¨ aumentato di 1: " + t1.getCanale());
       
        t1.diminuisciCanale();
        System.out.println("Il numero del canale e'¨ diminuito di 1: " + t1.getCanale());
       
       
       
        t1.aumentaVolume();
        System.out.println("\nIl volume é aumentato di 1: " + t1.getVolume());
       
        t1.diminuisciVolume();
        System.out.println("Il volume é diminuito di 1: " + t1.getVolume());
       
       
       
        t1.aumentaLuminos();
        System.out.println("\nLa luminosità  é aumentata di 1: " + t1.getLuminos());
       
        t1.diminuisciLuminos();
        System.out.println("La luminosità  é diminuita di 1: " + t1.getLuminos());
   
    }

}  
    
