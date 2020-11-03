import java.util.ArrayList;
import java.util.Random;

public class Players
{
	public void AssignValue()
	{
		int[] age = new int[4];
		Random r = new Random();
		for (int i = 0; i < age.length; i++)
		{
			age[i] = r.nextInt(30);
		}
	}
	
	static void displayArray(int[] age)
	{
		for (int i = 0; i < age.length; i++)
		{
			System.out.println(age[i]);
		}
	}
}
