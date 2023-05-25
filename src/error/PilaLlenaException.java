package error;

public class PilaLlenaException extends Exception {

	private String texto;
	
	public PilaLlenaException(String texto) {
		
		this.texto= texto;
	}
	
}
