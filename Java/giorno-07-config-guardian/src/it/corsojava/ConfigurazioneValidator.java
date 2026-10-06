package it.corsojava;

public class ConfigurazioneValidator {
	public void valida(ConfigurazioneApp conf) throws ConfigurazioneNonValidaException {
		
		if(conf.getNomeApplicazione() == null || conf.getNomeApplicazione().isBlank()) {
			throw new ConfigurazioneNonValidaException("Nome applicazione non valida!");
		}
		if(conf.getVersione() == null ||conf.getVersione().isBlank()) {
			throw new ConfigurazioneNonValidaException("Versione non valida!");
		}
		if(conf.getAmbiente() == null) {
			throw new ConfigurazioneNonValidaException("Ambiente non può essere null");
		}
		String ambiente = conf.getAmbiente().toUpperCase();
		if(!ambiente.equals("DEV") &&
			!ambiente.equals("TEST") &&
			!ambiente.equals("PROD")) {
				throw new ConfigurazioneNonValidaException("Ambiente non valido!");
		}
		if(conf.getPorta() < 1024 || conf.getPorta() > 65535) {
			throw new ConfigurazioneNonValidaException("Porta non valida");
		}
	}
}
