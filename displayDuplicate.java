package com.collections;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class displayDuplicate {
	public static void main(String[] args) {
		
		List<Integer> duplicateList=new ArrayList<>();
    duplicateList.add(33);
    duplicateList.add(45);
    duplicateList.add(45);
    duplicateList.add(89);
    duplicateList.add(33);
    duplicateList.add(47);
    duplicateList.add(21);
    duplicateList.add(45);
   
   
    Set<Integer> sourcelist=new HashSet<Integer>();
    Set<Integer> targetlist=new HashSet<Integer>();
   
    for(Integer x: duplicateList) {
        if(sourcelist.add(x)) {
           
        }
        else {
            targetlist.add(x);
            }
    }
    System.out.println(targetlist);
}
}
