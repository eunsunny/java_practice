package final_field;
// ���������� ������Ѵٴ� ��
public class Person {
	final String nation = "Korea";
	final String ssn;  // �ֹε�Ϲ�ȣ
	String name;   // �̸�
	
	// ������ �ڵ����� ��Ʈ + n
	public Person(String ssn, String name) {
		this.ssn = ssn;
		this.name = name;
	}

	@Override
	public String toString() {
		return "Person [nation=" + nation + ", ssn=" + ssn + ", name=" + name + "]";
	}
	
	
	
	

}
