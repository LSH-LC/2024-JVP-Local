package W06_JVP_Package;
import java.util.Calendar;

public class W06_JVP_5_8_0_Enum
{
	public static void main(String[] args)
	{
		Week today = null;
		
		Calendar cal = Calendar.getInstance();
		
		int week = cal.get(Calendar.DAY_OF_WEEK);
		
		switch(week)
		{
		case 1:today = Week.SUNDAY; break;
		case 2:today = Week.MONDAY; break;
		case 3:today = Week.TUESDAY; break;
		case 4:today = Week.WEDNESDAY; break;
		case 5:today = Week.THURDAY; break;
		case 6:today = Week.FRIDAY; break;
		case 7:today = Week.SATURDAY; break;
		}
		
		if(today == Week.SUNDAY)
		{
			System.out.println("일요일에는 축구를 합니다.");
		}
		else
		{
			System.out.println("열심히 자바를 공부합니다.");
		}
	}
}
