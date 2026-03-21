package abc;

import java.util.*;

public class streamapi4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        List<Integer> l1=List.of(10,30,34,45,23,78,10);
        List<Integer> l2=l1.stream().distinct().skip(1).limit(4).toList();
        System.out.println(l2);
        
        long c2=l1.stream().skip(1).limit(4).count();
        System.out.println(c2);
        
        long c=l1.stream().count();
        System.out.println(c);
        
        
	}

}
