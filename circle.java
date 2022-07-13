package graphics;
import java.util.*;
interface area_cal
{
	void area();
}
public class circle implements area_cal
{
	int r;
	public void area()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the radius");
		r=sc.nextInt();
		String area = Double.toString(Math.PI*r*r);
		System.out.println("Area of circle is: "+area);
		sc.close();
	}
}
