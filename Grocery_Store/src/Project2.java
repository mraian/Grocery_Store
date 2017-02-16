import java.text.DecimalFormat;
import java.util.StringTokenizer;
/**
 * @author David Yu
 * project 2
 * @labSection 11B 
 * This is the class with main method. Its purpose is to
 * read another text file and work with classes to output the results
 */
 
public class Project2 {

	      
	          public static void main(String[] args){
    	
                  //create two arrays for the information read from transaction.txt        	  
	              String [] TranCode = new String[20];
        	      float [] TranWeight = new float[20];
        	      //read text file
        	      TextFileInput in2 = new TextFileInput("Transactions2.txt");
        	   
        	      //read the first line   	   
        	      String Line = in2.readLine(); 
                  //declare and initialize i as count
        	      int i=0;
        	      //while line is not empty, keep reading
                  while(Line !=null){
        	          //read each token on the line
                      StringTokenizer TranTokens = new StringTokenizer(Line, ",");
        	          //store each token to the appropriate arrays
        		      TranCode[i] = TranTokens.nextToken();
        		      TranWeight[i] =Float.parseFloat(TranTokens.nextToken());  
        		      i++;
        		      Line = in2.readLine();
        	      }
        	  
                  in2.close();
        	     
                  //create Database object 
                  Database db = new Database();
        	      //call CreateList method
        	      db.CreateList();
        	      //start to store output into the string named "result"
        	      String result ="Name"+"\t"+"Price"+"\t"+"Weight"+"\t"+"Total Cost"+"\n";
        	  
        	      //store each items on the text file into the String "result"
        	      for(int j =0; j<i; j++){
        		  
        		  result += db.getName(TranCode[j])+ "\t";
        		  
        		  result += db.getPrice(TranCode[j])+ "\t";
        		  
        		  result += TranWeight[j]+ "\t";
        		  
        		  result += db.getPrice(TranCode[j])*TranWeight[j]+"\t"+"\n";
        		  
        		   }
        	  
                 float sum=0;
                 //get the sum of the totals
                 for(int s=0; s<i; s++){
            	 
                	 sum += db.getPrice(TranCode[s])*TranWeight[s];
                  }
                 //DecimalFormat to print the total bil using only two decimal places
                 sum = Float.parseFloat(new DecimalFormat("##.##").format(sum));
                 //store the last information into "result"
                 result = result +"The total cost of all purchases is        "+sum+"\n";
            	 //create ReceiptGUI object
                 ReceiptGUI receipt = new ReceiptGUI();
                 //call the CreateGui method to output the results in gui.
                 receipt.CreateGui(result);
  }
}


