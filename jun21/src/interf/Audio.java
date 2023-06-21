package interf;

public class Audio implements RemoteControl {
	int volume;
	
	@Override
	public void turnOn() {
		System.out.println("오디오를 켭니다.");
	}

	@Override
	public void turnOff() {
		System.out.println("오디오를 끕니다.");
	}

	@Override
	public void setVolume(int volume) {
		if (RemoteControl.MAX_VOLUME < volume) {
			this.volume = RemoteControl.MAX_VOLUME;
		} else if (RemoteControl.MIN_VOLUME > volume) {
			this.volume = RemoteControl.MIN_VOLUME;
		} else {
			this.volume = volume;
		} 
		System.out.println("현재 오디오 볼륨 : " + this.volume);
	}

}
