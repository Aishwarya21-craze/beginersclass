
public class StringOperationsExample {
	

	public static void main(String[] args) {
		String word1="jack";
		String word2="jill";
		String name="tomandjerry";
		String name1=" hello ";

		if(word1.equals(word2)) {
			System.out.println("Equal");
		}
		else {
			System.out.println("Not equal");
		}
		if(name.contains("jerry")) {
			System.out.println("contains jerry");
		}
		int sizeoftheword=word1.length();
		System.out.println(sizeoftheword);
		System.out.println(name1);
		System.out.println(name1.trim());
		

	}

}
