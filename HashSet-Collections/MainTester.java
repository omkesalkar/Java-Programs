package Jan_06_HashSet.StudentManagement;

import java.util.Scanner;

public class MainTester
{
	public static void main(String[] args) throws InterruptedException
	{
		Scanner sc = new Scanner(System.in);
		
		StudentManagement studentManagement = new StudentManagement();
		
		while(true)
		{
			Thread.sleep(1000);
			System.out.println("\n--------------- Student Management ---------------");
			System.out.println("1. Add Student");
			System.out.println("2. Remove Student");
			System.out.println("3. Display Student");
			System.out.println("4. Exit");
			System.out.println();
			
			System.out.print("Enter your choice (1/2/3/4): ");
			int choice = sc.nextInt();
			System.out.println();
			
			if(choice <= 0 || choice >= 5)
			{
				System.err.println("Error... Invalid choice");
				Thread.sleep(1000);
			}
			else
			{
				switch(choice)
				{
				case 1: 
					System.out.print("Enter the student name: ");
					sc.nextLine();
					String addName = sc.nextLine();
					
					if(addName.isEmpty())
					{
						throw new NullPointerException();
					}
					else
					{
						studentManagement.addStudent(addName);					
					}
					break;
					
					
				case 2: 
					System.out.print("Enter student name to remove: ");
					sc.nextLine();
					String removeName = sc.nextLine();
					
					if(removeName.isEmpty())
					{
						throw new NullPointerException();
					}
					else
					{
						studentManagement.removeStudent(removeName);								
					}
					break;
					
					
				case 3: 
					studentManagement.displayStudents();
					break;
					
					
				case 4: 
					System.out.println("Exiting the program... Please wait");
					Thread.sleep(1000);
					System.out.println("System exited successfully");
					System.exit(0);
					break;
				}
				
			}
	
		}		
	}
}
