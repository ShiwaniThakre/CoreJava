import java.awt.*;
public class LabelDemo {
	LabelDemo()
	{
		Frame fm =new Frame();
		Label l=new Label("Welcome to Java");
		fm.add(l);
		fm.setVisible(true);
		fm.setSize(400,400);
	}
	public static void main(String[]args)
	{
		LabelDemo obj1=new LabelDemo();
	}
}
