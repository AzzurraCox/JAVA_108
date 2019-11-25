import java.util.Scanner;

public class issue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
	    issues issueOBJ = new issues();
	    WordCount word = new WordCount(); 
	    
	    String OpinionStatus;
	    int numPositiveReason;
	    int numNegativeReason;
	    double sentiPositive;
	    double Negative;
	    int numTransition;
	    double timeSpend;
	    int a;
	    int b;
	    
	    
	    System.out.println("Input ");
	    
	    System.out.print("Opinion Status: ");
	    OpinionStatus = scan.nextLine();
	    issueOBJ.setOpinion(OpinionStatus);
	    
	    System.out.print("Number of vowels: ");
	    a = scan.nextInt();
	    
	    System.out.print("Number of words: ");
	    b = scan.nextInt();
	    
	    issueOBJ.setWord(a, b);
	    
	    
	    System.out.println(issueOBJ.getOpinion());
	    System.out.println(word.getNumVowel());
	    System.out.println(word.getNumWord());
	}

}
