package com.cmq.java8;

import java.util.ArrayList;
import java.util.Optional;
/**
 * 表示艺术家
 * */
public class Artist {

	private String name;
	private String nation;
	private ArrayList<String> members;
	
	public Artist(String name,String nation,ArrayList<String> members)
	{
		this.name=name;
		this.nation=nation;
		this.members=members;
	}
	
	public void setName(String name)
	{
		this.name=name;
	}
	
	public Optional<String> getName()
	{
		return Optional.ofNullable(name);
	}
	
	public void setNation(String nation)
	{
		this.nation=nation;
	}
	
	public Optional<String> getNation()
	{
		return Optional.ofNullable(nation);
	}
	
	public void setMembers(ArrayList<String> members)
	{
		this.members=members;
	}
	
	public Optional<ArrayList<String>> getMembers()
	{
		return Optional.ofNullable(members);
	}
}
