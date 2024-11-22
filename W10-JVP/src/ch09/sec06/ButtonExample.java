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
				System.out.println("ok 버튼을 클릭했습니다.");
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
				System.out.println("Cancel 버튼을 클릭했습니다.");
			}
		}
		btnCancel.setClickListener(new CancelListener());
		btnCancel.click();
	}
}