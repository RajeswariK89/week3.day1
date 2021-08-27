package week3.day1;

public class Calculator {

	public void add(int n1, int n2) {
		int addres1 = n1 + n2;
		System.out.println("Method1 Addition : " + addres1);

	}

	public void add(int n1, int n2, int n3) {
		int addres2 = n1 + n2 + n3;
		System.out.println("Method2 Addition :" + addres2);

	}

	public void sub(int n1, int n2) {
		int subres1 = n1 - n2;
		System.out.println("Method1 Subtracction :" + subres1);

	}

	public void sub(int n1, int n2, int n3) {
		int subres2 = (n1 - n2) - n3;
		System.out.println("Method2 Subtracction :" + subres2);
	}

	public void mul(double n1, double n2) {
		double mulres1 = n1 * n2;
		System.out.println("Method1 Multtipliction:" + mulres1);

	}

	public void mul(double n1, double n2, double n3) {
		double mulres2 = n1 * n2 * n3;
		System.out.println("Method2 Multiplication:" + mulres2);
	}

	public void divide(float n1, float n2) {
		float divres1 = n1 / n2;
		System.out.println("Metnod1 Division :" + divres1);

	}

	public void divide(float n1, float n2, float n3) {
		float divres2 = (n1 / n2) / n3;
		System.out.println("Method2 Division:" + divres2);

	}

	public static void main(String[] args) {

		Calculator calcObj = new Calculator();
		calcObj.add(10, 20);
		calcObj.add(10, 20, 30);
		calcObj.sub(20, 10);
		calcObj.sub(30, 20, 10);
		calcObj.mul(10, 20);
		calcObj.mul(10, 20, 30);
		calcObj.divide(20, 10);
		calcObj.divide(20, 10, 2);

	}

}
