
class Tv {
	// �ʵ�
	String color;
	boolean power;
	int channel;
	
	void method() {
		channel = 5; 
	}
	
	// java �����Ϸ��� �����ÿ� �⺻�����ڸ� �ڵ� ������.
	// ������ ���� �����ڰ� �ڵ� ������.
	// public Tv() { } �Ű������� ���� Ŭ���������θ� ����������� �⺻�����ڶ� �Ѵ�.
}

public class TvTextClass_03 {

	public static void main(String[] args) {
		Tv tel = new Tv(); // ��ü ���� , new Tv(); <- ������
		
		System.out.println("���� ä��: "+tel.channel);
		
		tel.channel = 7; // ��ü.Ư���� = ���ͷ�;; <- �ܺ� Ŭ�����̱� ����
		
		System.out.println("����� ä��: "+tel.channel);

	}

}
