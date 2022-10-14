import java.util.Scanner;  // Import the Scanner class
import java.io.File;
import java.util.ArrayList; // import the ArrayList class
public class UnitTest {
	private ArrayList<String> answers = new ArrayList<String>();
	private Scanner input;
	
	
	public UnitTest() {
		try {
			input = new Scanner(new File("answers.txt"));
		} catch(Exception e) {
			System.out.println("Error");
			input = new Scanner(System.in);
		}
		
		while (input.hasNext()) {
			answers.add(input.next());
		}
		input.close();
		System.out.println(answers.size());
	}
	
	public double calculateGrade(ArrayList<String> exams, double grade) {
		int i = 0;
		grade = 0;
		while(answers.size()>i) {
			if(answers.get(i).compareTo(exams.get(i)) == 0 ) {
				grade++;
			}
			i++;
		}
		return (grade / answers.size())*100;
	}
}
