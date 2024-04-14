package com.assignment14;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Program5 {
	    private int id;
	    private String name;

	    public Program5(int id, String name) {
	        this.id = id;
	        this.name = name;
	    }

	    public int getId() {
	        return id;
	    }

	    public void setId(int id) {
	        this.id = id;
	    }

	    public String getName() {
	        return name;
	    }

	    public void setName(String name) {
	        this.name = name;
	    }

	    @Override
	    public String toString() {
	        return "MyClass{"+"id=" + id +", name='" + name + '\'' +'}';
	    }
	}

class IdComparator implements Comparator<Program5> {
    @Override
    public int compare(Program5 o1, Program5 o2) {
        return Integer.compare(o1.getId(), o2.getId());
    }
}

	 class ComparatorClass {
	    public static void main(String[] args) {
	       
	        ArrayList<Program5> myList = new ArrayList<>();
	        myList.add(new Program5(3, "kokila"));
	        myList.add(new Program5(1, "initha"));
	        myList.add(new Program5(2, "gukku"));

	        
	        System.out.println("Original List:");
	        for (Program5 obj : myList) {
	            System.out.println(obj);
	        }

	        
	        Collections.sort(myList, new IdComparator());

	        
	        System.out.println("\nSorted List:");
	        for (Program5 obj : myList) {
	            System.out.println(obj);
	        }
	    }
	}