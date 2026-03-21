package abc;

import java.util.*;
import java.util.stream.*;

class Student46{
	int id;
	String name;
	int salary;
	
	Student46(int id,String name,int salary){
		this.id=id;
		this.name=name;
		this.salary=salary;
	}
}

public class streamapi3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        List<Student46> stud=Arrays.asList(
        		new Student46(1,"xyz",61000),
        		new Student46(2,"alice",4500000),
        		new Student46(3,"abc",34000)
        );
        List<String> names=stud.stream().filter(e->e.salary>60000).map(s->s.name).collect(Collectors.toList());
        System.out.println(names);
	}

}
