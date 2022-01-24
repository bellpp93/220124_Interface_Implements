package 인터페이스구현실습;

public class Audio implements RemoteControl {

	//필드(멤버변수) 선언
	private int volume;
	
	@Override
	public void turnOn() {
		System.out.println("Audio를 켭니다.");
	}
	
	@Override
	public void setVolume(int volume) {
		if (volume > MAX_VOLUME) {
			this.volume = RemoteControl.MAX_VOLUME;
		}else if(volume < RemoteControl.MIN_VOLUME) {
			this.volume = RemoteControl.MIN_VOLUME;
		}else {
			this.volume = volume;
		}
		System.out.println("현재 Audio 볼륨: " + this.volume);
	}

	@Override
	public void turnOff() {
		System.out.println("Audio를 끕니다.");
	}
}
