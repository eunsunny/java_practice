package final_field;

class Circle {
	static final double PI = 3.141592;  // ���(�ٸ� ������ ������ ���� ���� �̸��� �빮�ڷ� ����
	double radius;
	
	public Circle(double radius) {
		this.radius = radius;
	}
	
}

public class StaticFinalExample {

	public static void main(String[] args) {
		Circle c1 = new Circle(3.0);
		
		// c1 ���� ���� ���
		double area = Circle.PI * c1.radius * c1.radius;
		
		

	}

}
