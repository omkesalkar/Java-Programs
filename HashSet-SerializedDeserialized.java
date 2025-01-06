
package Jan_06_HashSet.FruitsSerializalable;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.HashSet;

public class HashSetSerialization 
{
	public static void serializeHashSet(HashSet<String> set, String filename)
	{
		try(ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(filename)))
		{
			oos.writeObject(set);
			System.out.println("HashSet serialized successfully to "+ filename);
		}
		catch(IOException e)
		{
			System.out.println("Error during serialization: "+ e.getMessage());
		}
	}
	
	@SuppressWarnings("unchecked")
	public static HashSet<String> deserializeHashSet(String filename)
	{
		try(ObjectInputStream ois = new ObjectInputStream(new FileInputStream(filename)))
		{
			return (HashSet<String>) ois.readObject();
		}
		catch(IOException | ClassNotFoundException e)
		{
			System.out.println("Error during deserialization: "+ e.getMessage());
			return new HashSet<>();
		}
	}
	
	public static void main(String[] args) 
	{
		HashSet<String> fruits = new HashSet<String>();
		fruits.add("Mango");
		fruits.add("Apple");
		fruits.add("Banana");
		
		String filename = "D:\\New\\fruits.txt";
		
		//Serialized the HashSet
		serializeHashSet(fruits, filename);
		
        //De-serialized the HashSet
		HashSet<String> deserializedFruits = deserializeHashSet(filename);
		
		if(deserializedFruits.isEmpty()) {
			System.out.println("The deserialized HashSet is empty");
		} else {
			System.out.println("Deserialization HashSet: "+ deserializedFruits);
		}
		
	}
	
}
