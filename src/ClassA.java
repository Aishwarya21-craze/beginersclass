
public class ClassA {
	int empid=5;

	public static void main(String[] args) {
		ClassA obj=new ClassA();
		System.out.println(obj.empid);
		System.out.println(obj.getEmpname());

	}
	
	public String getEmpname() {
		String empname="aaa";
		return empname;
	}

}
