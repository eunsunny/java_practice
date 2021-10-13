package const__overloading;

/*
 * ������ �����ε�
 */
class Car {
	// ����ʵ�
	String company = "�����ڵ���";
	String model;
	String color;
	int maxSpeed;
	
	// ������
	Car() {  // �ŰԺ����� �־����� �ϴܿ��� �ŰԺ����� �־���� ���డ��, �ȳ־����� �ؿ��� �ȳ־����
		//Ŭ���� ���� �ٸ� ������ ȣ��
		this("�ƹ���","���");  // this.�̶� �ٸ�, �ٸ������� ȣ�� ��ɾ� this()
	}
	
	Car(String model) {
		this.model = model;
	}
	
	Car(String model, String color) {
		this.model = model;
		this.color = color;
	}
	
	Car(String model, String color, int maxSpeed) {
		this.model = model;
		this.color = color;
		this.maxSpeed = maxSpeed;
	}
	
	Car(Car car){
		this.model = car.model;
		this.color = car.color;
		this.maxSpeed = car.maxSpeed;
		
	}

	@Override
	public String toString() {
		return "Car [company=" + company + ", model=" + model + ", color=" + color + ", maxSpeed=" + maxSpeed + "]";
	}	
	
}

public class CarExample {

	public static void main(String[] args) {
		Car car1 = new Car();
		System.out.println("car1="+car1.toString());
		
		Car car2 = new Car("�ҳ�Ÿ");
		System.out.println("car2="+car2.toString());
		
		Car car3 = new Car("�׷���", "���");
		System.out.println("car3="+car3.toString());

		Car car4 = new Car("����Ʈ��", "ȸ��", 220);
		System.out.println("car4="+car4.toString());
		
		//�����ڸ� �̿��� �ν��Ͻ� ����
		Car car5 = new Car("�׷���","������",260);
//		Car car6 = new Car("�׷���","������",260);
//		Car car7 = new Car("�׷���","������",260);
		// ���� ���� ��� �Ʒ��� ���� ���
		Car car6 = new Car(car5);
		Car car7 = new Car(car5);
		
		System.out.println("car5="+car5.toString());
		System.out.println("car6="+car6.toString());
		System.out.println("car7="+car7.toString());
	}

}
