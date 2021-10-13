package overloading;
/*
 * ù��° sum() : 2���� �������� ���ؼ� ��ȯ�ϴ� �޼ҵ�
 * �ι�° sum() : 3���� �������� ���ؼ� ��ȯ�ϴ� �޼ҵ�
 * ����° sum() : 2���� double Ÿ���� �Ű������� ���ؼ� ��ȯ�ϴ� �޼ҵ�
 */

class Sum1 {
	
	public int sum(int a, int b) {
		return a+b;
	}
	public int sum(int a, int b, int c) {
		return a+b+c;
	}
	public double sum(double a, double b) {
		return a+b;
	}
	
}

public class Sum {

	public static void main(String[] args) {
		
		Sum1 s = new Sum1();
		
		int sum1 = s.sum(10, 20);
		int sum2 = s.sum(10, 20, 30);
		double dd = s.sum(10.7, 20.3);
		
		System.out.println("ù��° "+sum1);
		System.out.println("�ι�° "+sum2);
		System.out.println("����° "+dd);

	}

}
