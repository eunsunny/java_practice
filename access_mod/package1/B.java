package access_mod.package1;

/*
 *  ���� ��Ű�� ������ �ٸ� Ŭ������ ��� ���
 */

public class B {
//	A a = new A();    // default �����ڰ� �����.(�ƹ��͵� �������� ������ default)
//	
//	public static void main(String[] args) {
//		A a = new A();
//		a.aa = 0;
//		a.a1 = 10; }
	
	public B() {
		A a = new A();   // ���� ��Ű������ Ŭ�����̹Ƿ�  ��� ����
		a.field1 = 10;   // public
		a.field2 = 10;   // default
 		// a.field3 = 10;   // private �� ��� �Ұ���
		
		a.method1();   // public
		a.method2();   // default
		// a.method3();   // private �� ��� �Ұ��� (�ν��Ͻ��� �޼ҵ� ������)
	}

}
