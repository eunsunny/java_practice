package instance_static;

public class CalculatorExample {

	public static void main(String[] args) {
		Calculator c1 = new Calculator();
		// �������� 5.0�� ���� ���� ���
		c1.setRadius(5.0);
		//���� ������
		System.out.println("PI="+Calculator.pi);
		System.out.println("�������� 5.0�� ���� ����:"+c1.radius*c1.radius*Calculator.pi); 
		//����ƽ ������ �ν��Ͻ��� ���� ����� �� �ִ� ���̱� ������ Ŭ���������� �����ؾ���
		
		Calculator c2 = new Calculator();
		//�������� 7.0�� ���� ����
		c2.setRadius(7.0);
		System.out.println("PI="+Calculator.pi);
		System.out.println("�������� 7.0�� ���� ����:"+c2.radius*c2.radius*Calculator.pi); 
		

	}

}
