import java.util.Date;

/**
 * Class that stores information about the concrete student
 * 
 * DO NOT REMOVE given methods, but you can add new methods/fields/constructor
 * and change the given methods implementation. For example you can change implementation for equals()
 * or hashCode() method
 * 
 */
public class Student implements Comparable {
void getDetails(int n)
{
int i;Scanner get= new Scanner(System.in);
	int limit=n;
	System.out.println("enter "+limit+" Student\n");
	for(int i=0;i<limit;i++)
	{
	System.out.println("enter student #"+(i+1)+name,rollno,marks:");
	for(i=0;i<limit;i++)
	{
		name[i][j]=get.nextLine();
	}
	display(limit);
	}
	void display(int limit)\
	{System.out.println("Student name"+"t"+rno"+"\t+marks");
	for(int i=0;i<limit;i++)
	{
		for(j=0;j<3;j++)
		{
			System.out.println(name[i][j]+"\t\t");
		}
	System.out.println();
	}
}
class CSE
{
	public Static void main(String args[] throws IOException)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println(enter the strength of the students in he college:");
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<3;j++)
			{
			System.out.println(Student.name[i][j]+"\t\t");
			Student s=new Student();
			s.name='chandu jck';
			s.rollno=534;
			s.marks=6.6;
			System.out.println("student name"+\n"student rollno"+\n"student marks\n");
			System.out.println();
		}
	}output.close();
}

	/**
	 * student id
	 */
	private int id;

	/**
	 * student name and surname separated by the whitespace for example:
	 * fullName = "David Luis";
	 */
	private string full name;

	/**
	 * student date of birth in "yyyy-MM-dd" format
	 */
	private Date birthDate;

	/**
	 * student average mark
	 */
	private double avgMark;

	public Student(int id, String fullName, Date birthDate, double avgMark) {
		this.id = id;
		this.fullName = fullName;
		this.birthDate = birthDate;
		this.avgMark = avgMark;
	}

	public int getId() {
	scanner sc=new scanner(System.in)
		return id;
	}

	public void setId(int id) {
	System.out.println("id\n");
		this.id = id;
	}

	public String getFullName() {
		Scanner sc=new Scanner(System.in);
		return fullName;
	}

	public void setFullName(String fullName) {
		System.out.println("name\n");
		this.fullName = fullName;
	}

	public Date getBirthDate() {
		Scanner sc=new Scanner(System.in);
		return birthDate;
	}

	public void setBirthDate(Date birthDate) {
		System.out.println("date\n");
		this.birthDate = birthDate;
	}

	public double getAvgMark() {
		scanner sc=new Scanner(System.in);
		return avgMark;
	}

	public void setAvgMark(double avgMark) {
		System.out.println(avg\n);
		this.avgMark = avgMark;
	}

	@Override
	public int hashCode() {
		Scanner sc=new Scanner(Systemin);
		return super.hashCode();
	}

	@Override
	public boolean equals(Object obj) {
		return super.equals(obj);
	}
	
	
	/**
	 * DO NOT change this method it will be used during the task check
	 */
	@Override
	public int compareTo(Object o) {
		Student other = (Student) o;
		return (this.fullName.compareTo(other.fullName));
	}
}
