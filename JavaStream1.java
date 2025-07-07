import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import org.junit.Assert;
import org.junit.Test;


public class JavaStream1 {
	

	 //count the number of the names starting with alphabet A in the list 
//@Test

	 public void regular() 
	
	{
		
	ArrayList<String> names = new ArrayList<String>();
	
	names.add("abheejet");
	names.add("alpha");
	names.add("parth");
	names.add("vivek");
	names.add("deep");
	names.add("adam");
	
	int i ;
	int count = 0;
	
	for(i=0 ; i<names.size();i++)
	{
		String actual = names.get(i);
		
		if(actual.startsWith("a"))
		{
			count++;	
		}	
	}
	
	System.out.println(count);

   }
	 
	 
//@Test

	 public void StreamFilter() 
	
	{
		 ArrayList<String> names = new ArrayList<String>();
			
			names.add("abheejet");
			names.add("alpha");
			names.add("parth");
			names.add("vivek");
			names.add("deep");
			names.add("adam");
			
		long c = names.stream().filter(s->s.startsWith("a")).count();
			System.out.println(c);
			
			
		//if you done want to create array 
	    long d =    Stream.of("akash","arohi","parth","vivek","adam").filter(s->
	          
	    {
	        	s.startsWith("a");
			    return true;
			
	        }).count();
	    
	   System.out.println(d);
	   
	   //print all the names of Arraylist 
	   names.stream().filter(s->s.length()>4).forEach(s->System.out.println(s));
	   
	   System.out.println(".......................................................");
	   
	   // limit the result
	   names.stream().filter(s->s.length()>4).limit(1).forEach(s->System.out.println(s));  
	   }
	   
	 
 //@Test
 
	   public void streamMap() 

	   {
	    
	    ArrayList<String> names = new  ArrayList<String>();
	    names.add("Man");
	    names.add("Woman");
	    names.add("Modern Myth : LGBTQ");
	 
	 
	   	 //print names of lenght > 4 with UPPERCASE
	   	 Stream.of("akash","arohi","partha","vivek","Adamm","Rama","Alekhya").filter(s->s.endsWith("a")).map(s->s.toUpperCase()).forEach(s->System.out.println(s));
	   	 
	   	 
	     System.out.println(".......................................................");	
	    	
	      	
	   	 //print names which have first letter as a with upper case and sorted 
	   	 List<String> names1 = Arrays.asList("Abhijit","Don","Alekhya","Adam","Rama");
	   	 names1.stream().filter(s->s.startsWith("A")).sorted().map(s->s.toUpperCase()).forEach(s->System.out.println(s));
	   	 
	   	 
	   	 System.out.println(".......................................................");
    	
	   	 //merging 2 diff list with sorted 
	   	 Stream<String> newStream = Stream.concat(names.stream(), names1.stream());
	   	 //newStream.sorted().forEach(s->System.out.println(s));
	   	 
	   	 // check if adam is present or not 
	   	 boolean flag = newStream.anyMatch(s->s.equalsIgnoreCase("Adam"));
	   	 System.out.println(flag);
	   	 Assert.assertTrue(flag);
	   	 
	   	  	 
	   }
		 

	   
@Test
	    
	public void streamCollect() 

{
	
	  List<String> list1 = Stream.of("akash","arohi","partha","vivek","Adamm","Rama","Alekhya").filter(s->s.endsWith("a")).map(s->s.toUpperCase())
			  .collect(Collectors.toList());
	  System.out.println(list1.get(0));
	  
	  
	  System.out.println("................................................................");
	  
	  
	  List<Integer> values = Arrays.asList(3,2,2,7,5,1,9,9,9,7,2,0,0,4);
	  
	  //print unique number of the array and sort the array
	  //distinct = remove duplicate
	  //sorted = to sort arraylist
	  values.stream().distinct().sorted().forEach(s->System.out.println(s));
	  
	  System.out.println("................................................................");
	  System.out.println("................................................................");
	  
	  //sorted the array - 3rtd index  
	  List<Integer> list2 = values.stream().distinct().sorted().collect(Collectors.toList());
	  System.out.println(list2.get(3));
	  
	  
	  
	
	
	
	
	
    }
 




 //continue 













}
	