import java.io.FileReader;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.HashMap;
import java.util.*;  
//Import all needed libraries
public class UnitTestRunner {

	public static void main(String[] args) {
		Scanner input; // input scanner object
		UnitTest test = new UnitTest(); //Create a UnitTest object.
		ArrayList<String> studentAnswers = new ArrayList<String>(); //Arraylist for studentAnswers
		ArrayList<Student> students = new ArrayList<>(); // ArrayList of Students.
		HashMap<String,ArrayList<String>> myMap = new HashMap<>(); //Hashmap for studentname and their avg
		
		//Read in the Student information from the file allExams.txt.
		try {
			input = new Scanner(new FileReader("allExams.txt"));
		} catch(Exception e) {
			System.out.println("Error");
			input = new Scanner(System.in);
		}
		
		//Create Student objects by using the last name and 
		//first name String objects read from the file.
		while (input.hasNext()) {
			String first = input.next(); //reads first name
			String last = input.next(); //reads last name
			
			studentAnswers = new ArrayList<String>(); //new arraylist of student answers
			students.add(new Student(first, last)); // Create a student object and add into students arraylist
			
			//for loop adds student answers into studentAnswers arraylist
			for(int i = 0; i<10;i++) {
				studentAnswers.add(input.next());
			}
			
			//creates string of student's last name first name with no spaces in lowercase
			String name = (last+first).toLowerCase();
			
			//uses concatenation of a Student’s last name followed by their first name
			//as key and the student's answer as the value
			myMap.put(name, studentAnswers);
		}
		input.close(); //close file
		
		//for loop to print results
		for(int i=0; i < students.size();i++) {
			//create concatenation of a Student’s last name followed by their first name
			//in order to get their answers from the hashmap
			String name = (students.get(i).getLastName() + students.get(i).getFirstName()).toLowerCase();
			System.out.println(students.get(i).getFirstName() + " " + students.get(i).getLastName() + " " + test.calculateGrade(myMap.get(name)));
			//send student answers to calculateGrade function in UnitTest in order
			//to get student average
			
			//set the average using setAverage function from Student
			students.get(i).setAverage(test.calculateGrade( myMap.get(name)));
		}
		
		//arraylist to store student averages
		ArrayList<Double> all = new ArrayList<Double>(); 
		
		double mean = 0; // intitalize mean
		//for loop adds all student averages to arraylist and 
		//sums into mean
		for(int i = 0; i < students.size(); i++) {
			all.add(students.get(i).getAverage());
			mean += students.get(i).getAverage();
		}
		//sort array 
		Collections.sort(all);  
		mean = mean / 10; // get mean
		double range  =  all.get(all.size()-1) - all.get(0); // get range
		//print results
		System.out.println("The class range is : " + range);
		System.out.println("The class mean is : " + mean);
	}

}
