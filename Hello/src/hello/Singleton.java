package hello;

public class Singleton {
static Singleton a;
private static Singleton getObject() {
	
	if(a==null) {
	
		a=new Singleton();
	}
	return a;
	}
private void empID() {
System.out.println("EmpId is 1245");

}
public static void main(String[] args) {
Singleton object = getObject();
 object.empID();
System.out.println(System.identityHashCode(object));

Singleton object2=getObject();
System.out.println(object2);

Singleton object3=getObject();
System.out.println(object3);
}
}
