public class Issue 
{

	private String opinionStatus;   
	private int numPositiveReason; 
	private int numNegativeReason;
	private double sentiPositive;
	private double sentiNegative; 
	private int numTransition; 
	private double timeSpend;
	private boolean OpinionPositive;
	
	private static int a,b;
	
	public static WordCount OBJwordCount;

	public Issue() 
	{
		this.opinionStatus="?";
		this.numPositiveReason=0;
		this.numNegativeReason=0;
		this.sentiPositive=0.0;
		this.sentiNegative=0.0;
		this.numTransition=0;
		this.timeSpend=0.0;
	
	}
	
 
       public String getOpinion() 
       {
		     return opinionStatus;
	   }

       public void setOpinion(String newOpinion) 
       {
		     this.opinionStatus = newOpinion;
	   }
		   
	   public int getNumPositive() {
			   return numPositiveReason;
	   		}

	   public void setNumPositive(int newNumPositive) {
			     this.numPositiveReason = newNumPositive;
	   		}
	   
	   public int getNumNegative() {
		   return numNegativeReason;
	   		}

	   public void setNumNegative(int newNumNegative) {
		     this.numNegativeReason = newNumNegative;
	   		}
	   
	   public double getSentiPositive() {
		   return numPositiveReason;
   			}

	   public void setSentiPositive(double NewSentiPositive) {
		     this.sentiPositive = NewSentiPositive;
   			}
	   
	   public double getSentiNegative() {
		   return numNegativeReason;
   			}

	   public void setSentiNegative(double NewSentiNegative) {
		     this.sentiNegative = NewSentiNegative;
   			}
	   
	   public int getNumTrans() {
		   return numTransition;
	   		}

	   public void setNumTrans(int newNumTransition) {
		     this.numTransition = newNumTransition;
	   		}
	   
	   public double getTime() {
		   return timeSpend;
   			}

	   public void setTime(double NewTimeSpend) {
		     this.timeSpend = NewTimeSpend;
               }

       public boolean isOpinionPositive(){
           return OpinionPositive;
       }       
          
       public void isOpinionPositive (boolean NewOpinionPositive) {
            this.OpinionPositive = NewOpinionPositive;
          }
	   
	   public static WordCount getWord() {
		   return OBJwordCount;
	   }
	   
	   public static void setWord(int Newa, int Newb) {
		   a = Newa;
		   b = Newb;
		   WordCount.setNumVowel(a);
		   WordCount.setNumWord(b);
	   }

	   public String toString()
	   {
        String str="";
        str+="\nOpiniont Status: \t"+opinionStatus+"\n";        
        str+="\nNumber of Positive reasons: \t"+numPositiveReason+"\n";  
        str+="\nNumber of Negative reasons: \t"+numNegativeReason+"\n";  
        str+="\nScore of all positive sentiment: \t"+sentiPositive+"\n";  
        str+="\nScore of all negative sentiment: \t"+sentiNegative+"\n";  
        str+="\nNumber of Transition words: \t"+numTransition+"\n";  
        str+="\nTime Spend (mins): \t"+timeSpend+"\n";  
        return str;
    }
}