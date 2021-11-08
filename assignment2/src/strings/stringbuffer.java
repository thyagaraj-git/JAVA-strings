package strings;

public class stringbuffer {
public static void main(String args[])
{
/*StringBuffer s1=new StringBuffer("StringBuffer");
s1.append(" , is a peer class of string");
s1.append(", that provides much of");
s1.append(" the functionality of strings");
System.out.println(s1);
	
	StringBuffer l1=new StringBuffer("it is used to_ at the specified index position");
	l1.insert(14, "built");
	System.out.println(l1); */
	
	StringBuffer s1= new StringBuffer("This method returns the reversed object on which it is called");
	s1.reverse();
	System.out.println("reversed string:"+s1);
}
}
