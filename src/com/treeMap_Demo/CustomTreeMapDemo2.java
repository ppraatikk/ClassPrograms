package com.treeMap_Demo;
import java.util.*;

class Test implements Comparable<Test>{
	int id;
	String subj;
	int marks;
	public Test(int id, String subj, int marks) {
		super();
		this.id = id;
		this.subj = subj;
		this.marks = marks;
	}
	@Override
	public String toString() {
		return "Test [id=" + id + ", subj=" + subj + ", marks=" + marks + "]";
	}
	public int compareTo(Test t)
	{
		return t.id-this.id;
	}
}
public class CustomTreeMapDemo2 {

	public static void main(String[] args) {
		
		TreeMap<Test,Integer>tm=new TreeMap<>();
		
		tm.put(new Test(1,"Phy",98), 101);
		tm.put(new Test(2,"Math",53), 102);
		tm.put(new Test(3,"Che",82), 103);
		tm.put(new Test(4,"Geo",78), 104);
		
		System.out.println(tm);
	}

}
