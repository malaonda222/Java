package java_6_Esercizio3Login;

public sealed abstract class EsitoLogin
	permits LoginRiuscito, CredenzialiErrate, UtenteBloccato{}
