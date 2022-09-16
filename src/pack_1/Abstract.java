package pack_1;
abstract class Abc
{
	abstract void m1();
	void m2()
	{
		System.out.println("m2 code");
	}
}
public class Abstract extends Abc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Abstract obj=new Abstract();
		obj.m1();
	}
	void m1()
	{
		System.out.println("python,java,c");
	}
	

}
