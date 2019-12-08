package com.class31;

public interface Bank {
void haveChecking();
void haveSavings();

}
interface Trustable{
	void trust();
	
}
class BOA  extends Finance implements Bank, Trustable{

	@Override
	public void haveChecking() {
		System.out.println("BOA has a checking account");
		
	}

	@Override
	public void haveSavings() {
		System.out.println("BOA has a savings account");
		
	}

	@Override
	public void trust() {
		System.out.println("you can trust BOA with your money");
		
	}
	
}
class CapitalOne extends Finance  implements Bank, Trustable{

	@Override
	public void haveChecking() {
		System.out.println("Cpital Bank has a checking account");
		
	}

	@Override
	public void haveSavings() {
		System.out.println("Capital Bank  has a saving account");
		
	}

	@Override
	public void trust() {
		
		System.out.println("you can trust Capital bank with your money");
	}
	
}

class Finance{
	public void financing() {
		System.out.println("financial transaction must happen");
	}
}
class CapitalOneChild extends CapitalOne{
	
}