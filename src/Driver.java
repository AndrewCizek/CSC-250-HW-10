import java.util.Arrays;
import java.util.Random;

public class Driver
{
	public static void main(String[] args)
	{
		int[] age = new int[4];
		Random r = new Random();
		for (int i = 0; i < age.length; i++)
		{
			age[i] = r.nextInt(30);
		}
		Driver.dis
	}
	public void displayAges(int[] age)
	{
		for (int i = 0; i < age.length; i++)
		{
			System.out.println(age[i]);
		}
	}
}
