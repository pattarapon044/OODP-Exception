package lab.oodp.exception;

public abstract class ArrayException extends Exception {
	
	protected String message;
	
	public ArrayException(String name) {
		message = name;
	}
	
	@Override
	public String getMessage() {
		return "Error : " + message + "!"; 
	}
}
