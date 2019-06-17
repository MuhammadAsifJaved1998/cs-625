class Test7 {
int a, b;

Test(int i, int j) {
a=i;
b=j;
}
void change(Test ob) {
ob.a = ob.a + ob.b;
ob.b = - ob.b;
}
}
class PassObRef {
public static void main(String args []) {

System.out.println("ob.a and ob.b before call : " + ob.a + " " + ob.b);
ob.Change(ob);
System.out.println("ob.a and ob.b after call : " + ob.a + " " + ob.b);
}
}