class Factorial {
int factR(int n) {
int resutl;
if(n==1) return 1;
result = factR(n-1) * n;
return result;
}

int factR(int n) {
int t, result;

result = 1;
for(t=1; t <= n; t++) result *= t;
return result;
}
}
class Resursion {
public static void main(String args []) {
Factorial f = new Factorail();

System.out.println(("Factorials using recursive method.");
System.out.println("Factorial of 3 is " + factR(3));
System.out.println("Factorial of 4 is " + factR(4));
System.out.println("Factorial of 5 is " + factR(5));

System.out.println(("Factorials using iterative method.");
System.out.println("Factorial of 3 is " + factR(3));
System.out.println("Factorial of 4 is " + factR(4));
System.out.println("Factorial of 5 is " + factR(5));
}
}