import java.io.File;
import java.io.FileInputStream;

public class ExceptionHandlingeg {

	public static void main(String[] args) {
		ExceptionHandlingeg ecExceptionHandlingeg = new ExceptionHandlingeg();
		try {
			int result = 5 / 0;
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("Hello");
		try {
			ecExceptionHandlingeg.sendmsg();
		} catch (Exception e1) {
			System.out.println("exception");
		}
		try {
			ecExceptionHandlingeg.generateexception();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally {
			System.out.println("Finally");
		}

	}

	public void sendmsg() throws Exception {

		File obj = new File("c:\\a.png");
		FileInputStream fis = new FileInputStream(obj);
	}

	public void generateexception() throws Exception {
		throw new Exception();
	}
}
