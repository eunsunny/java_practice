package access_mod.package1;

public class A {
//	private int aa; // ���� Ŭ���� �ȿ����� ��� ����
//	public int a1;  // � Ŭ�������� ��� ����
	// �ʵ�
	public int field1;
	int field2;   // default ���
	private int field3;
	
	// ������
	public A() {
		// Ŭ���� ���ο����� ��� ������ ����� ��� ����
		field1 = 10;
		field2 = 10;
		field3 = 10;	
		
		// Ŭ���� ���ο����� ��� ������ �޼ҵ带 ��� ����
		method1();
		method2();
		method3();
		
				
	}
	
	// �޼ҵ�
	public void method1() { }
	void method2() { }
	private void method3() { }

}
