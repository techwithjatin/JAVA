package abc;

interface int1{
	void show();
}

class Demo{
	public static void display() {
		System.out.println("reference to static method");
	}
}
public class methodinterface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int1 i1=Demo::display;
		i1.show();
		

	}

}
