/**
 * @author David Yu
 * project 2
 * @labSection 11B 
 * 
 *An abstract class called ProduceItem with three instance variables 
 *for the code (String), name (String) and price (float). 
 *This abstract class include appropriate constructors, get/set methods 
 *and overrides of class Object.
 *
 */
 public abstract class ProduceItem {
    
                         public String code;
                         public String name;
                         public float price;

               //no-argument constructor
                public ProduceItem(){
	
	                     code = "";
	                     name = "";
	                     price = 0.00f;
                }

               //3-argument constructor
               public ProduceItem(String c, String n, float p){
	
	                    code = c;
	                    name = n;
	                    price = p;
                }
               /**
                *setter method
                * @param c specified string
                * @return void
                */	      
               public void setCode(String c){
	
	           code = c;
               }

               /**
                *setter method
                * @param n specified string
                * @return void
                */	
               public void setName(String n){
	
	                     name = n;
               }

                /**
                 *setter method
                 * @param p specified float
                 * @return void
                 */	
                public void setPrice(float p){
	
	                      price = p;
                }

                /**
                 *getter method
                 * @param
                 * @return String get code
                 */	
                public String getCode(){
	
	                      return code;
                 }

                /**
                 *getter method
                 * @param
                 * @return String get name
                 */	
                public String getName(){
	
	                       return name;
                 }

                /**
                 *getter method
                 * @param
                 * @return float get price
                 */	
                public float getPrice(){
	
	                      return price;
                 }
}


