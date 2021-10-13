package instance_static;

public class MemberCall {
	int iv = 10; // �ν��Ͻ� ����
	static int cv = 20; // ����ƽ ����
	
	
	// Ŭ���� ����ÿ� �޸𸮿� �ε�
	static void staticMethod1() {
		System.out.println(cv);   // ����ƽ ���� ��� �Ұ���
		//System.out.println(iv);   // �ν��Ͻ� ���� ��� �Ұ���
		// ����ƽ�޼��忡�� �ν��Ͻ� ������ ����Ϸ��� ��ü�� �����ؾ���
		MemberCall m2 = new MemberCall();
		System.out.println(m2.iv);
	}
	
	// ��ü �����ÿ� �޸𸮿� �ε�
	// �ν��Ͻ� �޼ҵ带 ȣ���Ѵٴ� ���� �̹� �ν��Ͻ��� �ε���� ������.
	void instanceMethod1() {
		System.out.println(cv);   // ����ƽ ���� ��� ����
		System.out.println(iv);   // �ν��Ͻ� ���� ��� ����
	}
	
	// Ŭ���� ����ÿ� �޸𸮿� �ε�
	static void staticMethod2() {
		staticMethod1();
		//instanceMethod1();  // ����Ϸ��� ��ü�� ���� �� ��� ������.
		// ����Ϸ��� ��ü�� ����� �־�� ��.
		MemberCall m1 = new MemberCall();
		m1.instanceMethod1();
	}
	
	// ��ü�����ÿ� �޸𸮿� �ε�
	void instanceMethod2() {
		staticMethod1(); // static �޼ҵ� ��밡��
		instanceMethod1(); // ��ü�� ������� ���̹Ƿ� �ν��Ͻ� �޼ҵ� ��� ����
	}

	public static void main(String[] args) {
		// static �żҵ� ȣ��
		MemberCall.staticMethod2();
		
		// �ν��Ͻ� �޼ҵ� ���
		MemberCall mc = new MemberCall();
		mc.instanceMethod2();
		
		//print(); //main()�� static �޼ҵ��̹Ƿ� �ν��Ͻ� �޼ҵ� ȣ�� �Ұ���
	}
	// �ν��Ͻ� �޼ҵ�
	void print() {
		System.out.println("����� ����մϴ�.");
		
	}

}
