package overloading;

public class SumTest {

	public static void main(String[] args) {
		Sum1 s = new Sum1();
		
		int sum1 = s.sum(10, 20);
		int sum2 = s.sum(10, 20, 30);
		double dd = s.sum(10.7, 20.3);
		
		System.out.println("ù��° "+sum1);
		System.out.println("�ι�° "+sum2);
		System.out.println("����° "+dd);
	
	}

}
