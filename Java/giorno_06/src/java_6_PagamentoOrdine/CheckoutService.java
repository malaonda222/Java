package java_6_PagamentoOrdine;


public class CheckoutService {

    public Checkout stampaDettagli(
            ClienteDto cliente,
            double importo,
            MetodoPagamento metodo) {

        // Creazione dell'oggetto risultato
        Checkout risultato = new Checkout(cliente, importo, metodo);

        // Eventuale log o stampa
        System.out.println("Cliente: " + cliente);
        System.out.println("Importo: " + importo);
        System.out.println("Metodo di pagamento: " + metodo);

        return risultato;
    }
}
