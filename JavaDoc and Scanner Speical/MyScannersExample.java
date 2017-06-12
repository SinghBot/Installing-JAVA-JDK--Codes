import java.util.Scanner;
class MyScannersExample
{
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a String:\t");
		String s1 = input.nextLine();
		System.out.println("Enter a boolean value:\t");
		boolean b = input.nextBoolean();
		System.out.println("Enter an Integer:\t");
		int i = input.nextInt();
		System.out.println("Enter a long Integer:\t");
		long l = input.nextInt();
		System.out.println("Enter a short Integer:\t");
		short sh = input.nextShort();
		System.out.println("Enter a floating point number:\t");
		float f = input.nextFloat();
		System.out.println("Enter a double floating point number:\t");
		double d = input.nextDouble();

		System.out.println("Line:\t" + s1);
		System.out.println("Boolean:\t" + b);
		System.out.println("Integer:\t" + i);
		System.out.println("Long Integer:\t" + l);
		System.out.println("Short Integer:\t" + sh);
		System.out.println("Floating point:\t" + f);
		System.out.println("Double Floating point:\t" + d);
			
	}
}

/*

formula to calculate the range of any data type-
from
-2^(n-1)
to
2^(n-1) - 1
where n is the size of that datatype in bits
eg 4 bytes is the size of any int variable
4 bytes = 32 bits
so we get the range of int from -2^31 to (2^31)-1 ie from -2147483648 to 2147483647

*/