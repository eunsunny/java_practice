package methods;

class Rectangle {
	float length = 1.0f;
	float width = 1.0f;

	public Rectangle() { } // ������ public �ٿ����ǰ� �Ⱥٿ�����

	public Rectangle(float length, float width) {
		this.length = length;
		this.width = width;
	}

	public float getLength() {
		return length;
	}

	public void setLength(float length) {  //float length �̰� �־�� ��
		this.length = length;
	}

	public float getWidth() {
		return length;
	}

	public void setWidth(float width) {  // ����ü�������� ������ ���� �ٲ��ְ� ������ ����ϴ� ��
		this.width = width;
	}

	public double getArea() {
		return (double)length * width;
	}

	public double getPerimeter() {
		return 2.0*length + 2.0*width;
	}

	@Override
	public String toString() {
		return "Rectangle [length=" + length + ", width=" + width + "]";
	}
}

public class RectanglePer {

	public static void main(String[] args) {

		Rectangle r1 = new Rectangle();

		System.out.println(r1.toString()); // toString() �Ƚᵵ �ڵ����� ȣ��ǰ� �Ǿ�����
		System.out.println("Area = "+r1.getArea());
		System.out.println("Perimeter = "+r1.getPerimeter());
		
		Rectangle r2 = new Rectangle(2.0f, 3.0f);
		
		System.out.println("����� ��: "+r2.toString());
		System.out.println("Area = "+r2.getArea());
		System.out.println("Perimeter = "+r2.getPerimeter());
		
		r2.setLength(3.0f); // ���߿� ��� ������ �����ϰ� ���� �� ���� ��
		System.out.println("����� ��: "+r2.toString());
	}
}
