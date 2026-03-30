package abc;

interface Maths{
     int square(int x);
}


public class mathoperation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Maths m=(x)->x*x;
		System.out.println("square root:" + m.square(7));
		

	}

}
