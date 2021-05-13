package com.collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayToList {

		public static <String> List<String> convertToList(String inputArray[])
	    {
			List<String> list = new ArrayList<>();//creating empty list
			for (String s : inputArray) {
	            list.add(s);
	        }
			return list;
			
		}

		public static void main(String[] args) {
			String array[] = { "Rasheeda", "anusha","pavani","harika" };
			System.out.println(Arrays.toString(array));
			List<String> l = convertToList(array);
			System.out.println("List :"+l);
		}


}
