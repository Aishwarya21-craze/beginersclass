import java.util.ArrayList;

public class ArrayList_example {

	public static void main(String[] args) {
		//Declaration
		ArrayList<Integer> employeeid=new ArrayList<Integer>();
		
		//adding elements
		employeeid.add(1001);
		employeeid.add(2001);
		
		//size of the array
		int sizeofthearraylist=employeeid.size();
		System.out.println("Size of the arraylist : "+sizeofthearraylist);
		employeeid.add(5000);
		sizeofthearraylist=employeeid.size();
		System.out.println("Size of the arraylist : "+employeeid.size());
		
		//Retrieve the Value from the arraylist
		
		int result=employeeid.get(2);
		System.out.println("id inside index 2 is : "+result);
		
		System.out.println(employeeid.get(0));
		
		for(int i=0;i<sizeofthearraylist;i++) {
			System.out.println(" retrieve from index : "+i+" val : "+employeeid.get(i));
		}
		
	}

}
