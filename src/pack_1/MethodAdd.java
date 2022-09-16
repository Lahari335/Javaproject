package pack_1;

public class MethodAdd {
	int a,b,c;
	float  x,y;

	public static void main(String[] args){
		// TODO Auto-generated method stub
	
	MethodAdd obj=new MethodAdd();
	obj.add(6,20);
	obj.add(10,2,3);
	obj.add(10.1f,2.6f);
	

	}
	void add( int a, int b) {
	System.out.println(a+b);
	}
	void add( int a, int b,int c) {
	System.out.println((a+b)+c);
	}
	void add(float x, float y) {
	System.out.println(x+y);
}

}
		
	

