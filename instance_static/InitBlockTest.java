package instance_static;

public class InitBlockTest {

	// static ��
	static {
		System.out.println("static { }");
	}
	
	// �ν��Ͻ� ��
	{
		System.out.println("�ν��Ͻ� �� �ʱ�ȭ");
	}
	
	public InitBlockTest() {
		System.out.println("������...");
	}
	
	int add(int a, int b) {
		return a + b;
	}
	
	public static void main(String[] args) {
		System.out.println("����° InitblockTest ��ü ����");
		InitBlockTest bt = new InitBlockTest();
				
		System.out.println("�ι�° InitblockTest ��ü ����");
		InitBlockTest bt2 = new InitBlockTest();
		// static �޼ҵ� ��� �� 
		int a = Math.abs(-1);
		
		// �ν��Ͻ� �޼ҵ� ��� ��
		InitBlockTest bt3 = new InitBlockTest();
		int result = bt3.add(10, 20);

	}

}