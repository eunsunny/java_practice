package instance_static;

class MyMath2 {
	long a, b;
	
	//�ν��Ͻ� ������ �̿��ϴ� �޼ҵ��, �ν��Ͻ��� ������ ��� ����
	long add() {
		return a+b;
	}
	
	// static �޼ҵ� // �Ű������� �ְ����
	static long add(long a, long b) {
		return a+b;
	}
}

public class MyMathTest2 {

	public static void main(String[] args) {
		//static �޼ҵ�(Ŭ���� �޼ҵ�) ��� . ��ü�� ������ �ʰ� ��� ���� - Ŭ���� �̿�
		System.out.println("Ŭ���� �޼ҵ��� ������= "+MyMath2.add(7, 5));
		
		// �ν��Ͻ� �޼ҵ��� ���
		MyMath2 mm = new MyMath2();
		mm.a = 10;
		mm.b = 20;
		
		System.out.println("�ν��Ͻ� �޼ҵ��� ������= "+mm.add());
		
		//�̷� �Ž� Ŭ�������� ��ü ���� ��밡�� �ٷ� ����ϰ� �� �� �ֵ��� ��
//		Math.random();
//		Math.PI;
		
	}

}
