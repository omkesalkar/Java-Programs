import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Duplicates 
{
	// Attribute: List of Integers
	private List<Integer> numberList;
	
	//No-Argument constructor
	public Duplicates()
	{
		this.numberList = numberList;
	}
	
	//Parameterized constructor
	public Duplicates(List<Integer> numberList)
	{
		this.numberList = numberList;
	}

	// Getter for numberList
	public List<Integer> getNumberList() {
		return numberList;
	}

	// Setter for numberList
	public void setNumberList(List<Integer> numberList) {
		this.numberList = numberList;
	}
	
	public List<Integer> getDuplicatesList()
	{
		if(numberList == null || numberList.isEmpty())
		{
			return null;
		}
		
		Set<Integer> seen = new HashSet<>();
		Set<Integer> duplicates = new HashSet<>();
		
		for(Integer num : numberList)
		{
			if(!seen.add(num))
			{
				duplicates.add(num);
			}
		}
		
		return new ArrayList<>(duplicates);
	}
	
	
	public static void main(String[] args) 
	{
        List<Integer> numbers = Arrays.asList(33, 45, 67, 89,33, 47, 21, 45);
        Duplicates duplicatesFinder = new Duplicates(numbers);
        
        List<Integer> duplicates = duplicatesFinder.getDuplicatesList();
        System.out.println("Duplicates: "+ duplicates);
    }
	
}
