public class Argument
{

    private boolean logicalSoundness; 
    private int numWeakness;
    private int numReasonProvided; 
    private int numParagraph; 

    private static int c,d;
	
      public static WordCount OBJwordCount;
      
      public Argument()
      {
            this.logicalSoundness=false; 
            this.numWeakness=0;
            this.numReasonProvided=0;
            this.numParagraph=0;
         
      }
	
    public boolean getLogical()
    {
          return logicalSoundness;
    }

    public void setLogical(boolean newLogical) 
    {
          this.logicalSoundness = newLogical;
    }

    public int getNumWeak() 
    {
          return numWeakness;
    }

    public void setNumWeak(int newNumWeak) 
    {
          this.numWeakness = newNumWeak;
    }

    public int getNumReason() 
    {
          return numReasonProvided;
    }

    public void setNumReason(int newNumReason) 
    {
          this.numReasonProvided = newNumReason;
    }

    public int getNumPara() 
    {
          return numParagraph;
    }

    public void setNumPara(int newNumPara) 
    {
          this.numParagraph = newNumPara;
    }

    public static WordCount getWord() 
    {
        return OBJwordCount;
    }

    public void setWord(int Newc, int Newd) {
        c = Newc;
        d = Newd;
        WordCount.setNumVowel(c);
        WordCount.setNumWord(d);
    }

    public String toString()
    {
      String str="";
      str+="\nLogical Soundness: \t"+logicalSoundness+"\n";
      str+="\nNumber of weakness: \t" +numWeakness+"\n";
      str+="\nNumber of reasons: \t"+numReasonProvided+"\n";
      str+="\nNumber of paragraphs: \t"+numParagraph+"\n";
      return str;
  }
}
