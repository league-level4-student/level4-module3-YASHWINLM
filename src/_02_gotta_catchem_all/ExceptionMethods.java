package _02_gotta_catchem_all;

public class ExceptionMethods extends Throwable {
	public double divide(double x, double y) throws IllegalArgumentException{
		double quotient=0;
		quotient= x/y;
		
		if (y==0) {
			throw new IllegalArgumentException();
		}	
		
		
		return quotient;
			
	
	}
	
	public String reverseString(String s) throws IllegalStateException {
		String reverseS="";
		for (int i = s.length(); i >=0; i--) {
			reverseS+=s.charAt(i);
		}
		if (s.equals("")) {
			throw new IllegalStateException();
		}
		
		return reverseS;
		
		
	}
}
