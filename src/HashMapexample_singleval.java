import java.util.HashMap;

public class HashMapexample_singleval {

	public static void main(String[] args) {
		//Declaration
		HashMap<Integer, String> employeedet=new HashMap<Integer, String>();
		
		//Adding
		employeedet.put(1001, "abc");
		employeedet.put(2000, "jack");
		
		//size
		int size=employeedet.size();
		System.out.println("Size of the hashmap : "+size);
		//retrive 
		
		System.out.println(employeedet.get(2000));

	}

}
