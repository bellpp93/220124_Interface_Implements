package �������̽������ǽ�;

public interface RemoteControl {
	//��� ����
	public static final int MAX_VOLUME = 10;  //�ִ� ����  /(public static final) ��������
	public static final int MIN_VOLUME = 1;  //�ּ� ����
	
	//�߻� �޼ҵ� ����
	public abstract void turnOn();  //�Ҵ�  /�߻�޼ҵ�� {}�߰�ȣ(�����) ����.
	public abstract void turnOff();  //����
	public abstract void setVolume(int volume);  //���� ����
	
	/*
	 * �ڹ� 8�������� ����Ʈ �޼ҵ�� ���� �޼ҵ� ������ ����������.
	 * 		=> ������ ���忡�� ������ �������� ����!!
	 */
	default void setMute(boolean mute) {
		if (mute) {
			System.out.println("���� ó���մϴ�.");
		}else {
			System.out.println("���� �����մϴ�.");
		}
	}
	/*
	 * ���� �޼ҵ� => ����Ʈ �޼ҵ�ʹ� �޸� ��ü�� ��� �������̽������� ȣ���� �����ϴ�.
	 */
	static void changeBattery() {
		System.out.println("�������� ��ȯ�մϴ�.");
	}
}
