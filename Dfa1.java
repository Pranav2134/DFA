import java.util.*;
public class Dfa1
{   public enum States
	{

		q1(false),q2(false),q3(false),q4(false),q5(true);
		final boolean accept;
		States(boolean accept)
		{this.accept=accept;}
		States a;
		States b;
		static
		{
            q1.a=q1;q1.b=q2;
            q2.a=q1;q2.b=q3;
            q3.a=q4;q3.b=q2;
            q4.a=q5;q4.b=q2;
            q5.a=q1;q5.b=q2;
		}
		States transition(char ch)
		{
           switch(ch)
           {
           	case 'a': return this.a;
           	case 'b': return this.b;
           	default: throw new RuntimeException("symbol is " + "not in the alphabet");
           }
		}
	}
	public static void main(String[] args)
	{
	  Scanner scan = new Scanner(System.in);
	  States q=States.q1;
	  System.out.println("enter string over (a,b)");
	  String a=scan.next();
	  int i=0;
	  for(i=0;i<a.length();i++)
	 {

       System.out.println("String member scanned = " + a.charAt(i));
       q=q.transition(a.charAt(i));
	 }
       if(q.accept==true)
       System.out.println("true");
       else
       System.out.println("false"); 
	}
}
