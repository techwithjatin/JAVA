package abc;

interface int2{
	void show();
}

class Demo1{
	public void display() {
		System.out.println("reference to static method");
	}
}

public class  methodinterfacewithoutstring {

	public static void main(String[] args) {
		Demo1 d=new Demo1();
		int2 i1=d::display;
		i1.show();

	}

}
