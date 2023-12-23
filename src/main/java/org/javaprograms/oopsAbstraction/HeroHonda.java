package org.javaprograms.oopsAbstraction;

public class HeroHonda extends Bike{
	
	@Override
	public void engine()
	{
		System.out.println("Bikes have engine");
	}
	@Override
	public void wheels()
	{
		System.out.println("Bikes have wheels");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HeroHonda objHH = new HeroHonda();
		objHH.engine();
		objHH.seat();
		objHH.wheels();
		objHH.handle();
		

	}

}
