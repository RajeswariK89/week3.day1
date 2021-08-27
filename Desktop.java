package org.system;

public class Desktop extends Computer{

	void desktopModel()
	{
		System.out.println("Desktop Model");
	}
		
		public static void main(String[] args) {
			
			Computer comObj = new Computer();
			System.out.println("********Computer Class Output*****");
			comObj.computerModel();
			Desktop desObj = new Desktop();
			System.out.println("********Desktop Class Output*****");
			desObj.computerModel();
			desObj.desktopModel();
			
	}

}
