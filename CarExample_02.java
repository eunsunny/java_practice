
class Car {
	// �ʵ�
	String company = "�����ڵ���";
	String model = "�׷���";
	String color = "���";
	int maxSpeed = 250;
	int speed;
}

public class CarExample_02 {  // �ۺ� �پ��ִ°��� Ŭ�������ϸ��̶� �����ؾ���, �ٸ� Ŭ���� �߰��� �ۺ� �ȵ��� ������ �������

	public static void main(String[] args) {  // Ŭ������ �����ϴ� ���̰� ������ �ϳ��� ���� ��
		// ��ü����(�ν��Ͻ��� �����Ѵ�)
		Car myCar = new Car();  // Ŭ���� ���� = ������
		
		// �ʵ��� �Ӽ� �б�
		System.out.println("����ȸ��: " + myCar.company);
		System.out.println("�𵨸�: " + myCar.model);
		System.out.println("����: " + myCar.color);
		System.out.println("�ְ�ӵ�: " + myCar.maxSpeed);
		System.out.println("����ӵ�: " + myCar.speed);
			
		myCar.speed = 60;
		System.out.println("������ �ӵ�: " + myCar.speed);

	}

}
