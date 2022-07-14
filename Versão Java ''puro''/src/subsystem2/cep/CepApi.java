package subsystem2.cep;

public class CepApi {
	private static CepApi instance = new CepApi();

	private CepApi() {
		super();
	}

	public static CepApi getInstance() {
		return instance;
	}
	
	public String recoverCity(String cep) {
		return "PTN";
	}
	
	public String recoverState(String cep) {
		return "BA";
	}
}