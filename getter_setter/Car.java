package getter_setter;

public class Car {
	private int speed;
	private boolean stop;
	
	// �޼ҵ�
	public int getSpeed() {
		return speed;
	}
	
	public void setSpeed(int speed) { //���Ϲ��� ���� ���⋚���� Ÿ�Լ��� ���ص���
		if (speed < 0) {
			this.speed = 0;
		} else {
			this.speed = speed;
		}
	}
	
	public boolean isStop() {
		return stop;
	}
	
	public void setStop(boolean stop) {
		this.stop = stop;
		this.speed = 0;
	}
}
