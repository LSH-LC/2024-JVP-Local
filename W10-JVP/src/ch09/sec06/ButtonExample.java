package ch09.sec06;

public class ButtonExample
{
	public static void main(String[] args)
	{
		Button btnok = new Button();
		
		class OkListener implements Button.ClickListener
		{
			@Override
			public void onClick()
			{
				System.out.println("ok ��ư�� Ŭ���߽��ϴ�.");
			}
		}
		
		btnok.setClickListener(new OkListener());
		btnok.click();
		
		Button btnCancel = new Button();
		
		class CancelListener implements Button.ClickListener
		{
			@Override
			public void onClick()
			{
				System.out.println("Cancel ��ư�� Ŭ���߽��ϴ�.");
			}
		}
		btnCancel.setClickListener(new CancelListener());
		btnCancel.click();
	}
}