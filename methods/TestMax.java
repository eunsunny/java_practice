package methods;

class Max{
	//2�� �� ��, �� ū ���� ��ȯ�ϴ� �޼ҵ�
	int getMax(int a, int b) {
		if (a > b) 
			return a;   // ���⸸ ������ ������ if���� false�϶� ������ ���� ���!
		else
			return b;  // ��� ���ǿ� ���ؼ� ������ �ؾ��Ѵ�.
		
		// ���Ϲ� ���Ŀ� ���๮�� ���� "Unreachable code" ������ ������ �߻��Ѵ�.
	}
	
	int add(int a, int b) {
		return a+b;
	}
	
	long add(int a, long b) { 
		return (long)a+b;
	}
}

public class TestMax {

	public static void main(String[] args) {
		Max max = new Max();
		
		int result = max.getMax(8, 10);

	}

}
