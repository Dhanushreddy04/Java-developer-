package anudip;

public class Method {
	int id;
	String name;
	int marks;
	
	void fun() {
	System.out.println("student is fun");
}


	public static void main(String[] args) {
		Method obj=new Method();
		obj.fun();
		obj.id=26;
		obj.name="Dhanush";
		obj.marks=96;
		System.out.println(obj.id);
		System.out.println(obj.name);
		System.out.println(obj.marks);

	}

}
