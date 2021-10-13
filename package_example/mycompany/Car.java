package package_example.mycompany;

//import package_example.hankook.SnowTire;
//import package_example.hyundai.Engine;
//import package_example.kumho.BigWidthTire;

import package_example.hankook.*; // *�� �ϸ� ��Ű�� ���� Ŭ������ ��� ����� �� ����
import package_example.hyundai.*;
import package_example.kumho.*;

public class Car {
	// �ʵ�
	// �ٸ� ��Ű�� ���� Ŭ������ ����Ϸ��� �Ʒ��� ���� Ŭ���� ��ġ�� ��Ű������ �����ؾ���.
	//package_example.hyundai.Engine engine = new package_example.hyundai.Engine();
	//package_example.kumho.BigWidthTire tire1 = new package_example.kumho.BigWidthTire();
	
	// ��Ű������ �������� �ʰ� Ŭ������ ����Ϸ��� import�� ���
	Engine engine = new Engine();
	BigWidthTire tire1 = new BigWidthTire();
	SnowTire tire2 = new SnowTire();
	
	// hankook�� kumho ��Ű�� ���� ������ �̸��� Tire Ŭ������ ������ Ŭ���� �� �տ� ��Ű������ ��������� ��.
	package_example.hankook.Tire tire3 = new package_example.hankook.Tire();
	

}
