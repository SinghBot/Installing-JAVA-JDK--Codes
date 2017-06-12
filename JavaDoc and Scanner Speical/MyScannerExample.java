/*
String next(); - used to take strings without blank spaces;
String nextLine(); - used to take full line.
boolean nextBoolean(); -used to take boolean values.
int nextInt(); - used to take integer values only
long nextLong(); - used to take long integer values only.
short nextShort(); - used to take short integer values only.
float nextFloat(); - used to take floating point values. 2.4 2.6 2.0
double nextDouble(); - used to take double floating point valeus.

*/
import java.util.Scanner;
class MyScannerExample
{
	public static void main(String... args)//String args[]
	{
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a Numebr, bro:\n");
		int a = input.nextInt();
	}
}
