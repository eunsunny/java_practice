package overloading;

public class CalculatorExample {

	public static void main(String[] args) {
		Calculator myCalc = new Calculator();
		
		// ���簢���� ���̸� ���Ѵ�
		double result1 = myCalc.areaRectangle(10.0);
		System.out.println("���簢���� ���̴� "+result1+"�Դϴ�.");
		
		//���簢���� ����
		double result2 = myCalc.areaRectangle(10.0, 20.0);
		System.out.println("���簢���� ���̴� "+result2+"�Դϴ�.");
		
		

	}

}
