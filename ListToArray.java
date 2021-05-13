package com.collections;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class ListToArray{
	public static void main(String[] args) {

	        List<String> list = new ArrayList<String>();
	        list.add("Rashi");
	        list.add("Anusha");
	        list.add("harika");
	        list.add("Anusha");
	  
	        String[] arr = list.toArray(new String[0]);
	  
	        for (String x : arr)
	            System.out.print(x + " ");
	    }
	}