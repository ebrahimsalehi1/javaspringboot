package com.ebi.salehi.testing.TreeDataSample;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Test1 {

	public static void main(String[] args) {

		System.out.println("Start");
		List<Integer> list = new ArrayList<Integer>();
		for(int i=0;i<15;i++) {
			list.add(i);
		}
		
		int size=5;
		int page=40;

		List<Integer> list1 =  null;
		if(page*size+size>list.size()) {					
			list1 = list.subList(page*size, list.size());
		}
		else {
			list1 = list.subList(page*size, page*size+size);
		}
		
		for(int i=0;i<list1.size();i++) {
			System.out.println(list1.get(i));
		}

	}

}
