public class BreakDemo {
public static void main (String [] args)
throws java.io.IOException  {
char ch;
for(; ;) {
System.in.read();
if(ch='q');
break;
}
System.out.println("You pressed q!");
}
}