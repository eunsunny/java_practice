package access_mod.package2;

//import access_mod.package1.B;
import access_mod.package1.A;

public class C {
//	// A a;  // �ٸ� ��Ű������ Ŭ������ ����� �� ����
//	B b;  // �ٸ� ��Ű���� Ŭ������ ����Ϸ��� import �ؾ���.
	
	public void c() {
		A a = new A();
		a.field1 = 10;
		// a.field2 = 10; // �ٸ� ��Ű�� ���� default ����� ����� �� ����
		// a.field3 = 10;  // private �̹�ȣ ����� �� ����.
		
		a.method1();   // ������ ����
		// a.method2();
		// a.method3();
		
	}
 
}
