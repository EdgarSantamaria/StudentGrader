import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.HashMap;

public class UnitTestRunner {

	public static void main(String[] args) {
		Scanner input;
		UnitTest test = new UnitTest();
		String name;
		ArrayList<Student> students = new ArrayList<>();
		ArrayList<String> grades = new ArrayList<String>();
		HashMap<String,ArrayList<String>> hash = new HashMap<>();
		
		try {
			input = new Scanner(new File("allExams.txt"));
		} catch(Exception e) {
			System.out.println("Error");
			input = new Scanner(System.in);
		}
		while (input.hasNext()) {
			name = new String();
			grades = new ArrayList<String>();
			
		}
	}

}
