package exercise1;

import java.util.Scanner;

public class InvoiceItem2 {

	public static void main(String[] args) {
		InvoiceItem item1 = new InvoiceItem("112", "Book", 3, 35000);
		InvoiceItem item2 = new InvoiceItem("101", "Phone", 2, 920000);
		InvoiceItem item3 = new InvoiceItem("187", "Laptop", 1, 1100000);
		
		System.out.println("=====================================");
		System.out.println("  ǰ��    �׸��    ����    �ܰ�    �ݾ�  ");
		System.out.println("-------------------------------------");
		dispInvoice(item1);
		dispInvoice(item2);
		dispInvoice(item3);
		
		InvoiceItem item4 = new InvoiceItem();
		Scanner sc = new Scanner(System.in);
		System.out.print("ǰ���� �Է��ϼ���:");
		item4.setId(sc.next());
		System.out.print("ǰ����� �Է��ϼ���:");
		item4.setDesc(sc.next());
		System.out.print("������ �Է��ϼ���:");
		item4.setQty(sc.nextInt());
		System.out.print("�ܰ��� �Է��ϼ���:");
		item4.setUnitPrice(sc.nextLong());
		
		System.out.println(item4);
	}
	
	public static void dispInvoice(InvoiceItem item) {
		System.out.printf("%3s %9s %5d %8d %7d\n", item.getId(), item.getDesc(), item.getQty(), item.getUnitPrice(), item.getTotal());
		
		
		

	}

}
