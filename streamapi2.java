package abc;

import java.util.*;
import java.util.stream.*;
class Student45{
	int id;
	String name;
	
	Student45(int id,String name){
		this.id=id;
		this.name=name;
	}
}

public class streamapi2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        List<Student45> stud=Arrays.asList(
        		new Student45(1,"xyz"),
        		new Student45(2,"alice"),
        		new Student45(3,"abc")
        );
        List<String> names=stud.stream().map(s->s.name).collect(Collectors.toList());
        System.out.println(names);
	}

}
