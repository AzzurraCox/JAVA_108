public class WordCount 
{

	private static int numVowel;
	private static int numWord;

	public WordCount()
	{
        numVowel=0;
        numWord=0;
    }
	
    public static int getNumVowel() 
    {
		   return numVowel;
	}

    public static void setNumVowel(int newNumVowel) 
    {
			 numVowel = newNumVowel;
	}
	
    public static int getNumWord() 
    {
		   return numWord;
	}

    public static void setNumWord(int newNumWord) 
    {
			 numWord = newNumWord;
	}
}