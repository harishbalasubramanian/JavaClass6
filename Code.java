
public class Code{
	final int birthyear = 2004;
	//years of events should be final
	
	public static void main(String[] args) {
//		Party p1 = new Party(5,10);
//		System.out.println(p1.age);
//		System.out.println(Party.num);
//		Party p2 = new Party(6,11);
//		System.out.println(p2.age);
//		System.out.println(Party.num);
//		int i = 0;
//		//...
//		i = 9;
//		final double pi = 3.14;
//		final double e = 2.71;
//		System.out.println(pi);
//		System.out.println(e);
		Party p = new Party(1,2);
		p.age = 30;
		p.height = 50;
		p.print();
		//birthyear = 2005; -> this should be a problem
		
	}
	
}
class Party{
	int age;
	int height;
	static int num = 0;
	private int a = 10;
	public final int c = 50;
	public final static int d = 40;
	public Party(int age, int height) {
		this.age = age;
		this.height = height;
		num++;
	}
	public void print() {
		System.out.println(a);
	}
	public void increment() {
		a++;
	}
}
