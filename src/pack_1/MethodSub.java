package pack_1;

public class MethodSub {
	int a,b,c;
	float  x,y;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MethodSub obj=new MethodSub();
		obj.sub(10,20);
		obj.sub(10,2,3);
		obj.sub(10.1f,2.6f);
		
		}
		void sub( int a, int b) {
		System.out.println(a-b);
		}
		void sub( int a, int b,int c) {
		System.out.println((a-b)-c);
		}
		void sub(float x, float y) {
		System.out.println(x-y);
	}

	}