import java.util.StringTokenizer;
/**
 * @author David Yu
 * projct 2
 * @labSection 11B 
 * 
 *Create a class for the database. 
 *It contains a linked list which will store 
 *all the ProcudeItems (that will be read in from a file).
 *This class contains methods that will 
 *return the name and the price of an item with a given code:
 *String getName(String code); float getPrice(String code);
 *
 */
public class Database{
	         /**
	          * Object named ProduceList is created from ProduceItem Class
	          * 
	          */
	         private ProduceList LinkedList = new ProduceList();
	     
	         /**
	          * CreateList method used to create a linked list of ProduceItem
	          * by reading from a text file and filling the appropriate 
	          * parameters(code, name, and price) into the linked list
	          * @return void
	          */
	         public void CreateList(){
	        	 
	                //read text file and read the first line
	                TextFileInput in = new TextFileInput("Database2.txt");
	                String line = in.readLine();
	            	
	                //declare and initialize i as count
	                int i=0;
	               
	                
	                //while the line is not empty, keep reading
	            	while(line !=null){
	        		//read each token, delimiter is ","
	                StringTokenizer LineToken = new StringTokenizer(line, ",");
		        	//Each token is assigned to appropriate parameters of ProduceItem class
	            String t = (LineToken.nextToken());
	        		String c = (LineToken.nextToken());
	        		String n = (LineToken.nextToken());
	        		Float p = (Float.parseFloat(LineToken.nextToken()));
	        		//a linked list of Producelist is created
	        	
	        		if(t.equals("V")){
	        			ProduceItem List = new Vegetable(c, n, p);
	        			LinkedList.append(List);
	        		}
	        		
	        		if(t.equals("F")){
	        			ProduceItem List = new Fruit(c, n, p);
	        			LinkedList.append(List);
	        		}
	        		
	        	
	        		
	        		i++;
	        		line = in.readLine();
	        
	        	    }
	                in.close();
	                }
	         
	         /**
	          * getName method used to return the name with
	          * a given code.
	          * @param code    the given code needed to return the name
	          * @return String the name returned
	          */
	         public String getName(String code){
	        	   
	        	   
	        	   ProduceNode p = LinkedList.first.next;
	        	   
	        	   for(int i=0; i<24; i++)  
	        	   {   
	        		if( p.data.getCode().equals(code))
	        		
	        			return p.data.getName();
	        	   
	        	   p = p.next;
	        	   }
	        	   return null;
	        		}
	        
	         /**
	          * getPrice method used to return price with
	          * a given code
	         * @param code  the given code needed to return the name
	         * @return float the price returned
	         */
	         public float getPrice(String code){
	        	
	        	   ProduceNode p = LinkedList.first.next;
	        	   for(int i=0; i<24; i++)
	        		{
	        		   if(p.data.getCode().equals(code))
	        		
	        			return p.data.getPrice();
	        	   p = p.next;
	        		}
	        	        return 0.00f;       
	                }
	        
}
	         