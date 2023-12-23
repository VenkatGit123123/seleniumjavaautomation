package org.javaprograms.oopsAbstraction;

public abstract class Bike {
	
	public void handle()
	{
		System.out.println("Bikes have Handle");
	}
	
	public void seat()
	{
		System.out.println("Bikes have Seat");
	}
	
	public abstract void engine();
	
	public abstract void wheels();

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HeroHonda obj = new HeroHonda();
		obj.engine();
		obj.wheels();
		
		

	}

}
