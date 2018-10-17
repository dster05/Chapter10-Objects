
public class Tv {
	
	int channel = 1;//Default channel is 1
	int volumnLevel = 1;//Default volumn level is 1
	boolean on = false;//Tv is off
	
	public Tv() {
		
	}
	
	public void turnOn() {
		on = true;
		
	}
	
	public void turnOff() {
		on = false;
	}
	
	public void setChannel(int newChannel) {
		if(on && newChannel >=1 && newChannel <= 120)
			channel = newChannel;
			
	}
	
	public void setVolume(int newVolumeLevel) {
		if(on&& newVolumeLevel >= 1 && newVolumeLevel <= 7)
			volumnLevel = newVolumeLevel;
	}
	
	public void channelUp() {
		if(on && channel < 120) {
			channel++;
		}
	}
	
	public void channelDown() {
		if(on&&channel > 1)
			channel--;
	}
	
	public void volumeUp() {
		if(on && volumnLevel < 7)
			volumnLevel++;
	}
	
	public void volumeDown() {
		if(on && volumnLevel >1)
			volumnLevel--;
	}

}
