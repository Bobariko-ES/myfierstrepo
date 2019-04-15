public class Fifth
{
	public static void main(String args[]) {

		boolean a = true;
		boolean b = false;
		boolean c = true;
		boolean d = a && (b || c);
		System.out.println(d);
		d = !d;
		System.out.println(d);
	}
}
