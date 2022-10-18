import java.io.FileReader;
import java.util.ArrayList;
import java.util.Scanner;
public class UnitTest {
	//answers, an ArrayList of Strings that represents the 
	//correct answers on the exam
	private ArrayList<String> answers = new ArrayList<String>();
	private Scanner input; // input scanner object
	
	//constructor reads the answers.txt file
	public UnitTest() {
		try {
			 input = new Scanner(new FileReader("answers.txt"));
		} catch(Exception e) {
			System.out.println("Error");
			input = new Scanner(System.in);
		}
		//add the answers into answers arraylist using while loop
		answers.add(input.next());
		while(input.hasNext()) {
			answers.add(input.next());
		}
		input.close(); // close file
	}
	
	//function returns grade of student takes arraylist of strings 
	//as parameter
	public double calculateGrade(ArrayList<String> exams) {
		double grade = 0; //grade that will be returned
		//for loop through answers and compare to the arraylist that
		//was passed into the function
		for(int i = 0; i<answers.size(); i++) {
			//if the answers match add 1 to grade
			if(answers.get(i).compareTo(exams.get(i)) == 0 ) {
				grade++;
			}
		}
		//return as an average out of 100
		return grade*100 / answers.size();
	}
}
