package pack_1;

public class MethodMul {
	int a,b,c;
	float  x,y;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MethodMul obj=new MethodMul();
		obj.Mul(10,20);
		obj.Mul(10,2,3);
		obj.Mul(10.1f,2.6f);
		
		}
		void Mul( int a, int b) {
		System.out.println(a*b);
		}
		void Mul( int a, int b,int c) {
		System.out.println((a*b)*c);
		}
		void Mul(float x, float y) {
		System.out.println(x*y);

	}

}
