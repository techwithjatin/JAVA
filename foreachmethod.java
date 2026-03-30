package abc;

import java.util.*;

public class foreachmethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        List<Integer> l=new ArrayList<>();
        l.add(34);
        l.add(67);
        l.add(10);
        l.add(45);
        l.add(56);
        
//        l.forEach(i->System.out.println(i));
        
        l.forEach(i->{
        	if(i%2==0) {
        		System.out.println(i);
        	}
        });
        
//        List<String> l2=new ArrayList<>();
//        l2.add("alex");
//        l2.add("hii");
//        l2.add("jatin");
//        
//        
//        l2.forEach(s->System.out.println(s+"!"+s.toUpperCase()));
        
//        List<String> abc=new ArrayList<>();
//        abc.add("alex");
//        abc.add("hii");
//        abc.add("jatin");
//        
//        abc.forEach(s->System.out.println("HELLO "+ s));
        
        List<String> xyz=new ArrayList<>();
        xyz.add("jatin");
        xyz.add("devvansh");
        xyz.add("kartik");
        
        xyz.forEach(s->System.out.println());
        
	}

}
