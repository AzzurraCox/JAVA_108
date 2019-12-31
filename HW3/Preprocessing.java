/** 
 * Assignment #: 4
 * Name: §d¸t°¶
 * StudentID: 405530011
 * Description: This class is used to process lower case and remove stop words.
*/
import java.io.*;
import java.util.*;
public class Preprocessing {
	/**
	 *Processing the words of docset1 to lower case and export to docset2.txt.
	 */
	public void lowerCase()
	{
		String line;
		Scanner input=null;
		File file;
		FileWriter fw=null;
		try{
			file=new File ("src/docset1.txt");
			input=new Scanner(file);
			fw=new FileWriter("src/405530011_output.xml");
			while(input.hasNext())
			{
				
				line=input.nextLine().toLowerCase();
				fw.write(line);
				fw.flush();
				
			}
		}
		catch (FileNotFoundException e){
			System.out.println("The file path does not exist.");
		}
		catch(IOException e){
			System.out.println("I/O error.");
		}
		finally {
			input.close();
		}


	}
	
	/**
	 *Processing the words of docset2 to remove stop words and export to 405530011_output.xml.
	 */
	public void remove()
	{	
	ArrayList<String> myList= new ArrayList<String>();
	ArrayList<String> stop= new ArrayList<String> ();
	String line;
	String stop1;
	Scanner input1=null;
	Scanner input2=null;
	File file1;
	File file2;
	FileWriter fw=null;
	try{
		file1=new File("src/405530011_output.xml");
		file2=new File("src/stop_words.txt");
		input1=new Scanner(file1);
		input2=new Scanner(file2);
		while(input2.hasNext())
		{
			stop1=input2.next();
			stop.add(stop1);
		}
		while(input1.hasNext())
		{
			line=input1.next();
			myList.add(line);	
		}
		myList.removeAll(stop);
		fw=new FileWriter("src/405530011_output.xml");
		for(int i=0;i<myList.size();i++){
			String done=myList.get(i);
			fw.write(done+" ");
			fw.flush();
		}
		
	}
		catch (FileNotFoundException e){
			System.out.println("The file path does not exist.");
		}
		catch(IOException e){
			System.out.println("I/O error.");
		}
	finally{
		input1.close();
		input2.close();
	}
	}
	
}
	
	

