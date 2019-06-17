class Space {
public static void main(String [] args)
throws java.io.IOException {
char ch;
int spaces = 0;
System.out.print("Enter a period to stop.");
do {
ch = (char) System.in.read();
if(ch == ' ') spaces++;
}
while(ch!='.');
System.out.println("Space: " + spaces);
}
}