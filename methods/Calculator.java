package methods;
/*
 *  ����� ���ϴ� ����
 */
public class Calculator {
//	public Calculator() { // �ڵ����� �����Ǳ� ������ �Ƚᵵ��
//		
//	}
	
	int plus(int x, int y) { // ���ϴ� �κ��� plus��� �޼ҵ� ���
		int result = x + y;
		return result; // ����� �����ϰ� ����� �������� �÷���, �ѹ� �ϰ� ���� �÷��ְ� ��������
		
		// result = x * y; // �־ �ҿ����
	}
	
	// ����� ����ϴ� �޼ҵ�
	double avg(int a, int b) {  // ��տ� ���� �żҵ� avg
		double sum = plus(a, b); //���� plus��� ����� �ֱ� ������ ��� a+b, ���� Ŭ���������� ��ü�̸� �־��� �ʿ䰡 ����
		//a -> x, b -> y ����
		double result = sum / 2;
		return result;	// Ÿ���� �����ؾ���	double avg Ÿ�� = return result
	}
	
	void execute() {  // <= ��Ÿ� ȣ���� �ָ� �ڵ����� ������ ��
		double result = avg(7, 10); // 7 -> a -> x, 10 -> b -> y �� ��
		// ��� ���
		resultPrint("������: "+result); // ���ڿ� + ���ǰ��� = ���ڿ�
	}
	
	// ������ ����ϴ� �޼ҵ�
	void resultPrint(String str) {  // ���ڿ��� ��, ���� resultPrint ���� ����� ��, resultPrint�� ���α׷��Ӱ� �����
		System.out.println(str);
		
	}
	

}



