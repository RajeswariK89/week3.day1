package week3.day1;

public class AxisBank extends BankInfo{

	public void bank()
	{
		System.out.println("***Axis Bank Methods***");
	}
	
	public void deposit()
	{
		System.out.println("Overrided Deposit Method in AxisBank Class");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AxisBank  axisObj= new AxisBank();
		System.out.println("***BankInfo Class Methods***");
		axisObj.fixed();
		axisObj.saving();
		axisObj.bank();
		axisObj.deposit();		
}
}
