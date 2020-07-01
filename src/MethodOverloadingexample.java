
public class MethodOverloadingexample {

	public static void main(String[] args) {
	MethodOverloadingexample obj=new MethodOverloadingexample();
	obj.add();
	obj.add(1.1);
	obj.add(3);

	}
public void add() {
	System.out.println("add");
}
public void add(int a) {
	System.out.println("add");
}
public void add(double a) {
	System.out.println("add");
}
}
