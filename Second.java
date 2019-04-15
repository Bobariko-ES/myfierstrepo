public class Second
{
	public static void main(String args[]) {

		int b = 5;
		int a = 12;
		int c = ++a - b++;
		System.out.println("a="+a);
		System.out.println("b="+b);
		System.out.println("c="+c);
		int d = b++ *2;
		System.out.println("a="+a);
		System.out.println("b="+b);
		System.out.println("d="+d);
	}
}
