package _01_introduction;

public class CustomException extends Throwable {
	public void terminate() {
		System.exit(0);
		
	}
}
