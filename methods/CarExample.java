package methods;

class Car {
	// �ʵ�
	int speed;
	
	// ������
	
	//�޼ҵ�, �޼ҵ�� ���� � ����� �ʿ��ϳĿ� ���� �߰� �� �̸� ����
	void keyTurnOn() {  // ���ϰ��� ����
		System.out.println("�õ��� �̴ϴ�.");
	}
	
	// ���� �ӵ����� ����ϴ�.
	int getSpeed() {
		return speed; // ���(�ʵ�)�� �ִ� ���� ������
		
	}
	
	void run() {
		for(int i=0; i<=50; i+=10) {
			speed = i;
			System.out.printf("�ڵ����� �޸��ϴ�. (�ü�: %dkm/h)\n", speed);
		}
	}
}

public class CarExample {

	public static void main(String[] args) {
		// Car �ν��Ͻ�(��ü) ����
		Car myCar = new Car();
		
		myCar.keyTurnOn();
		myCar.run(); // �ŰԺ����� ���⋚���� ���� �־��� �ʿ䰡 ����
		
		/*
		// myCar�� ����ӵ�
		int car_speed = myCar.getSpeed();  // �� ���� ������ ���� ���⋚����(���ߺ��صǹ���) int car_speed ���� ������ ���� ���� ����
		System.out.println("����ӵ��� "+car_speed+" km/h");
		*/
		System.out.println("����ӵ��� "+myCar.getSpeed()+" km/h"); // �������� ���� �̷��Ե� ��� ����
	}

}
