package instance_static;

/*
 * �ν��Ͻ� ���� ����
 */

public class Car {
	//�ʵ�(�ν��Ͻ� ������) - ��ü�� �����ؾ� ����� �� �ִ� ������ �̶�� ��
	String model;
	int speed;
	
	//������
	Car(String model) {
		this.model = model;
	}
	
	// �޼ҵ�
	void setSpeed(int speed) {
		this.speed = speed;
	}
	
	void run() {
		for(int i = 10; i<=50; i+=10) {
			setSpeed(i);
			System.out.println(this.model + "�� �޸��ϴ�.(�ü�:"+this.speed+"km/h)");
		}
	}

}
