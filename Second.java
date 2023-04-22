import java.applet.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import javax.lang.model.util.ElementScanner6;
public class Second extends Applet 
{  Choice color=new Choice();
  
  public void init()
  {
    
    color.addItem("Red");
    color.addItem("Blue");
    color.addItem("Green");
    add(color);
    
  
        
  }
  public void paint(Graphics g)
    { 
      String colour=color.getSelectedItem();
      int R=0,G=0,B=0;
      if(colour=="Red")
        R=100;
      else if(colour=="Green")
        G=100;
      else if(colour=="Blue")
       B=100;
      Color colorCode=new Color(R,B,G);
      this.setBackground(colorCode);

    }
  
}