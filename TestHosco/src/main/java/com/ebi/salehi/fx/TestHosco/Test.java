package com.ebi.salehi.fx.TestHosco;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		List<String> list = new ArrayList();
//		list = Arrays.asList("page:0","namLocation:sfgdegdf","size:10","filter:the filter is ok");
//		list.forEach(item->{
//			if(item.startsWith("namLocation"))
//				System.out.println(item);
//		});
		
		String myStr = "abc&cdef&ghijk&lmn&op&q&rst&uvwx&yz";
		//myStr.split("&")
		List<String> list = Arrays.asList(myStr.split("&"));
		list.stream().filter(item->item.startsWith("yz")).forEach(System.out::println);
		Stream<String> str = list.stream().filter(item->item.startsWith("yz"));
		System.out.println(str.toArray().length);
	
		//System.out.println(str.toArray()[0]);
//		list.forEach(item->{
//			System.out.println("item-"+item);
//		});
		
		
	}

}

