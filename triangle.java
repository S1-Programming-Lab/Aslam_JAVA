package graphics;
import java.util.*;
interface area_cal
{
	void area();
}
public class triangle implements area_cal
{
	int h,b;
	public void area()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the height");
		h=sc.nextInt();
		System.out.println("Enter the breath");
		b=sc.nextInt();
		System.out.println("Area of triangle is: "+((h*b)/2));
		sc.close();
	}
}
