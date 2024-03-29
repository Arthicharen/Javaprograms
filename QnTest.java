package programs2;

public class QnTest {
	public static void main(String[] args)

	{

	Qn1  instanceA = new Qn1();

	Qn1 instanceB = new Qn1();

	instanceA.a = 8;

	instanceB.b = instanceA.x;

	instanceA.x++;

	instanceB.a = 10;

	instanceB.c = 90;

	instanceB.x++;
    
	
	System.out.println("a:" +instanceA.a);
	System.out.println("c:" +instanceA.c);
	System.out.println("b:" +instanceA.b);
	System.out.println("instance b-----");
	System.out.println("a:" +instanceB.a);
	System.out.println("b:" +instanceB.b);
	System.out.println("c:" +instanceB.c);
	System.out.println("x:" +instanceA.x++);
	System.out.println("x:" +instanceB.x++);
	}
	
}
