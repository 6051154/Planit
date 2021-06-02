/**
 * 
 */

/**
 * @author Peroz Zayee
 *
 */
public class Challenge1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		for (int i = 1; i <= 100; i++)
		{
			if (i % 3 == 0 && i % 5 == 0)
			{
				System.out.println("PlanitTesting");
			}
			else if (i % 5 == 0)
			{
				System.out.println("Testing");
			}
			else if (i % 3 == 0)
			{
				System.out.println("Planit");
			}
			else
			{
				System.out.println(i);
			}
		}
	}
}
