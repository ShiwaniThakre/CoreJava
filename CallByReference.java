import java.util.*;
public class CallByReference {
	int x=10;
	int y=20;
 public void callByref(CallByReference t)
 {
	 t.x=100;
	 t.y=50;
 }
 public static void main(String[]args)
 {
	 CallByReference ts=new CallByReference();
	 System.out.println("Before: "+ts.x+" "+ts.y);
	 ts.callByref(ts);
	 System.out.println("After: "+ts.x+" "+ts.y);
	 
 }
}
