
public class ClassB extends ClassA {
int empid2;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClassB obj1=new ClassB();
		ClassB obj2=new ClassB(50);
		System.out.println(obj1.empid);
		System.out.println(obj1.getEmpname());
		System.out.println(obj1.getEmpSalary());
		System.out.println(obj1.empid2);
		System.out.println(obj2.empid2);

	}
	public ClassB() {
		empid2=10;
	}
	public ClassB(int val) {
		empid2=val;
	}
	public int getEmpSalary() {
		int sal=5000;
		return sal;
	}

}
