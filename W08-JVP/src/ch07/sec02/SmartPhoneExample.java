package ch07.sec02;

public class SmartPhoneExample
{
	public static void main(String[] args)
	{
		smartphone myphone = new smartphone("������","����");
		
		System.out.println("��: " + myphone.model);
		System.out.println("����: " + myphone.color);
		
		System.out.println("�������� ����: " + myphone.wifi);
		
		myphone.bell();
		myphone.sendVoice("��������");
		myphone.receiveVoice("�ȳ��ϼ���! ���� ȫ�浿�ε���");
		myphone.sendVoice("��~ �� �ݰ����ϴ�.");
		myphone.hangUp();
		
		myphone.setwifi(true);
		myphone.internet();
	}
}
