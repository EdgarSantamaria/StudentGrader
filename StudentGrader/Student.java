
public class Student {

	private String lastName;
	private String firstName;
	private double average;
	
	public Student(){	
	}
	
	public Student(String a, String b) {
		setFirstName(a);
		setLastName(b);
		setAverage(0);
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public double getAverage() {
		return average;
	}

	public void setAverage(double average) {
		this.average = average;
	}
}
