package it.corso.Mavenn;

import java.time.LocalDate;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) {
        System.out.println( "Hello World!" );
        
        ScontoService scontoService = new ScontoService();
        double risultato = scontoService.applicaSconto(100, 0.20);
        System.out.println("Prezzo scontato: " + risultato);
        
        DateUtils dateUtils = new DateUtils();
        LocalDate oggi = LocalDate.now();
        LocalDate scadenza = LocalDate.of(2026, 5, 28);
        long giorni = dateUtils.giorniAllaScadenza(oggi, scadenza);
        System.out.println("Giorni alla scadenza: " + giorni);
        
    }   
}
