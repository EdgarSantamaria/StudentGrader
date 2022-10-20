This project uses three classes that can be used by an educator to grade multiple choice exams using standard
Java Classes such as Strings, Lists and Maps.

Student class creates an object of Student which holds a student's first name, last name, and their average.

UnitTest class object represents the exam that the students are being graded on, this class will read the correct
exam answers from a file and store them in an ArrayList. This class also includes a calculateGrade function which takes
in an ArrayList of Strings as a parameter, this function will take the student's answers, grade them, then return a percentage
[0.0,100.0] as a double.

UnitTestRunner is the runner for this project, it will read all the student's answers and implement the Student and UnitTest class to 
grade the student's tests, it will also input all the student's information as well as their grade into a hashMap and print out their information.
