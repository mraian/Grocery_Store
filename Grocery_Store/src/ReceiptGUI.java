import java.awt.Container;
import java.awt.TextArea;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
/**
 * @author David Yu
 * project 2
 * @labSection 11B 
 * 
 * ReceiptGUI class to create a graphical user interface for the
 * output of results
 * it includes a method called CreateGui
 */

public class ReceiptGUI extends JFrame {
	
	
	
	        /**
             *CreateGui method to create a frame, content
             *and text area
             * @param result  this is type String used to output result
             * @return void
             */	
	        public void CreateGui(String result){
	        	
	        	//creates frame
	        	ReceiptGUI frame = new ReceiptGUI();
	        	  
	        	frame.setDefaultCloseOperation(ReceiptGUI.EXIT_ON_CLOSE);
	        	frame.setSize( 400,380);//width, height);
	            frame.setLocation(500,200);//x, y);
	              
	        	//create content pane 
	        	Container myContentPane = frame.getContentPane();
	        	//create text area
	        	TextArea textArea = new TextArea();
	        	//put the text area inside the content pane
	        	myContentPane.add(textArea);
	        	//put the results into the text area
	        	textArea.setText(result);
	        	
	        	frame.setVisible(true);
	       
}
	        
	
	
	            	
	            
	            
	            
	
}
