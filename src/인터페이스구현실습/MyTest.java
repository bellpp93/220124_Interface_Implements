package �������̽������ǽ�;

//���� Ŭ����
public class MyTest {

	public static void main(String[] args) {
		RemoteControl rc = null;
		
		rc = new Television();
		rc.turnOn();
		rc.setVolume(8);
		rc.setMute(true);
		RemoteControl.changeBattery();
		rc.turnOff();
		
		rc = new Audio();
		rc.turnOn();
		rc.setVolume(5);
		rc.turnOff();
		
	}
}
