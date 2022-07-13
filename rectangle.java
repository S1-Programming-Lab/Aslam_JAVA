package graphics;
import java.util.*;
interface area_cal
{
	void area();
}
public class rectangle implements area_cal
{
	int l,b;
	public void area()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the length");
		l=sc.nextInt();
		System.out.println("Enter the breath");
		b=sc.nextInt();
		System.out.println("Area of rectangle is: "+l*b);
		sc.close();
	}
}
