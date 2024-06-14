package entities;

public class CurrencyConverter {
     public static final double iof = 0.06;
     
	public static double conversion(double price, double dollar) {
	     double x, y, z;
		 x = (price * dollar);
		 y =  x * iof;	
		return z = y + x;
		 
	}
}
