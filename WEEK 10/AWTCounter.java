import java.awt.*;        
import java.awt.event.*;   
 
// Terminate using stop button in java eclipse
@SuppressWarnings("serial")
public class AWTCounter extends Frame implements ActionListener {
   private Label lblCount;     
   private TextField tfCount; 
   private Button btnCount;    
   private int count = 0;     
 
  
   public AWTCounter () {
      setLayout(new FlowLayout());
         
      lblCount = new Label("Counter"); //  Label
      add(lblCount);                   // adding Label
 
      tfCount = new TextField(count + "", 10); 
      tfCount.setEditable(false);       // can not edit
      add(tfCount);                     // adding TextField
 
      btnCount = new Button("Count");   // Button
      add(btnCount);                    // adding Button
      btnCount.addActionListener(this);
          
      setSize(300, 100);       // "super" Frame sets initial size
      setTitle("AWT Counter"); // "super" Frame sets title
      setVisible(true);        // show "super" Frame
   }
 
   
   @Override
   public void actionPerformed(ActionEvent evt) {
      ++count;                     
      tfCount.setText(count + ""); 
      }
    public static void main(String[] args) {
      
    	new AWTCounter();
   }
}