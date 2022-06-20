package com.Map;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Main {
	
	
	public static void main(String[] args) {
		HashMap<String,Student> hm = new HashMap<>();
		
		hm.put("Maharastra",new Student(10,"Ganesh",950));
		hm.put("Tamilnadu",new Student(12,"Surya",850));
		hm.put("Telangana",new Student(15,"Venkat",920));
		hm.put("Haryana",new Student(16,"Dinesh",910));
		hm.put("Kerla",new Student(18,"Srinu",880));
	
		Collection<Student> col =  hm.values();
		List<Student> students = new ArrayList<>(col);
		for(Student stu : students) {
		System.out.println("Roll : "+stu.getRoll());
		System.out.println("Name : "+ stu.getName());
		System.out.println("Marks : "+stu.getMark());
		System.out.println("++++++++++++++++++++++++++++");
		}
	}
	
}
