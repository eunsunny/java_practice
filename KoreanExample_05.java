// �ѱ����� ��Ÿ���� Ŭ����
class Korean { 
	String nation = "���ѹα�";
	String name;   // �������
	String birthday;
	
	// �⺻������
	Korean() { }
	
	// �Ű������� �ִ� ������
	// �Է� �Ű����� : n, b
	// n : name���� ����
	// b : birthday���� ����
	/*
	Korean(String n, String b) {  // �Է� �ŰԺ���
		name = n;
		birthday = b;		
	}
	*/
	// �������� : this. -> �ν��Ͻ� �ڽ��� ����Ų��.
	Korean(String name, String birthday) {
		this.name = name;  // this.name �� �������, ���� �̸��� ������ this�� �־���(�򰥸��� �ʰ�)
		this.birthday = birthday;	// ���� ��������� �ŰԺ����� �����ϰ� ����(�򰥸��� �ʵ���)
	}
}

public class KoreanExample_05 {

	public static void main(String[] args) {
		Korean k1 = new Korean();
		System.out.println("����="+k1.nation);
		System.out.println("�̸�="+k1.name);
		System.out.println("����="+k1.birthday);
		
		// �Ű������� �ִ� �������� ���
		Korean k2 = new Korean("ȫ�浿", "14900705");
		System.out.println("k2����="+k2.nation);
		System.out.println("k2�̸�="+k2.name);
		System.out.println("k2����="+k2.birthday);
	}

}
