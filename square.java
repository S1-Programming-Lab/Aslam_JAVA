package graphics;
import java.util.*;
interface area_cal
{
	void area();
}
public class square implements area_cal
{
	int s;
	public void area()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the lenth of side");
		s=sc.nextInt();
		System.out.println("Area of Square is: "+s*s);
		sc.close();
	}
}
