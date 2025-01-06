import java.util.HashSet;
import java.util.Set;

public class StudentManagement 
{
	private Set<String> students = new HashSet<>(); //To store the names of students
	
	
	//Method to add student in the HashSet
	public void addStudent(String name)
	{		
		if(students.contains(name))
		{
			System.out.println(name +" is already existed in the HashSet.");
		}
		else
		{
			students.add(name);
			System.out.println(name +" added successfully in the HashSet.");
		}
	}
	
	
	//Method to remove student from HashSet
	public void removeStudent(String name)
	{
		if(students.contains(name))
		{
			students.remove(name);
			System.out.println(name +" is removed successfully from HashSet.");
		}
		else
		{
			System.err.println(name +" is not found/existed in the Hashset");
		}
	}
	
	//Method to display all the students
	public void displayStudents()
	{
		if(students.isEmpty())
		{
			System.out.println("HashSet is Empty!! Not a single student existed in HashSet.");
		}
		else
		{
			students.forEach(str -> System.out.println(str));
		}
	}
	
}
