package java_6_Esercizio3Login;

public final class CredenzialiErrate extends EsitoLogin{
	private String credenzialiErrate;
	
	public CredenzialiErrate(String credenzialiErrate) {
		this.credenzialiErrate = credenzialiErrate;
	}
	
	public String credenzialiErrate() {
		return credenzialiErrate;
	}
}
