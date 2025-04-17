/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/

public class Main
{
	public static void main(String[] args) {
		Offering Offering= new Coffee();
		Offering=new Rum(Offering);
		Offering=new Rum(Offering);
		
		System.out.println(Offering.getName()+" "+Offering.getPrice());
	}
}