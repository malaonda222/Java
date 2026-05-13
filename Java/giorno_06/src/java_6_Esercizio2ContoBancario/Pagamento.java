package java_6_Esercizio2ContoBancario;

public sealed abstract class Pagamento permits Carta, Paypal, Bonifico {}
