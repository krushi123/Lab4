import java.applet.*;
import java.awt.*;
import java.util.*;
public class First extends Applet{
 TextField a=new TextField(10);
 public void init()
 {    Scanner sc=new Scanner(System.in);
      String k=sc.nextLine();
       a.setText("Hello "+k);
       add(a);
 }
}