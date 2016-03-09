package com.cmq.java8;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Stream;
/**
 * java8-lambda-exec
 * author:Jarden Chen
 * Mar,9,2016
 *
 * */
public class JavaNewFeatrue {

	public static void main(String[] args) {
		
		String name="jarden";
//		int num=1;
		Thread tt=new Thread(()->System.out.println(name));
		tt.start();
		
//		name.chars()
		List<Artist> list=new ArrayList<>();
		list.add(new Artist("talor", "USA", null));
		list.add(new Artist("leon", "China", null));
		list.add(new Artist("jarden", "Germany", null));
		
	/*	list.stream()
			.min(Comparator.comparing(num->num))
			.get();
		*/
		ThrChapTest tct=new ThrChapTest();
		tct.addUp(Stream.of(1,2,3,4,5));
		
		Map<String,String> map=tct.getNameAndNation(list);
		
		for(Map.Entry<String, String> art:map.entrySet())
			System.out.println(art.getKey()+"  "+art.getValue());
		
		List<Album> albums=new ArrayList<>();
		ArrayList<String> tr1=new ArrayList<>();
		tr1.add("cry on my shoulders");
		tr1.add("love");
		tr1.add("love story");
		tr1.add("hahhahah");
		albums.add(new Album("cry", tr1,new ArrayList<>()));
		
		List<Album>li=tct.getAlbumLessNumber(albums);
		
		li.stream()
		  .forEach(ar->System.out.println(ar.getTracks().get().toString()));
	}

}
