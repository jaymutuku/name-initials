package name.nameinitials;

import java.util.List;
import java.util.ArrayList;

/**
  * NameInitials.java -This class returns all initials in a string name
  * as a list,it also returns surname as a string.
  *
  */
public class NameInitials
{
	//A name whose initials and surname will be extracted
	 String fullname = "Donald John Trump";
	 int count = 0;                               // Number of names
	 char separator =' '; // names separator

    public  List extractInitials()
     {
      // create an arraylist object to all the initials
       List s = new ArrayList();

	// Determine the number of substrings
	      int index = 0;
	      do {
	        ++count;                                   // Increment count of names
	        ++index;                                   // Move past last position
	        index = fullname.indexOf(separator, index);
	      } while (index != -1);
        //exclude the last substring,its the surname
            count-=1;

	 // Extract the substring into an array
	    String[] subStr = new String[count];         // Allocate for substrings
		index = 0;                                   // Substring start index
	    int endIndex = 0;// Substring end index

		for(int i = 0; i < count; i++)
		{
	      endIndex = fullname.indexOf(separator,index);  // Find next separator

		  if(endIndex == -1)
		   {                    // If it is not found
		  subStr[i] = fullname.substring(index);       // extract to the end
		   }
		 else {                                         // otherwise
			   subStr[i] = fullname.substring(index, endIndex);   // to end index
			   }
			      index = endIndex + 1;  // Set start for next cycle

           //get the first character for each name
           //add them to the list
	    s.add(subStr[i].substring(0,1));

	  }

        System.out.print(s);

         return s;


     }//extractInitials

    public String extractSurname()
     {
		 //get the last index of separator
		 int lastSeparator=fullname.lastIndexOf(separator);

		 String surname=fullname.substring(lastSeparator);

		 System.out.print(surname);

        //omit the leading whitespace
		 return surname.trim();
	 }

	 public static void main(String args[])
	 {
		 NameInitials t =new NameInitials();

		   System.out.print("You are:");
		   t.extractInitials();
		   t.extractSurname();
		   System.out.print('\n');
	 }

}