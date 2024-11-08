package ch07.sec02;

public class SmartPhoneExample
{
	public static void main(String[] args)
	{
		smartphone myphone = new smartphone("갤럭시","은색");
		
		System.out.println("모델: " + myphone.model);
		System.out.println("색상: " + myphone.color);
		
		System.out.println("와이파이 상태: " + myphone.wifi);
		
		myphone.bell();
		myphone.sendVoice("여보세요");
		myphone.receiveVoice("안녕하세요! 저는 홍길동인데요");
		myphone.sendVoice("아~ 네 반갑습니다.");
		myphone.hangUp();
		
		myphone.setwifi(true);
		myphone.internet();
	}
}
