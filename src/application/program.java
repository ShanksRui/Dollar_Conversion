package application;

import java.util.Locale;
import java.util.Scanner;

import entities.CurrencyConverter;

public class program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
        
		System.out.print("what is the dolar price :");
        double price = sc.nextDouble();
		System.out.print("How many dollars will be  bought ?");
        double dollar = sc.nextDouble();
        
        double z = CurrencyConverter.conversion(price, dollar);
        System.out.printf(" amount to be paid in reais = %.2f",z);
	}

}
