package week3.day1;

public class MyPhone {

	public static void main(String[] args) {

		System.out.println("********Mobile Class*************");

		Mobile mobObj = new Mobile();
		mobObj.makeCall();
		mobObj.saveContact();
		mobObj.senddMsg();
	
		System.out.println("******Android Phone Class*******");
		AndroidPhone andpObj = new AndroidPhone();
		andpObj.saveContact();
		andpObj.senddMsg();
		andpObj.makeCall();
		andpObj.takeVideo();
		int noOfPhone = andpObj.noOfPhn;
		System.out.println("No of Phones: " + noOfPhone);
		String brand = andpObj.brand;
		System.out.println("Andriod Phone Brand is :" + brand);
		

		System.out.println("*********SmartPhone Class*********");
		SmartPhone smtpObj = new SmartPhone();
		smtpObj.makeCall();
		smtpObj.saveContact();
		smtpObj.senddMsg();
		String brand2 = smtpObj.brand;
		System.out.println("Smart Phone Brand is :" + brand2);
		char col = smtpObj.color;
		System.out.println("Smart Phone Color is :" + col);
		smtpObj.takeVideo();

	}

}
