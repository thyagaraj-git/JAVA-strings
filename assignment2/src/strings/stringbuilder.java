package strings;

public class stringbuilder {
public static void main(String args[])
{
	/*StringBuilder s1=new StringBuilder("StringBuilder");
	s1.append(", is a peer class of string, that provides much of, the functionality of string");
	System.out.println(s1);*/
	
	/*StringBuilder l1=new StringBuilder("it is used to_ at the specified index position");
	l1.insert(14, "build");
	System.out.println(l1);*/
	
	StringBuilder s1= new StringBuilder("This method returns the reversed object on which it is called");
	s1.reverse();
	System.out.println("reversed string:"+s1);
}
}
