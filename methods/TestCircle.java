package methods;

class Circle {

	private double redius = 1.0;
	private String color = "red";

	Circle() { }

	Circle(double redius, String color) { // �ʱⰪ���� �����ϰڴٴ� �ǹ�
		this.redius = redius;
		this.color = color;
	}

	double getRadius() {
		return redius;		
	}
	// ���� ���� ���ϱ�
	double getArea() {
		double area = redius * redius * 3.14;
		return area;
	}		
}

public class TestCircle {

	public static void main(String[] args) {
		Circle circle = new Circle();

//		circle.getRadius();
//		circle.getArea();

		System.out.println("�������� = "+circle.getRadius());
		System.out.println("���̴� = "+circle.getArea());	
		
		Circle c2 = new Circle(5, "blue");
		
		System.out.println("�������� = "+c2.getRadius());
		System.out.println("���̴� = "+c2.getArea());	

	}
}
