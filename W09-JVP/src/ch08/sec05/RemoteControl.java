package ch08.sec05;

public interface RemoteControl
{
	int MAX_VOLUME = 10;
	int MIN_VOLUME = 0;
	
	void turnOn();
	void turnOff();
	void setVolume(int volume);
	
	default void setMute(boolean mute)
	{
		if(mute)
		{
			System.out.println("���� ó���մϴ�.");
			setVolume(MIN_VOLUME);
		}
		
		else
		{
			System.out.println("���� �����մϴ�.");
		}
	}
}