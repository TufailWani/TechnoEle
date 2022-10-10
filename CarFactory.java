package com.te.traininng;
import java.util.Scanner;

public class CarFactory {
	public static Car getCar() {
		System.out.println("Enter car name");
		Scanner sc=new Scanner(System.in);
		String carName=sc.next();
		if(carName.equalsIgnoreCase("audi")){
			return new Audi();
		}
			else if(carName.equalsIgnoreCase("bmw"))
			{
				return new Bmw();
			
		}
		return null;
		
	}

}
