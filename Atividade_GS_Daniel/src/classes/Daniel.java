package classes;

public class Daniel {

	private int num1, num2, num3;
	
	public Daniel() {
		
	}
	
	public void somar(int n1, int n2) {
		setNum3(n1 + n2);
	}

	public int getNum1() {
		return num1;
	}

	public void setNum1(int num1) {
		this.num1 = num1;
	}

	public int getNum2() {
		return num2;
	}

	public void setNum2(int num2) {
		this.num2 = num2;
	}

	public int getNum3() {
		return num3;
	}

	public void setNum3(int num3) {
		this.num3 = num3;
	}
	
}
