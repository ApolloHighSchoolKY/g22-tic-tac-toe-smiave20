// A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

//We have all that we need to import and use a Scanner
import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Lab24d
{
	//throws IOException is being used instead of (try-catch) route.
	public static void main( String args[] ) throws IOException
	{
		//Print five strings
		Scanner file = new Scanner (new File("lab24d.dat"));

		while(file.hasNext())
				System.out.println(file.nextLine());
		file.close();







	}
}



