package com.cmq.java8;

import java.util.List;
import java.util.Map;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;
/**
 * java8-lambda-exec
 * author:Jarden Chen
 * Mar,9,2016
 *
 * */
public class ThrChapTest {

	/**
	 * 3.9 1.a
	 * */
	public void addUp(Stream<Integer> numbers)
	{
		int count=numbers.reduce(0,(acc,element)->acc+element)
			   .intValue();
		System.out.println(count);
	}
	
	/**
	 * 3.9 1.b
	 * */
	public Map<String,String> getNameAndNation(List<Artist> list)
	{
		return list.stream()
			.collect(Collectors.toMap(art->art.getName().get(),art->art.getNation().get()));
	}
	
	/**
	 * 3.9 1.c
	 * */
	public List<Album> getAlbumLessNumber(List<Album> albums)
	{
		return albums.stream()
			 .filter(album->album.getTracks().get().size()<=3)
			 .collect(Collectors.toList());
	}
	
	/**
	 * 3.9 2
	 * */
	public int getTotalMembers(List<Artist> artists)
	{
		return artists.stream()
					   .map(art->art.getMembers().get().size())
					   .reduce(0, (acc, elem) -> acc+elem);	
	}
	
	/**
	 * 3.9 3
	 * */
	//a.====eager
	//b.====lazy
	
	/**
	 * 3.9 4
	 * */
	//a.====yes 
	//b.====no
	
	/**
	 * 3.9 5
	 * */
	//yes
	
	/**
	 * 3.9 6
	 * */
	
}
