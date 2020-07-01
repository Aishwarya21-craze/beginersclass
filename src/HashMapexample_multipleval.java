import java.util.ArrayList;
import java.util.HashMap;

public class HashMapexample_multipleval {

	public static void main(String[] args) {
		//Declaration
		HashMap<Integer, ArrayList<String>> employeedet=new HashMap<Integer, ArrayList<String>>();
		
		ArrayList<String> empl1=new ArrayList<String>();
		empl1.add("emp1");
		empl1.add("10000");
		
		ArrayList<String> empl2=new ArrayList<String>();
		empl2.add("emp2");
		empl2.add("20000");
		
		employeedet.put(1001,empl1);
		employeedet.put(1002, empl2);
		
		System.out.println("employee details of emp id : 1002 is "+employeedet.get(1002));

		System.out.println("employee details of emp id : 1001 is "+employeedet.get(1001));
	}
	
	

}
