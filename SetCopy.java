package com.collections;

import java.util.HashSet;

public class SetCopy {

	public static void main(String[] args) {
		HashSet<Integer> hs=new HashSet<Integer>();
		HashSet<Integer> hashset=new HashSet<Integer>();
		hs.add(34);
		hs.add(45);
		hs.add(67);
		hs.add(87);
	hs.forEach(x->System.out.println(x));
		hashset = (HashSet) hs.clone();
		hs.forEach(x -> System.out.println(x));
	}

}
