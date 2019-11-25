
public class issues {

	private String opinionStatus;   
	private int numPositiveReason; 
	private int numNegativeReason;
	private double sentiPositive;
	private double sentiNegative; 
	private int numTransition; 
	private double timeSpend;
	
	private static int a,b;
	
	public static WordCount OBJwordCount;
	
 
	   public String getOpinion() {
		     return opinionStatus;
	   		}

	   public void setOpinion(String newOpinion) {
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
	   
	   public WordCount getWord() {
		   return OBJwordCount;
	   }
	   
	   public void setWord(int Newa, int Newb) {
		   this.a = Newa;
		   this.b = Newb;
		   WordCount.setNumVowel(a);
		   WordCount.setNumWord(b);
	   }
}