

public class Vaiables_Example {
	static int c;
	int b;
	
	public static void main(String[] args) {
		Vaiables_Example obj=new Vaiables_Example();
		int a;//Local variable
		a=10;
		obj.b=10;
		System.out.println(a);
		System.out.println(c);
		System.out.println(obj.b);
		obj.firstmethod();
		int result=obj.add();
		System.out.println(result);
		obj.sub(2, 3);
		obj.sub(1, 5);
		int resul_mul=obj.mul(2, 3);
		System.out.println(resul_mul);
		

	}
public void firstmethod() {
	System.out.println("Hello");
}
public int add() {
	int a=10;
	int b=10;
	int c =a+b;
	return c;
}
public void sub(int a,int b) {
	int c=a-b;
	System.out.println(c);
	
}
public int mul(int a,int b) {
	int c=a*b;
	return c;
}
}
